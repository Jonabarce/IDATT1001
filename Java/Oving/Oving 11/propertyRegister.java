package com.Documents;

import java.util.ArrayList;

public class propertyRegister {

    private ArrayList<property> properties = new ArrayList<property>();


    public propertyRegister() {
        properties = new ArrayList<property>();
    }

    /**
     * Add a new property to the register
     * @param municipalityNumber
     * @param municipalityName
     * @param lotNumber
     * @param sectionNumber
     * @param name
     * @param area
     * @param nameOfOwner
     * @return Info about the new property added
     */
    public ArrayList<property> RegisterNewProperty(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber, String name, double area, String nameOfOwner){
        ArrayList<property> RNP = new ArrayList<>(properties); //instead of just returning properties add it in a new array
        property property = new property(municipalityNumber, municipalityName, lotNumber, sectionNumber, name, area, nameOfOwner);
        properties.add(property);

        /*
        RNP.addAll(properties); This is also a way to do it

        for(int i = 0; i < properties.size(); i++){ Possible to do it this way as well
            if(properties.size() > 0){
            RNP.add(properties.get(i));
            }
        }
        */

        return RNP;
    }

    /**
     * Remove property
     * @param property
     * @return Info about the property that got removed
     */
    public String RemoveProperty(property property){
        for(int i = 0; i < properties.size(); i++){
            if(properties.get(i) == property ){
                String info = properties.get(i).toString();
                properties.remove(i);
                return info;
            }
        }

        return null;
    }

    /**
     * Method to get total properties in the register
     * @return Total properties
     */
    public int getTotalProperties(){
        return properties.size();
    }

    /**
     * Find properties by muncipality number, lot number and section number
     * @param municipalityNumber
     * @param lotNumber
     * @param sectionNumber
     * @return new ArrayList with the properties that was found (if any is found)
     */
    public ArrayList<property> FindProperties(int municipalityNumber, int lotNumber, int sectionNumber){
        ArrayList<property> FP = new ArrayList<>();
        for (int i = 0; i < properties.size(); i++) {
            if (properties.get(i).getMunicipalityNumber() == (municipalityNumber) && properties.get(i).getLotNumber() == (lotNumber)
                    && properties.get(i).getSectionNumber() == (sectionNumber)) {
                FP.add(properties.get(i));
            }
        }
        return FP;
    }

    /**
     * Method to find the Average Area for the properties in the ArrayList
     * @return Average Area
     */
    public double AverageArea(){
        double totalAreal = 0;
        for(int i = 0; i < properties.size(); i++){
            totalAreal += properties.get(i).getArea();
        }
        double averageArea = totalAreal / getTotalProperties();
        return averageArea;
    }

    /**
     * Method to find Properties with the same lot number
     * @param lotNumber
     * @return new ArrayList with the properties that was found (if any is found)
     */
    public ArrayList<property> FindPropertiesWithLotNumber(int lotNumber) {
        ArrayList<property> pwln = new ArrayList<>();
        for(int i = 0; i < properties.size(); i++){
            if(properties.get(i).getLotNumber() == (lotNumber)){
                pwln.add(properties.get(i));
            }
        }
        return pwln;
    }

    /**
     * Method to print out all properties
     * @return properties registered in the ArrayList
     */
    public ArrayList<property> PrintAllProperties(){
        ArrayList<property> pap = new ArrayList<>();
        for(int i = 0; i < properties.size(); i++) {
            pap.add(properties.get(i));
            }
            return pap;
        }

    /**
     * toString method
     * @return properties
     */
    @Override
    public String toString() {
        return "propertyRegister{" +
                "properties=" + properties +
                '}';
    }


}