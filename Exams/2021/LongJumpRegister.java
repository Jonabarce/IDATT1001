package com.Documents;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;


public class LongJumpRegister {
    // I am choosing to use ArrayList because i believe it makes it easier to solve this task
    // It makes it easier because ArrayList has built in commands such as .add and .remove

    private ArrayList<LongJump> longJumps = new ArrayList<>();

    public LongJumpRegister(){
        longJumps = new ArrayList<LongJump>();
    }

    /**
     * Method to register a new Long Jump
     This method will check if there is already a long jump register with the same
     however if the time is different is will register a new Long Jump
     which makes sense because i belive an athlete is supposed to jump more then one time
     in a completion
     * @param startNumber
     * @param nameOfTheAthlete
     * @param result
     * @param validJump
     * @param hour
     * @param minutes
     * @return True or false (Registered or not)
    to give the user info if it worked or not
     */
    public boolean registerNewLongJump(int startNumber, String nameOfTheAthlete, double result, String validJump, int hour, int minutes){
        LocalTime time = LocalTime.of(hour,minutes);
        boolean worked = false;
        for(int i = 0; i < longJumps.size(); i++){
            if(longJumps.get(i).getStartNumber() == startNumber && longJumps.get(i).getNameOfTheAthlete().equals(nameOfTheAthlete) && longJumps.get(i).getResult() == result && longJumps.get(i).getInfoValidJump().equals(validJump) && time.equals(longJumps.get(i).getFullTime())){
                worked = true;
            }
        }
        if(!worked){
            LongJump newLongJump = new LongJump(startNumber,nameOfTheAthlete,result,validJump,hour,minutes);
            longJumps.add(newLongJump);
            return true;
        }else{
            System.out.println(" Error! A long jump for all this data is already register! Try again");
            return false;
        }

    }
    /**
     * Method to print out all registered long jumps
     * @return String with all the registered long jumps
     */
    public String printOutAllLongJumpsResults(){
        String long_jumps = "";
        for(int i = 0; i < longJumps.size(); i++){
            long_jumps += longJumps.get(i) + "\n";
        }
        return long_jumps;
    }



    /**
     * Method to get total jumps registered
     * @return total jumps registered
     */
    public int getTotalJumpsRegistered(){
        int total = 0;

        return total += longJumps.size();
    }

    /**
     * Method to print out all the results for one athlete
     * @param nameOfTheAthlete
     * @return String with all the registered results for one athlete
     */
    public String printOutAllJumpsForOneAthlete(String nameOfTheAthlete){
        String long_jumps_forTheAthlete = "";
        for(int i = 0; i < longJumps.size(); i++){
            if(longJumps.get(i).getNameOfTheAthlete().equals(nameOfTheAthlete)){
                long_jumps_forTheAthlete += longJumps.get(i).getResult() + " meters" + "\n";
            }
        }
        return long_jumps_forTheAthlete;
    }

    /**
     * Method to find the maximum result in an ArrayList using Java Collections
     I thinked that is had to be a valid jump in order to qualify for best result
     After that is checked i am adding everything that qualifies
     then finding the best result which should be the max
     * @return the highest result in form of a double
     */
    public double printOutBestResult() {
        String validJump = "YES";
        double highestResult = 0;
        ArrayList<Double> bestResult = new ArrayList<>();
        for (int i = 0; i < longJumps.size(); i++) {
            if(longJumps.get(i).getInfoValidJump().toUpperCase(Locale.ROOT).equals(validJump)){
                bestResult.add(longJumps.get(i).getResult());
            }
        }
        return highestResult = Collections.max(bestResult);

    }

    /**
     * Method to find average result among all jumps registered
     * @return Average result
     */
    public double averageResult(){
        double totalResult = 0;
        for(int i = 0; i < longJumps.size(); i++){
            totalResult += longJumps.get(i).getResult();
        }
        double average_result = totalResult / getTotalJumpsRegistered();
        return average_result;
    }

    /**
     * toString method using StringBuilder
     * @return the relevant long jumps
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(LongJump longJump : longJumps){
            sb.append(longJump).append("\n");
        }
        return sb.toString();
    }
}
