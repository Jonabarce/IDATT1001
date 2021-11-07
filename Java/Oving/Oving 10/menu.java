package com.Documents;


import java.util.Scanner;

public class menu {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        arrangementRegister ar = new arrangementRegister();
        System.out.println(" Press 1 to continue or press 2 to quit ");
        int choice = input.nextInt();

        if (choice == 1) {
            boolean go = true;
            while (go) {
                System.out.println(" Press 1 to register a new arrangement ");
                System.out.println(" Press 2 to find all arrangements in one spesific place ");
                System.out.println(" Press 3 to find all arrangements in one spesific date ");
                System.out.println(" Press 4 to to find all arrangements given by to different dates ");
                System.out.println(" Press 5 to print a list of all arrangements sorted ");
                System.out.println(" Press 6 to Exit the program ");
                int choice2 = input.nextInt();

                if (choice2 == 1) {
                    System.out.println(" Please write in a 5 digit number ");
                    System.out.println(" The number cant start with 0 ");
                    int number = input.nextInt();

                    System.out.println(" Please write in a name for the arrangement ");
                    input.nextLine();
                    String name = input.nextLine();

                    System.out.println(" Please write in the place the arrangement is hold ");
                    String place = input.nextLine();

                    System.out.println(" Please write in name of organizer");
                    String organizer = input.nextLine();

                    System.out.println(" Please write in type of arrangement");
                    String type = input.nextLine();

                    System.out.println(" Please write in point in this format: YYYYMMDDTTTT");
                    System.out.println(" Y - Year \n M - Month \n D - Date \n T - Time");
                    long point = input.nextLong();

                    arrangement newArrangement = new arrangement(number, name, place, organizer, type, point);
                    ar.registerNewArrangement(number, name, place, organizer, type, point);
                }

                if (choice2 == 2) {
                    System.out.println(" Please write in a place ");
                    input.nextLine();
                    String place = input.nextLine();

                    System.out.println(ar.arrangementPlace(place).toString());

                }

                if (choice2 == 3) {
                    System.out.println(" Please write in a date ");
                    input.nextLine();
                    int point = input.nextInt();


                    ar.arrangementPoint(point);
                    System.out.println(ar.arrangementPoint(point).toString());

                }

                if (choice2 == 4) {
                    System.out.println(" Please write in the first date ");
                    input.nextLine();
                    int point1 = input.nextInt();

                    System.out.println(" Please write in the second date ");
                    input.nextLine();
                    int point2 = input.nextInt();

                    System.out.println(ar.arrangementTwoDates(point1, point2).toString());


                }

                if (choice2 == 5) {

                    System.out.println(ar.arrangementSorted().toString());

                }

                if (choice2 == 6) {
                    go = false;
                    System.out.println(" Exiting the program....");
                }


            }
            if (choice == 2) {
                System.exit(0);
            }
        }
    }
}