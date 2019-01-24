/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geocentrix;

import java.io.File;
import java.io.IOException;
import static java.sql.DriverManager.println;
import java.util.*;

/**
 *
 * @author dkfloza
 */
public class Geocentrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       TLE tle = null;
       int count = 0 ;
       
       
       File file = new File("/Users/dkfloza/NetBeansProjects/Geocentrix/src/geocentrix/init");
       try{
          System.out.println("Year,Satelite Id,Inclination,Right Ascension,Eccentricity,Perigee,Mean Motion,period"); 
          
          Scanner scan = new Scanner(file);
          
          
          while(scan.hasNext() ){
              String first_line = scan.nextLine();
              String second_line = scan.nextLine();
             
              
              tle = new TLE(second_line.substring(2, 7), second_line.substring(8, 17), second_line.substring(16, 26), second_line.substring(26, 33), second_line.substring(34, 43), second_line.substring(51, 64));
              tle.report();
              count++;
         
            }
          
       }catch(IOException e){
           System.out.println("The error is: " + e);
       }
      
       
       
       System.out.println("count is: " + count);
        
    }
    
        
    
}
