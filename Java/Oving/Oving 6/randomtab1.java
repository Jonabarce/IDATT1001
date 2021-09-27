import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class randomtab1 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        java.util.Random random = new java.util.Random(); 
        boolean go = true;

        while (go){
            System.out.println(" Welcome to the number generator \n Press 1 to start and 2 to quit ");
            int choice = input.nextInt();

            if (choice == 1){
                System.out.println("Please enter the number of numbers you want to print here;");
                int total = input.nextInt();
                System.out.println("The lower limit is 0 \n Please enter higher limit greater then 0 here:");
                int limit = input.nextInt();




                int randomArray[] = new int[total];
                int countArray[]=new int[limit]; 

                for (int i = 0; i < total; i++) { 
                randomArray[i] = random.nextInt(limit);
                System.out.println(randomArray[i]);
                }

                for (int r : randomArray) { 
                countArray[r]++;
                }

                for (int x = 0; x < countArray.length; x++) { 
                System.out.println("" + x + " kommer " + countArray[x] + " ganger");
                }

            }
            
            if (choice == 2){
               go = false;
               System.out.println( " Bye! "); 
            }



        }
        
    }
}
