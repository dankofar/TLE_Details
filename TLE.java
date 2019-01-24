/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geocentrix;

/**
 *
 * @author dkfloza
 */
public class TLE {
    //Inclination, Right Ascension, Eccentricity, Perigee, and Mean Motion

    //TLE Line 1
    String Satellite_Number_TLE_1;
    String Classification;
    String International_Designator_launch_year; //Last two digits of launch year
    String International_Designator_launch_number_of_year;  //Launch number of the year
    String Epoch_Year;
    String Epoch;
    String First_Time_Derivative_of_the_Mean_Motion;
    String Second_Time_Derivative_of_Mean_Motion;
    String BSTAR_drag_term;
    String Ephemeris_Type;
    String Element_number;

    //TLE Line 2
    String Satellite_Number_TLE_2;
    String Inclination; //Degrees
    String Right_Ascension_of_the_Ascending_Node; //Degrees
    String Eccentricity; //Decimal point assumed
    String Argument_of_Perigee; //Degrees
    String Mean_Anomaly; //Degrees
    String Mean_Motion; //Revs per day
    String Revolution_number_at_epoch; //Revs
    String Checksum;
    String period;

    public TLE() {
    }

    public TLE(String id, String Inclination, String Right_Ascension_of_the_Ascending_Node, String Eccentricity, String Argument_of_Perigee, String Mean_Motion) {
        this.Satellite_Number_TLE_2 = id;
        this.Inclination = Inclination;
        this.Right_Ascension_of_the_Ascending_Node = Right_Ascension_of_the_Ascending_Node;
        this.Eccentricity = Eccentricity;
        this.Argument_of_Perigee = Argument_of_Perigee;
        this.Mean_Motion = Mean_Motion;
        this.period = Double.toString((1440 / Double.parseDouble(Mean_Motion)));

    }

    public String getSatellite_Number_TLE_1() {
        return Satellite_Number_TLE_1;
    }

    public void setSatellite_Number_TLE_1(String Satellite_Number_TLE_1) {
        this.Satellite_Number_TLE_1 = Satellite_Number_TLE_1;
    }

    public String getClassification() {
        return Classification;
    }

    public void setClassification(String Classification) {
        this.Classification = Classification;
    }

    public String getInternational_Designator_launch_year() {
        return International_Designator_launch_year;
    }

    public void setInternational_Designator_launch_year(String International_Designator_launch_year) {
        this.International_Designator_launch_year = International_Designator_launch_year;
    }

    public String getInternational_Designator_launch_number_of_year() {
        return International_Designator_launch_number_of_year;
    }

    public void setInternational_Designator_launch_number_of_year(String International_Designator_launch_number_of_year) {
        this.International_Designator_launch_number_of_year = International_Designator_launch_number_of_year;
    }

    public String getEpoch_Year() {
        return Epoch_Year;
    }

    public void setEpoch_Year(String Epoch_Year) {
        this.Epoch_Year = Epoch_Year;
    }

    public String getEpoch() {
        return Epoch;
    }

    public void setEpoch(String Epoch) {
        this.Epoch = Epoch;
    }

    public String getFirst_Time_Derivative_of_the_Mean_Motion() {
        return First_Time_Derivative_of_the_Mean_Motion;
    }

    public void setFirst_Time_Derivative_of_the_Mean_Motion(String First_Time_Derivative_of_the_Mean_Motion) {
        this.First_Time_Derivative_of_the_Mean_Motion = First_Time_Derivative_of_the_Mean_Motion;
    }

    public String getSecond_Time_Derivative_of_Mean_Motion() {
        return Second_Time_Derivative_of_Mean_Motion;
    }

    public void setSecond_Time_Derivative_of_Mean_Motion(String Second_Time_Derivative_of_Mean_Motion) {
        this.Second_Time_Derivative_of_Mean_Motion = Second_Time_Derivative_of_Mean_Motion;
    }

    public String getBSTAR_drag_term() {
        return BSTAR_drag_term;
    }

    public void setBSTAR_drag_term(String BSTAR_drag_term) {
        this.BSTAR_drag_term = BSTAR_drag_term;
    }

    public String getEphemeris_Type() {
        return Ephemeris_Type;
    }

    public void setEphemeris_Type(String Ephemeris_Type) {
        this.Ephemeris_Type = Ephemeris_Type;
    }

    public String getElement_number() {
        return Element_number;
    }

    public void setElement_number(String Element_number) {
        this.Element_number = Element_number;
    }

    public String getSatellite_Number_TLE_2() {
        return Satellite_Number_TLE_2;
    }

    public void setSatellite_Number_TLE_2(String Satellite_Number_TLE_2) {
        this.Satellite_Number_TLE_2 = Satellite_Number_TLE_2;
    }

    public String getInclination() {
        return Inclination;
    }

    public void setInclination(String Inclination) {
        this.Inclination = Inclination;
    }

    public String getRight_Ascension_of_the_Ascending_Node() {
        return Right_Ascension_of_the_Ascending_Node;
    }

    public void setRight_Ascension_of_the_Ascending_Node(String Right_Ascension_of_the_Ascending_Node) {
        this.Right_Ascension_of_the_Ascending_Node = Right_Ascension_of_the_Ascending_Node;
    }

    public String getEccentricity() {
        return Eccentricity;
    }

    public void setEccentricity(String Eccentricity) {
        this.Eccentricity = Eccentricity;
    }

    public String getArgument_of_Perigee() {
        return Argument_of_Perigee;
    }

    public void setArgument_of_Perigee(String Argument_of_Perigee) {
        this.Argument_of_Perigee = Argument_of_Perigee;
    }

    public String getMean_Anomaly() {
        return Mean_Anomaly;
    }

    public void setMean_Anomaly(String Mean_Anomaly) {
        this.Mean_Anomaly = Mean_Anomaly;
    }

    public String getMean_Motion() {
        return Mean_Motion;
    }

    public void setMean_Motion(String Mean_Motion) {
        this.Mean_Motion = Mean_Motion;
    }

    public String getRevolution_number_at_epoch() {
        return Revolution_number_at_epoch;
    }

    public void setRevolution_number_at_epoch(String Revolution_number_at_epoch) {
        this.Revolution_number_at_epoch = Revolution_number_at_epoch;
    }

    public String getChecksum() {
        return Checksum;
    }

    public void setChecksum(String Checksum) {
        this.Checksum = Checksum;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public void report() {

        System.out.println("2013"
                + "," 
                + getSatellite_Number_TLE_2()
                + ","
                + removeZeros_Spaces(getInclination())
                + ","
                + removeZeros_Spaces(getRight_Ascension_of_the_Ascending_Node())
                + ","
                + formatEccentricity(getEccentricity())
                + ","
                + removeZeros_Spaces(getArgument_of_Perigee())
                + ","
                + removeZeros_Spaces(getMean_Motion())
                + ","
                + getPeriod()
        );
    }

    public String removeZeros_Spaces(String data) {
        String tmp = data;
        if (data.charAt(0) == '0' || data.charAt(0) == ' ' || data.charAt(data.length() - 1) == ' ') {
            tmp = tmp.substring(1, tmp.length() - 1);
            removeZeros_Spaces(tmp);
        }

        return tmp;
    }

    public String formatEccentricity(String data) {
        String tmp = data;
        if (tmp.charAt(0) == '0') {
            tmp = "0." + tmp;
        }
        return tmp;
    }

}
