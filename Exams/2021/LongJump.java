package com.Documents;

// I just have to say that i chose not to add any mutator methods
// This is because i feel like it is not necessary
// I feel like this is high level competetion and they rarely make mistakes
// For example the results, that is carefully controlled before writing down the results



import java.time.LocalTime;
import java.util.Locale;

public class LongJump {
    private int startNumber;
    private String nameOfTheAthlete;
    private double result;
    private String validJump;
    private int hour;
    private int minutes;


    /**
     * Constructor for a new Long Jump
     * @param startNumber
     * @param nameOfTheAthlete
     * @param result
     * @param validJump
     * @param hour
     * @param minutes
     */
    public LongJump(int startNumber, String nameOfTheAthlete, double result, String validJump, int hour, int minutes){
        String validYes = "YES";
        String validNo  = "NO";

        if(startNumber <= 0 || startNumber > 999){
            throw new IllegalArgumentException(" The start number must be greater then 0 and lower then 1000");
        }
        if(nameOfTheAthlete.isEmpty() == true){
            throw new IllegalArgumentException(" There is no name for the Athlete. It must have a name");
        }
        if(result < 0){
            throw new IllegalArgumentException(" The result cant be negative ");
        }
        if(validJump.isEmpty() == true){
            throw new IllegalArgumentException(" Please type in yes or no. Info about valid jump cant be empty");
        }
        if(!validJump.toUpperCase(Locale.ROOT).equals(validYes) && !validJump.toUpperCase(Locale.ROOT).equals(validNo)){
            throw new IllegalArgumentException(" Please type yes or no");
        }
        if(hour > 12 || hour == 0){
            throw new IllegalArgumentException(" The hour must be between 1 and 12");
        }
        if(minutes > 59 || minutes < 0){
            throw new IllegalArgumentException(" Total minutes must be between 0 and 59");
        }
        this.startNumber = startNumber;
        this.nameOfTheAthlete = nameOfTheAthlete;
        this.result = result;
        this.validJump = validJump;
        this.hour = hour;
        this.minutes = minutes;
    }

    /**
     * Get the start number for the athlete
     * @return the start number for the athlete
     */
    public int getStartNumber() {
        return startNumber;
    }

    /**
     * Get the name of the athlete(First name, Last name)
     * @return the name of the athlete
     */
    public String getNameOfTheAthlete() {
        return nameOfTheAthlete;
    }

    /**
     * Get the result of the jump in meters
     * @return the result of the jump in meters
     */
    public double getResult() {
        return result;
    }

    /**
     * Get the info, was it a valid jump or not
     * @return the info about valid jump or not
     */
    public String getInfoValidJump() {
        return validJump;
    }

    /**
     * Get the total hours of the full time
     * @return total hours of the full time
     */
    public int getHour() {
        return hour;
    }

    /**
     * Get the total minutes of the full time
     * @return total minutes of the full time
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * Register a full time using hour and minutes
     * @return the full time using hour and minutes
    and this is stored in the LocalTime time
     */
    public LocalTime getFullTime(){
        int hour = getHour();
        int minutes = getMinutes();

        LocalTime time = LocalTime.of(hour,minutes);

        return time;
    }

    /**
     * toString method. Get info about the Long Jump
     * @return String with the startnumber, the name of the athlete (First name, last name), the result in meters
    valid jump or not, and the time
     */
    @Override
    public String toString() {
        return "Startnumber: " + startNumber + " Name: " + nameOfTheAthlete + " Result(meter): " + result + " Valid jump: " + validJump + " Time: " + getFullTime();
    }
}
