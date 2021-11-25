package com.Documents;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

import static java.time.temporal.ChronoField.*;

public class COVIDregistering {

    private int year;
    private int month;
    private int dayOfMonth;
    private final String country;
    private int infected;
    private int deaths;

    /**
     * Constructor for a new COVID case
     * @param year
     * @param month
     * @param dayOfMonth
     * @param country
     * @param infected
     * @param deaths
     */
    public COVIDregistering(int year,int month,int dayOfMonth, String country, int infected, int deaths) {
        if (infected < 0) {
            throw new IllegalArgumentException(" Total new infected must be 0 or greater");
        }
        if (deaths < 0) {
            throw new IllegalArgumentException(" Total new dead people must be 0 or greater");
        }
        this.year = year;
        this.month = month;
        this.dayOfMonth = dayOfMonth;
        this.country = country;
        this.infected = infected;
        this.deaths = deaths;
    }

    /**
     * Get the year
     * @return the year
     */
    public int getYear(){
        return year;
    }

    /**
     * Get the month of the year
     * @return the month of the year
     */
    public int getMonth(){
        return month;
    }

    /**
     * Get the day of the month
     * @return the day of the month
     */
    public int getDayOfMonth(){
        return dayOfMonth;
    }

    /**
     * Method to get the full date saved in LocalDate
     * @return The full date in LocalDate
     */
    public ChronoLocalDate getDate (){

       int year = (int) YEAR.checkValidValue(getYear());
       int month = (int) MONTH_OF_YEAR.checkValidValue(getMonth());
       int dayOfMonth = (int) DAY_OF_MONTH.checkValidValue(getDayOfMonth());

        LocalDate a = LocalDate.of(year,month,dayOfMonth);


        return a;
    }

    /**
     * Method to get country
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Method to get a int of total infected people that day
     * @return total infected that day
     */
    public int getInfected() {
        return infected;
    }

    /**
     * Method to get a int of total deaths
     * @return total deaths that day
     */
    public int getDeaths() {
        return deaths;
    }

    /**
     * Get info about the COVID case
     * @return String with date, the country, total infected that date, and total deaths that day
     */
    @Override
    public String toString() {
        return "Date: " + getDate() + "" + "Country: " + country + "" + "Infected: " + infected + "" + "Deaths: " + deaths +
                '}';
    }
}

