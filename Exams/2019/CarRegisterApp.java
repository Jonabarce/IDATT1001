package com.Documents;

import java.util.Scanner;



public class CarRegisterApp {

    /**
     * The main()-method, starting the application
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        CarMethods cM = new CarMethods();

        System.out.println(" Welcome to the car register app");
        System.out.println(" Press 1 to continue or press 2 to quit");
        int choice = input.nextInt();

        if(choice == 1){
            boolean go = true;

            /**
             * Presents the menu for the user, and awaits input form the user. The menu
             * choice selected by the user is being returned.
             */
            while(go){
                System.out.println(" Press 1 to register a new car ");
                System.out.println(" Press 2 to print out all cars ");
                System.out.println(" Press 3 to search for a car by model, color and fuel");
                System.out.println(" Press 4 to search for a car by price ");
                System.out.println(" Press 5 to delete a car from the register ");
                System.out.println(" Press 6 to exit the program");
                int choice2 = input.nextInt();

                /**
                 * Register a new car
                 */
                if(choice2 == 1){
                    System.out.println(" Please type in the price of the car: ");
                    double price = input.nextDouble();

                    System.out.println(" Please write in what year the car was made ");
                    int yearMade = input.nextInt();

                    System.out.println(" Please write in what type of fuel the car uses: ");
                    input.nextLine(); // To prevent it from jumping over this when running the program. It is a bug in java.
                    String fuel = input.nextLine();

                    System.out.println(" Please write in what type of the gearbox it has: ");
                    String gear = input.nextLine();

                    System.out.println(" Please type in total horsepower: ");
                    int horsepower = input.nextInt();

                    System.out.println(" Please write in what type of color the car has ");
                    input.nextLine(); // To prevent it from jumping over this when running the program. It is a bug in java.
                    String colorOfCar = input.nextLine();

                    Car registerNewCar = new Car(price,yearMade,fuel,gear,horsepower,colorOfCar);

                    cM.registerNewCar(price,yearMade,fuel,gear,horsepower,colorOfCar);

                    System.out.println(" A new car is now registered ");
                }

                /**
                 * Print out all cars
                 */
                if(choice2 == 2){
                    System.out.println(" All car registered is: ");
                    System.out.println(cM.getCarsRegistered().toString());
                }
                /**
                 * Search for car by model, color, and fuel
                 */
                if(choice2 == 3){
                    System.out.println(" Please type in the year the car was made ");
                    int yearMade = input.nextInt();

                    System.out.println(" Please write in the color of the car ");
                    input.nextLine(); // To prevent it from jumping over this when running the program. It is a bug in java.
                    String colorOfCar = input.nextLine();

                    System.out.println(" Please write in what type of fuel the car uses ");
                    String fuel = input.nextLine();

                    System.out.println(cM.findCar(yearMade,colorOfCar,fuel).toString());

                }

                /**
                 * Search for car by price
                 */
                if(choice2 == 4){
                    System.out.println(" Please type in a price ");
                    double price = input.nextDouble();

                    System.out.println(cM.findCarPrice(price).toString());
                }

                /**
                 * Remove one car from the register
                 */
                if(choice2 == 5){
                    System.out.println(" Please type in the price of the car: ");
                    double price = input.nextDouble();

                    System.out.println(" Please write in what year the car was made ");
                    int yearMade = input.nextInt();

                    System.out.println(" Please write in what type of fuel the car uses: ");
                    input.nextLine(); // To prevent it from jumping over this when running the program. It is a bug in java.
                    String fuel = input.nextLine();

                    System.out.println(" Please write in what type of the gearbox it has: ");
                    String gear = input.nextLine();

                    System.out.println(" Please type in total horsepower: ");
                    int horsepower = input.nextInt();

                    System.out.println(" Please write in what type of color the car has ");
                    input.nextLine(); // To prevent it from jumping over this when running the program. It is a bug in java.
                    String colorOfCar = input.nextLine();

                    cM.removeCar(price,yearMade,fuel,gear,horsepower,colorOfCar);

                    System.out.println(" The car is now deleted from the register ");
                }
                /**
                 * Exiting the program
                 */
                if(choice2 == 6){ // Exit the program
                    System.out.println(" Exiting the program... ");
                    System.exit(0);
                }

            }

        }
        /**
         * Exiting the program
         */
        if(choice == 2){
            System.out.println(" Exiting the program... ");
            System.exit(0);
        }



    }
}


