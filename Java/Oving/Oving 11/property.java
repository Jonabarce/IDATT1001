package com.Documents;

/**
 *
 * @author Jonatan Andre Vevang
 */

public class property {

    private int municipalityNumber;
    private String municipalityName;
    private int lotNumber;
    private int sectionNumber;
    private String name;
    private double area;
    private String nameOfOwner;

    /**
     * New property. Throw new if the user puts in the wrong numbers
     * @param municipalityNumber
     * @param municipalityName
     * @param lotNumber
     * @param sectionNumber
     * @param name
     * @param area
     * @param nameOfOwner
     */
    public property(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber, String name, double area, String nameOfOwner){
        if(municipalityNumber < 101 || municipalityNumber > 5054 ){
            throw new IllegalArgumentException(" Error! MunicipalityNumber must be between 101 and 5054");
        }

        if(lotNumber < 1 || sectionNumber < 1 || area < 1){
            throw new IllegalArgumentException(" The lot number, section number and area must be bigger then 0");
        }

        this.municipalityNumber = municipalityNumber;
        this.municipalityName = municipalityName;
        this.lotNumber = lotNumber;
        this.sectionNumber = sectionNumber;
        this.name = name;
        this.area = area;
        this.nameOfOwner = nameOfOwner;
    }


    /**
     * Get municipality number
     * @return municipality number
     */
    public int getMunicipalityNumber() {
        return municipalityNumber;
    }

    /**
     * Get municipality name
     * @return municipality name
     */
    public String getMunicipalityName(){
        return municipalityName;
    }

    /**
     * Get Lot number
     * @return Lot number
     */
    public int getLotNumber(){
        return lotNumber;
    }

    /**
     * Get Section Number
     * @return Section Number
     */
    public int getSectionNumber(){
        return sectionNumber;
    }

    /**
     * Get the name to the property, if it exists
     * @return name to the property
     */
    public String getName(){
        return name;
    }

    /**
     * Get the area in m2
     * @return area in m2
     */
    public double getArea(){
        return area;
    }

    /**
     * Get the name of Owner
     * @return name of Owner
     */
    public String getNameOfOwner() {
        return nameOfOwner;
    }

    /**
     * Uniq id for property
     * @return kNr-gnr/bnr
     */
    public String getId(){
        return this.municipalityNumber + "-" + this.lotNumber + "/" + this.sectionNumber;
    }

    /**
     * Set method in case of need in the future for possible sales
     * @param newOwner
     * @return newOwner
     */
    public void setNewOwner(String newOwner){
        this.nameOfOwner = newOwner;
    }

    /**
     * Set method in case of need in the future for possible bought more land
     * @param increasedArea
     */
    public void setNewArea(double increasedArea){
        this.area = area + increasedArea;
    }

    /**
     * Get info about the property
     * @return String with municipality number, municipality name, lot number, section number, name of property (if existed), area in m2 and name of owner
     */
    @Override
    public String toString() {
        return "property{" +
                "municipalityNumber=" + municipalityNumber +
                ", municipalityName='" + municipalityName + '\'' +
                ", lotNumber=" + lotNumber +
                ", sectionNumber=" + sectionNumber +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", nameOfOwner='" + nameOfOwner + '\'' +
                '}';
    }
}