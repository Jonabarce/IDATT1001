package com.Documents;

import java.util.ArrayList;
import java.util.Scanner;

public class menuRestaurant {




    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        restaurantRegister test = new restaurantRegister();
        System.out.println(" Press 1 to continue or press 2 to quit ");
        int choice = input.nextInt();

        if (choice == 1){
            boolean go = true;
            while (go){
                System.out.println(" Press 1 to register a new dish ");
                System.out.println(" Press 2 to find a specific dish by name ");
                System.out.println(" Press 3 to find all dishes by type ");
                System.out.println(" Press 4 to register a new menu ");
                System.out.println(" Press 5 to find all menus between 2 prices");
                System.out.println(" Press 6 to exit the program ");

                int choice2 = input.nextInt();

                if(choice2 == 1){
                    System.out.println(" Name: ");
                    input.nextLine();
                    String name = input.nextLine();

                    System.out.println(" Type: ");
                    String type = input.nextLine();

                    System.out.println(" Price: ");
                    double price = input.nextDouble();

                    dish newDish = new dish(name, type, price);
                    test.RegisterNewDish(name, type, price);

                    System.out.println(" This is the new dish registered: ");
                    System.out.println(newDish.toString());

                }

                if(choice2 == 2){
                    System.out.println(" Please write in a name ");
                    input.nextLine();
                    String name = input.nextLine();

                    System.out.println(test.DishName(name).toString());

                }

                if(choice2 == 3){
                    System.out.println(" Please write in a type ");
                    input.nextLine();
                    String type = input.nextLine();

                    System.out.println(test.DishType(type).toString());

                }

                if(choice2 == 4){
                    boolean go2 = false;
                    ArrayList<dish> dishes = new ArrayList<dish>();

                    String allDishes = "";
                    for (int i = 0; i < test.getDishes().size(); i++){
                        if (i != 0){
                            allDishes = allDishes + ",";
                        }
                        allDishes = allDishes + test.getDishes().get(i).toString();
                    }
                    System.out.println(" These are the registered dishes: ");
                    System.out.println(allDishes);

                    while(!go2){
                        if(dishes.size() < 1){
                            System.out.println(" Please write in a name on a dish you would like to add to the new menu");
                            input.nextLine();
                        } else {
                            System.out.println(" Press 1 to register this menu or write in a name on a dish you would like to add");
                        }
                        String name = input.nextLine();
                        if (name.equals("1")){
                            go2 = true;
                        } else {
                            ArrayList<dish> newDish = test.DishName(name);
                            if(newDish.size() > 0){
                                dishes.add(newDish.get(0));
                                System.out.println(" Successfully added");
                            }else{
                                System.out.println(" Error! No dish found.... ");
                            }
                        }
                    }
                    System.out.println(" The new menu is now registered ");
                    test.RegisterNewMenu(dishes);
                }

                if(choice2 == 5){
                    System.out.println(" Lower price: ");
                    double min = input.nextDouble();

                    System.out.println(" Higher price: ");
                    double max = input.nextDouble();

                    ArrayList<menuuu> menus = test.AllMenusBetweenPrices(min, max);

                    for (int i = 0; i < menus.size(); i++){
                        System.out.println(" Menu number " + (i + 1) + ":");
                        System.out.println(menus.get(i).toString());
                        System.out.println("");
                    }




                }

                if(choice2 == 6){
                    go = false;
                    System.out.println(" Exiting the program ");
                }

            }
        }

        if (choice == 2){
            System.exit(0);
        }















    }




















}
