import java.util.Scanner;



public class text {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean go = true;

        while (go) {
            System.out.println(" Welcome! Press 1 to continue and 2 to quit");
            int choice = input.nextInt();



            if(choice == 1){
                System.out.println(" What would you like to do?");
                System.out.println(" Press 1 to find total words in the text ");
                System.out.println(" Press 2 to find the average word length ");
                System.out.println(" Press 3 to find the average number of words per period ");
                System.out.println(" Press 4 to replace one word with another throughout the text ");
                System.out.println(" Press 5 to retrieve the text as it stands, without changes ");
                System.out.println(" Press 6 to make every letter in the text go from lower to uppercase");

                int choice2 = input.nextInt();

                if (choice2 == 1){
                    System.out.println( " Please write in a text ");
                    input.nextLine();
                    String text = input.nextLine();

                    text2 text1 = new text2(text);

                    System.out.println("There is a total of: " + text1.totalWords() + "words in this text");

                }



                if (choice2 == 2){
                    System.out.println( " Please write in a text ");
                    input.nextLine();
                    String text = input.nextLine();

                    text2 text1 = new text2(text);

                    System.out.println("The average word length in this text is:" + text1.averageWord());
                }



                if(choice2 == 3){
                    System.out.println( " Please write in a text ");
                    input.nextLine();
                    String text = input.nextLine();

                    text2 text1 = new text2(text);

                    System.out.println(text1.averageNumberWord());

                }

                if(choice2 == 4){
                System.out.println( " Please write in a text ");
                input.nextLine();
                String text = input.nextLine();
                text2 text1 = new text2(text);

                System.out.println(" Write in the first word ");
                String letter = input.nextLine();
                text2 letter1 = new text2(letter);

                System.out.println( " Write in the second word you would like to replace with word one ");
                String letter2 = input.nextLine();
                text2 letter_2 = new text2(letter2);



                System.out.println("This is the replaced text you asked for: " + text1.replaceWord(letter,letter2));
                }

                if (choice2 == 5){
                    System.out.println( " Please write in a text ");
                    input.nextLine();
                    String text = input.nextLine();
                    text2 text1 = new text2(text);



                    System.out.println(text1.retrieveText());
                }

                if (choice2 == 6){
                    System.out.println( " Please write in a text ");
                    input.nextLine();
                    String text = input.nextLine();
                    text2 text1 = new text2(text);

                    System.out.println(text1.upperCase());



                }












            }





            if(choice == 2){
                go = false;
                System.out.println(" Bye! ");
            }










        }
    }
}