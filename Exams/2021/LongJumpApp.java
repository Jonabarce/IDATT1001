package com.Documents;

import java.util.Scanner;

public class LongJumpApp {

    private final LongJumpRegister LongJumpRegister;

    private final Scanner input;

    final int ADD_RESULT = 1;
    final int LIST_ALL_RESULTS = 2;
    final int SHOW_RESULT_BY_ATHLETE = 3;
    final int SHOW_BEST_RESULT = 4;
    final int CALCULATE_AVERAGE_RESULT = 5;
    final int EXIT = 6;

    public LongJumpApp(){
        LongJumpRegister = new LongJumpRegister();
        input = new Scanner(System.in);
    }

    public void testData(){

        LongJump newLongJump = new LongJump(210,"Malaika Mihambo",6.98,"Yes",10,15);
        LongJumpRegister.registerNewLongJump(210,"Malaika Mihambo",6.98,"Yes",10,15);

        // This one is to test if it is able to register same jump twice
        LongJump newLongJump2 = new LongJump(210,"Malaika Mihambo",6.98,"Yes",10,15);
        LongJumpRegister.registerNewLongJump(210,"Malaika Mihambo",6.98,"Yes",10,15);

        LongJump newLongJump3 = new LongJump(210,"Malaika Mihambo",6.99,"Yes",10,25);
        LongJumpRegister.registerNewLongJump(210,"Malaika Mihambo",6.99,"Yes",10,25);

        LongJump newLongJump4 = new LongJump(211,"Tara Davis",6.85,"Yes",10,17);
        LongJumpRegister.registerNewLongJump(211,"Tara Davis",6.85,"Yes",10,17);

        LongJump newLongJump5 = new LongJump(204,"Brittney Reese",9.2,"No",10,19);
        LongJumpRegister.registerNewLongJump(204,"Brittney Reese",9.2,"No",10,19);
    }

    public void registerNewLongJump() {
        System.out.println(" Please type in the start number for the athlete");
        int startNumber = input.nextInt();

        System.out.println(" Please write in the name of the Athlete (First name Last name)");
        input.nextLine(); // Small hack to prevent it from jumping over the input box in the console. Common bug in java.
        String nameOfTheAthlete = input.nextLine();

        System.out.println(" Please type in the results in meters ");
        double result = input.nextDouble();

        System.out.println(" Please write in Yes for valid jump or No for no valid jump");
        input.nextLine();// Small hack to prevent it from jumping over the input box in the console. Common bug in java.
        String validJump = input.nextLine();

        System.out.println(" Please type time in hour (English hour)");
        int hour = input.nextInt();

        System.out.println(" Please type in minutes");
        int minutes = input.nextInt();

        LongJump newLongJump = new LongJump(startNumber,nameOfTheAthlete,result,validJump,hour,minutes);
        LongJumpRegister.registerNewLongJump(startNumber,nameOfTheAthlete,result,validJump,hour,minutes);
    }

    public void printOutAllResults() {
        System.out.println(LongJumpRegister.printOutAllLongJumpsResults());
        System.out.println("Total Long Jumps registered: " + LongJumpRegister.getTotalJumpsRegistered());
    }

    public void showAllResultsByOneAthlete() {
        System.out.println(" Please write in the name of the Athlete (First name Last name)");
        input.nextLine();// Small hack to prevent it from jumping over the input box in the console. Common bug in java.
        String nameOfTheAthlete = input.nextLine();

        System.out.println(LongJumpRegister.printOutAllJumpsForOneAthlete(nameOfTheAthlete));
    }

    public void showTheBestResultAmongAllRegistrations() {
        System.out.println("The best result is: ");
        System.out.println(LongJumpRegister.printOutBestResult() + " meters");
    }

    public void calculateAverageResult() {
        System.out.println(" The average result in meters is: ");
        System.out.println(LongJumpRegister.averageResult());
    }

    private void showMenu() {
        int menuChoice = 0;

        System.out.println("\n***** Long jump application v0.1 *****\n");
        System.out.println("1. Register a long jump result");
        System.out.println("2. List all results");
        System.out.println("3. Show all results by given athlete");
        System.out.println("4. Show the best result");
        System.out.println("5. Calculate the avarge result");
        System.out.println("6. Exit");
        System.out.println("\nPlease enter a number between 1 and 6.");

        if (input.hasNextInt()) {
            menuChoice = input.nextInt();
        } else {
            System.out.println("You must enter a number, not text");
        }

        switch (menuChoice) {
            case ADD_RESULT:
                registerNewLongJump();
                break;
            case LIST_ALL_RESULTS:
                printOutAllResults();
                break;
            case SHOW_RESULT_BY_ATHLETE:
                showAllResultsByOneAthlete();
                break;
            case SHOW_BEST_RESULT:
                showTheBestResultAmongAllRegistrations();
                break;
            case CALCULATE_AVERAGE_RESULT:
                calculateAverageResult();
                break;
            case EXIT:
                System.out.println("Thank you for using the Long jump app!\n");
                System.exit(0);
                break;
            default:
                System.out.println("Unrecognized menu choice selected..");
                break;
        }
    }

    public static void main(String[] args) {
        LongJumpApp LongJumpApp = new LongJumpApp();
        LongJumpApp.testData();

        while (true) {
            LongJumpApp.showMenu();
        }
    }
}
