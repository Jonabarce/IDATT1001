package com.Documents;

import java.util.ArrayList;

public class Mushroomregister {

    private ArrayList<MushroomArt> MushroomArts = new ArrayList<MushroomArt>();


    public Mushroomregister() {
        MushroomArts = new ArrayList<MushroomArt>();
    }

    /**
     * Register a new soppart
     * @param name
     * @param description
     * @param edible
     */
    public void registerNewMushRoomArt(String name, String description, String edible){
        boolean nameTrue = false;
        for(int i = 0; i < MushroomArts.size(); i++){
            if(MushroomArts.get(i).getName().equals(name)){
                nameTrue = true;
            }
        }
        if(!nameTrue){
            MushroomArt newMushroomArt = new MushroomArt(name,description,edible);
            MushroomArts.add(newMushroomArt);
        } else{
            System.out.println(" Error! This Arrangemnet does already exist ");
        }
    }

    /**
     * Method to print all Sopparter
     * @return All sopparter in new ArrayList
     */
    public ArrayList<MushroomArt> printAllMushroomArts(){
        ArrayList<MushroomArt> pAS = new ArrayList<>();
        for(int i = 0; i < MushroomArts.size(); i++) {
            pAS.add(MushroomArts.get(i));
        }
        return pAS;
    }

    /**
     * Method to print out information about all register sopparter listed from n --> n+1
     * @return String test
     */
    public String printInformationAboutAllRegisteredMushRoomArts(){
        String test = "";
        for(int i = 0; i < MushroomArts.size(); i++){
            test+= Integer.toString(i +1) + MushroomArts.get(i);

        }
        return test;
    }



    /**
     * Method to see if a String contains in the description of the soppart
     * @param anything
     * @return New ArrayList with the soppart that has the description that matches with the string
     */
    public ArrayList<MushroomArt> findAllMuhsroomArts(String anything){
        ArrayList<MushroomArt> fAS = new ArrayList<>();
        for(int i = 0; i < MushroomArts.size(); i++) {
            if (MushroomArts.get(i).getDescription().contains(anything)) {
                fAS.add(MushroomArts.get(i));
            }
        }
        return fAS;
    }

    @Override
    public String toString() {
        return "Soppregister{" +
                "sopparter=" + MushroomArts +
                '}';
    }
}
