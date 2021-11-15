package com.Documents;

import java.util.Scanner;

public class menuProperty {


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        propertyRegister pr = new propertyRegister();

        System.out.println(" Welcome to the Property Register ");
        System.out.println(" Press 1 to continue or press 2 to quit ");
        int choice = input.nextInt();

        if(choice == 1){
            boolean go = true;
            while (go){
                System.out.println(" Press 1 to register a new property ");
                System.out.println(" Press 2 to print out all properties that are registered ");
                System.out.println(" Press 3 to search for a specific property");
                System.out.println(" Press 4 to calculate average areal across all registered properties");
                System.out.println(" Press 5 to exit the program");
                int choice2 = input.nextInt();

                if(choice2 == 1){ // Register a new property
                        System.out.println("REGISTER A NEW PROPERTY IS NOW SELECTED");

                        System.out.println(" Please type in municipality number (101 - 5054) ");
                        int municipalityNumber = input.nextInt();

                        System.out.println(" Please write in the municipality name ");
                        input.nextLine(); // To prevent it from jumping over this in console while running the program
                        String municipalityName = input.nextLine();

                        System.out.println(" Please type in the lot number greater then 0");
                        int lotNumber = input.nextInt();

                        System.out.println(" Please write in the section number greater then 0 ");
                        int sectionNumber = input.nextInt();

                        System.out.println(" Please write in the name of the property ");
                        System.out.println(" If it does not exist then just hit enter ");
                        input.nextLine(); // To prevent it from jumping over this in console while running the program
                        String name = input.nextLine();

                        System.out.println(" Please write in the area in m2 ");
                        double area = input.nextDouble();

                        System.out.println(" Please write in the name of the owner of the property ");
                        input.nextLine(); // To prevent it from jumping over this in console while running the program
                        String nameOfOwner = input.nextLine();


                        property newProperty = new property(municipalityNumber,municipalityName,lotNumber,sectionNumber,name, area, nameOfOwner );
                        pr.RegisterNewProperty(municipalityNumber,municipalityName,lotNumber,sectionNumber,name, area, nameOfOwner);

                        System.out.println(" New property is now registered ");

                }

                if(choice2 == 2){ // Print out all properties that are registered

                    System.out.println(pr.PrintAllProperties().toString());
                    System.out.println("Total properties registered is:" + pr.getTotalProperties());
                }

                if(choice2 == 3){ // Search for a specific property
                    System.out.println(" Please type in the municipality number ");
                    int municipalityNumber = input.nextInt();

                    System.out.println(" Please type in the lot number ");
                    int lotNumber = input.nextInt();

                    System.out.println(" Please type in the section number");
                    int sectionNumber = input.nextInt();

                    System.out.println(pr.FindProperties(municipalityNumber,lotNumber,sectionNumber).toString());



                }

                if(choice2 == 4){ // Calculate average areal across all registered properties

                    System.out.println(pr.AverageArea() + "m2");
                }

                if(choice2 == 5){ // Exit the program
                    go = false;
                    System.out.println(" Exiting the program....");
                }





            }

        }

        if(choice == 2){ // If not wanting to continue, program stops
            System.out.println(" Bye! Have a nice day. ");
            System.exit(0);
        }


    }













}