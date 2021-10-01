import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class matrise {
    
public static void main (String[]args){
    Scanner input = new Scanner (System.in);
    boolean go = true;



    while (go){
        System.out.println ( " Welcome to the matric calculator \n Press 1 to continue and 2 to quit ");
        int choice = input.nextInt();


        if(choice == 1){
            System.out.println( " What would you like to do? \n Press the following numbers: \n 1: Multiply two matrices togheter \n 2: Transpose one matrice \n 3: Addere two matrices togheter ");
            int choice2 = input.nextInt();

            if(choice2 == 1){ //multiply
        
                System.out.println( " Please type in total colums on the two matrices ");
                int colums = input.nextInt();
                System.out.println( " Please type in total rows on the two matrices ");
                int rows = input.nextInt();
                
                
                matriseregning matrix = new matriseregning(colums, rows);
                matriseregning matrix2 = new matriseregning(colums, rows);

                System.out.println(matrix.toString());
                System.out.println(matrix2.toString());

                System.out.println(matrix.multiply(matrix2).toString());

            
            
        }
            if(choice2 == 2){ //transpose 
                System.out.println( " Please type in total colums on the matrix ");
                int colums = input.nextInt();
                System.out.println( " Please type in total rows on the matrix ");
                int rows = input.nextInt();
                
                matriseregning matrix = new matriseregning(colums, rows);
                matriseregning matrix2 =  new matriseregning(colums, rows);

                System.out.println(matrix.toString());

                System.out.println(matrix.Transpose().toString());
               
                
            }

            if(choice2 == 3){ //addere

                System.out.println( " Please type in total colums on the two matrices ");
                int colums = input.nextInt();
                System.out.println( " Please type in total rows on the two matrices ");
                int rows = input.nextInt();
                
                matriseregning matrix = new matriseregning(colums, rows);
                matriseregning matrix2 =  new matriseregning(colums, rows);

                System.out.println(matrix.toString());

                System.out.println(matrix.addere(matrix).toString());
                



            }

        }   
            if (choice == 2){
            go = false;
            System.out.println(" Bye! ");  

            }
        





    

        }
    }
}

