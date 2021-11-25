package com.Documents;

import java.util.Scanner;

public class CovidStatsApp {

    private final COVIDmethods COVIDmethods;

    private final Scanner input;

    private final int ADD_COVID_ENTRY_TO_REGISTER = 1;
    private final int LIST_ALL_COVID_ENTRIES = 2;
    private final int FIND_COVID_ENTRY_BY_DATE = 3;
    private final int FIND_COVID_ENTRY_AFTER_DATE = 4;
    private final int CALCULATE_TOTAL_DEATHS = 5;
    private final int EXIT = 6;

    public CovidStatsApp(){
        COVIDmethods = new COVIDmethods();
        input = new Scanner(System.in);
    }

    public void testData(){

        COVIDregistering newCase = new COVIDregistering(2021,2,28,"Norway",500,0);
        COVIDmethods.registerNewCOVIDCase(2021,2,28,"Norway",500,0);

        COVIDregistering newCase2 = new COVIDregistering(2021,11,3,"China",349,3);
        COVIDmethods.registerNewCOVIDCase(2021,11,3,"China",349,3);

        COVIDregistering newCase3 = new COVIDregistering(2021,9,5,"China",200,40);
        COVIDmethods.registerNewCOVIDCase(2021,9,5,"China",200,40);
    }

    public void registerNewCOVIDCase() {
        System.out.println("Please type in the year you wold like to register for");
        int year = input.nextInt();

        System.out.println("Please type in the month you wold like to register (1-12)");
        int month = input.nextInt();

        System.out.println("Please type in the day of month you wold like to register for");
        int dayOfMonth = input.nextInt();

        System.out.println("Please write in the name of the country ");
        input.nextLine();
        String country = input.nextLine();

        System.out.println("Please type in total infected ");
        int infected = input.nextInt();

        System.out.println("Please type in total dead ");
        int dead = input.nextInt();

        COVIDregistering newCOVIDCase = new COVIDregistering(year,month,dayOfMonth,country,infected,dead);

        System.out.println(COVIDmethods.registerNewCOVIDCase(year,month,dayOfMonth,country,infected,dead));
    }

    public void printOutAll() {
        System.out.println(COVIDmethods.printOutAll());
    }

    public void findCaseByDate() {
        System.out.println("Please type in the year you wold like to search for");
        int year = input.nextInt();

        System.out.println("Please type in the month you wold like to search for (1-12)");
        int month = input.nextInt();

        System.out.println("Please type in the day of month you wold like to search for");
        int dayOfMonth = input.nextInt();

        System.out.println(COVIDmethods.findCaseByDate(year,month,dayOfMonth).toString());
    }

    public void findCaseAfterTheDate() {
        System.out.println("Please type in the year you wold like to search for");
        int year = input.nextInt();

        System.out.println("Please type in the month you wold like to search for (1-12)");
        int month = input.nextInt();

        System.out.println("Please type in the day of month you wold like to search for");
        int dayOfMonth = input.nextInt();

        System.out.println(COVIDmethods.findCaseAfterTheDate(year,month,dayOfMonth).toString());

    }

    public void getTotalDeaths() {
        System.out.println("Please write in the country you would like to calculate total deaths for");
        input.nextLine();
        String country = input.nextLine();

        System.out.println(COVIDmethods.getTotalDeadForOneCountry(country));

    }

    private void showMenu() {
        int menuChoice = 0;

        System.out.println("\n***** Covid Statistics Application v0.1 *****\n");
        System.out.println("1. Add a COVID-19 entry");
        System.out.println("2. List all COVID-19 entries");
        System.out.println("3. Find COVID-19 entry by date");
        System.out.println("4. Find all entries after date");
        System.out.println("5. Show the total deaths for a country");
        System.out.println("6. Quit");
        System.out.println("\nPlease enter a number between 1 and 6.");

        if (input.hasNextInt()) {
            menuChoice = input.nextInt();
        } else {
            System.out.println("You must enter a number, not text");
        }

        switch (menuChoice) {
            case ADD_COVID_ENTRY_TO_REGISTER:
                registerNewCOVIDCase();
                break;
            case LIST_ALL_COVID_ENTRIES:
                printOutAll();
                break;
            case FIND_COVID_ENTRY_BY_DATE:
                findCaseByDate();
                break;
            case FIND_COVID_ENTRY_AFTER_DATE:
                findCaseAfterTheDate();
                break;
            case CALCULATE_TOTAL_DEATHS:
                getTotalDeaths();
                break;
            case EXIT:
                System.out.println("Thank you for using the Covid Stats App!\n");
                System.exit(0);
                break;
            default:
                System.out.println("Unrecognized menu choice selected..");
                break;
        }
    }

    public static void main(String[] args) {
        CovidStatsApp CovidStatsApp = new CovidStatsApp();
        CovidStatsApp.testData();

        while (true) {
            CovidStatsApp.showMenu();
        }
    }
}
