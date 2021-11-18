package com.Documents;

import java.util.ArrayList;


public class CarMethods {
    // Using ArrayList because it makes it easier to solve this task
    // Easier because i could use the commands add and remove so i makes it easy to play with the car register
    private ArrayList<Car> cars = new ArrayList<Car>();

    public CarMethods(){
        cars = new ArrayList<Car>();

    }

    /**
     * Method to register a new car
     * @param price
     * @param yearMade
     * @param fuel
     * @param gear
     * @param horsepower
     * @param colorOfCar
     * @return Info about the new car added
     */
    public ArrayList<Car> registerNewCar(double price, int yearMade, String fuel, String gear, int horsepower, String colorOfCar){
        ArrayList<Car> rNC = new ArrayList<>(cars);
        Car newRegisteredCar = new Car(price, yearMade, fuel, gear, horsepower,colorOfCar);
        cars.add(newRegisteredCar);

        return rNC;
    }

    /**
     * Method to find car by three different statements
     * @param yearMade
     * @param colorOfCar
     * @param fuel
     * @return Cars that have the three different statements in a new ArrayList
     */
    public ArrayList<Car> findCar(int yearMade,String colorOfCar, String fuel ){
        ArrayList<Car> fC = new ArrayList<>();
        for(int i = 0; i < cars.size(); i++){
            if (cars.get(i).getYearMade() == (yearMade) && cars.get(i).getColorOfCar().equals(colorOfCar) && cars.get(i).getFuel().equals(fuel)) {
                fC.add(cars.get(i));
            }
        }
        return fC;
    }

    /**
     * Method to find car by looking at the price
     * @param price
     * @return Cars that have the save price or lower (It does make more sense to give out cars that have a lower price as well because it will also be in the customers price range)
    in a new ArrayList
     */
    public ArrayList<Car> findCarPrice(double price){
        ArrayList<Car> fCP = new ArrayList<>();
        for(int i = 0; i < cars.size(); i++){
            if(cars.get(i).getPrice() <= price){
                fCP.add(cars.get(i));
            }
        }
        return fCP;
    }

    /**
     * Method to remove cars
     * @param price
     * @param yearMade
     * @param fuel
     * @param gear
     * @param horsepower
     * @param colorOfCar
     * @return null
     */
    public String removeCar(double price, int yearMade, String fuel, String gear, int horsepower, String colorOfCar){
        for(int i = 0; i < cars.size(); i++){
            if(cars.get(i).getPrice() == (price) && cars.get(i).getYearMade() == (yearMade) && cars.get(i).getFuel().equals(fuel) && cars.get(i).getGear().equals(gear) && cars.get(i).getHorsepower() == (horsepower) && cars.get(i).getColorOfCar().equals(colorOfCar)){
                String info = cars.get(i).toString();
                cars.remove(i);
                return info;
            }
        }
        return null;
    }

    /**
     * A method to return all the cars registered
     * @return All cars registered in a new ArrayList
     */
    public ArrayList<Car> getCarsRegistered(){
        ArrayList<Car> gCR = new ArrayList<>();
        for(int i = 0; i < cars.size(); i++){
            gCR.add(cars.get(i));
        }
        return gCR;
    }

    /**
     * Method to find cars that have the same model of year or older
     * @param yearMade
     * @return Cars that have the same year or older in a new ArrayList
     */
    public ArrayList<Car> findCarYearModel(int yearMade){
        ArrayList<Car> fCYM = new ArrayList<>();
        for(int i = 0; i < cars.size(); i++){
            if(cars.get(i).getYearMade() <= yearMade){
                fCYM.add(cars.get(i));
            }
        }
        return fCYM;
    }

    /**
     * toString method
     * @return String with cars
     */
    @Override
    public String toString() {
        return "carMethods{" +
                "cars=" + cars +
                '}';
    }
}

