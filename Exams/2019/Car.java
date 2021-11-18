package com.Documents;

public class Car {

    private String regNr;
    private int yearMade;
    private String colorOfCar;
    private String gear;
    private String fuel;
    private double price;
    private int horsepower;
    private String brand;

    /**
     * New Car
     * This one can be used if the firm would like to register a new car with also registration plate
     * @param regNr
     * @param yearMade
     * @param colorOfCar
     * @param gear
     * @param fuel
     * @param price
     * @param horsepower
     * @param brand
     */
    public Car(String regNr,int yearMade, String colorOfCar, String gear, String fuel, double price, int horsepower, String brand){

        this.regNr = regNr;
        this.yearMade =  yearMade;
        this.colorOfCar = colorOfCar;
        this.gear = gear;
        this.fuel = fuel;
        this.price = price;
        this.horsepower = horsepower;
        this.brand = brand;

    }

    /**
     * New Car
     * Had to do this to be able to send the necessary information to the new car register method,
     * since we where not suppose register a new car with no other then price, year, fuel, gear and horsepower
     * However i needed to add so the user could type in the color of the car since we where supposed to
     * make a method to search for a car using color, fuel and the year the car was made
     * @param price
     * @param yearMade
     * @param fuel
     * @param gear
     * @param horsepower
     * @param colorOfCar
     */
    public Car(double price, int yearMade, String fuel, String gear, int horsepower, String colorOfCar) {
        this.price = price;
        this.yearMade = yearMade;
        this.fuel = fuel;
        this.gear = gear;
        this.horsepower = horsepower;
        this.colorOfCar = colorOfCar;
    }

    /**
     * Get the registration number
     * @return the registration number
     */
    public String getRegNr() {
        return regNr;
    }

    /**
     * Get the year the car was made
     * @return The year the car was made
     */
    public int getYearMade() {
        return yearMade;
    }

    /**
     * Get the color of the car
     * @return The color of the car
     */
    public String getColorOfCar() {
        return colorOfCar;
    }

    /**
     * Get the type of gear the car has
     * @return The type of gear
     */
    public String getGear() {
        return gear;
    }

    /**
     * Get the type of the fuel the car uses
     * @return The type of the fuel
     */
    public String getFuel() {
        return fuel;
    }

    /**
     * Get the price of the car
     * @return The price of the car
     */
    public double getPrice() {
        return price;
    }

    /**
     * Get total horsepower of the car
     * @return Total horsepower
     */
    public int getHorsepower() {
        return horsepower;
    }

    /**
     * Get the type
     * @return
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Set method in case the car is being sold to someone in the future
     * @param nameOfNewOwner
     */
    public void setNewOwner(String nameOfNewOwner){
///and then like this: return this.owner = nameOfNewOwner
        //this.owner would have been the firm that sells the car
        //However we did not get ask to set a owner for now
    }

    /**
     * The car will decrease in price over time therefore can this setmethod come in handy
     * @param newPrice
     * @return New price for car
     */
    public double setNewPrice(double newPrice){
        return this.price = newPrice;
    }

    /**
     * Get info about the car
     * @return String with price, the year the car was made, fuel, gear and horsepower
     */
    @Override
    public String toString() {
        return price + "::" + yearMade + "::" + fuel + "::" + gear + "::" + horsepower;
    }
}
