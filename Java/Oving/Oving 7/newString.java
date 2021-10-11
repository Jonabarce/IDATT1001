import java.util.Scanner;



public class newString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean go = true;

        while (go) {
            System.out.println(" Welcome! Press 1 to continue and 2 to quit");
            int choice = input.nextInt();

            if (choice == 1) {
                System.out.println(" Press the following numbers \n 1: Abbreviation of sentences \n 2: Remove one chosen letter");
                int choice2 = input.nextInt();

                if (choice2 == 1) { // Abbreviation
                    System.out.println(" Please write in a text");
                    input.nextLine();
                    String text = input.nextLine();

                    newString2 text1 = new newString2(text);

                    System.out.println(text1.abbreviation());


                }

                if (choice2 == 2) { // removeOne
                    System.out.println(" Please write in a text");
                    input.nextLine();
                    String text = input.nextLine();
                    newString2 text1 = new newString2(text);

                    System.out.println(" Please type in the letter you would like to remove ");
                    String letter = input.nextLine();
                    newString2 letter1 = new newString2(letter);
                    System.out.println(text1.removeOne(letter));

                }


            }


            if (choice == 2) {
                go = false;
                System.out.println(" Bye! ");

            }


        }


    }
}