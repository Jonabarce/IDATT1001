package com.Documents;

import java.time.LocalDate;
import java.util.ArrayList;

public class COVIDmethods {
    // Using ArrayList because it makes it easier to solve this task
    // Easier because i could use the commands add and remove so i makes it easy to play with the COVID register
    private ArrayList<COVIDregistering> COVIDregisters = new ArrayList<COVIDregistering>();

    public COVIDmethods() {
        COVIDregisters = new ArrayList<COVIDregistering>();
    }

    /**
     * Method to register a new COVID case
     * If the data and country that is sent is already exist it wil return false
     * and not register a new case
     * It does not make sence that a country should be able to register a case twice a day
     * @param year
     * @param month
     * @param dayOfMonth
     * @param country
     * @param infected
     * @param dead
     * @return True or false (Registered or not)
     */
    public boolean registerNewCOVIDCase(int year, int month, int dayOfMonth, String country, int infected, int dead) {
        LocalDate a = LocalDate.of(year, month, dayOfMonth);

        boolean test = false;
        for (int i = 0; i < COVIDregisters.size(); i++) {
            if (a.isEqual(COVIDregisters.get(i).getDate()) && a.equals(COVIDregisters.get(i).getCountry())) {
                test = true;
            }
        }
        if (!test) {
            COVIDregistering newCase = new COVIDregistering(year, month, dayOfMonth, country, infected, dead);
            COVIDregisters.add(newCase);
            return true;
        } else {
            System.out.println(" Error! It is already registered a new COVID case for this date and country ");
            return false;
        }
    }

    /**
     * Method to search for a spesific case by a date given by the user
     * @param year
     * @param month
     * @param dayOfMonth
     * @return Cases (if found) in a new ArrayList
     */
    public ArrayList<COVIDregistering> findCaseByDate(int year, int month, int dayOfMonth) {
        LocalDate a = LocalDate.of(year, month, dayOfMonth);
        ArrayList<COVIDregistering> fBD = new ArrayList<>();
        for (int i = 0; i < COVIDregisters.size(); i++) {
            if (a.isEqual(COVIDregisters.get(i).getDate())) {
                fBD.add(COVIDregisters.get(i));
            }
        }
        return fBD;
    }

    /**
     * Method to search for all dates registered after the date given by the user
     * @param year
     * @param month
     * @param dayOfMonth
     * @return Cases (if found) in a new ArrayList
     */
    public ArrayList<COVIDregistering> findCaseAfterTheDate(int year, int month, int dayOfMonth) {
        LocalDate a = LocalDate.of(year, month, dayOfMonth);
        ArrayList<COVIDregistering> fCAD = new ArrayList<>();
        for (int i = 0; i < COVIDregisters.size(); i++) {
            if (COVIDregisters.get(i).getDate().isAfter(a)) {
                fCAD.add(COVIDregisters.get(i));
            }
        }
        return fCAD;
    }

    /**
     * Method to get total cases registered (an int)
     * @return total registered cases in the COVID register
     */
    public int getTotalCases() {
        int totalCases = 0;

        return totalCases += COVIDregisters.size();
    }

    /**
     * Method to get total dead people for one country
     * @param country
     * @return total dead
     */
    public int getTotalDeadForOneCountry(String country) {
        int totalDead = 0;
        for (int i = 0; i < COVIDregisters.size(); i++) {
            if (COVIDregisters.get(i).getCountry().equals(country)) {
                totalDead += COVIDregisters.get(i).getDeaths();
            }
        }
        return totalDead;
    }

    /**
     * Method to get total dead people among all cases registered
     * @return total dead
     */
    public int getTotalDeadAmongAllCases() {
        int totalDead = 0;
        for (int i = 0; i < COVIDregisters.size(); i++) {
            totalDead += COVIDregisters.get(i).getDeaths();
        }
        return totalDead;
    }

    /**
     * Method to print out all cases from 1 to x
     * @return String with all cases
     */
    public String printOutAll() {
        String test = "";
        for (int i = 0; i < COVIDregisters.size(); i++) {
            test += Integer.toString(i + 1) + COVIDregisters.get(i) + "\n";
        }
        return test;
    }

    /**
     * toString method
     * @return the relevant cases
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(COVIDregistering covidRegistering : COVIDregisters){
            sb.append(covidRegistering).append("\n");
        }
        return (sb.toString());
    }
}
