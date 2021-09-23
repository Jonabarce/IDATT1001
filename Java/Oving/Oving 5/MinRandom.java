import java.util.Random;
import java.util.Scanner;





public class MinRandom {
        private Random rand;
   
    
    public MinRandom(){
    this.rand = new Random();

    }




    public int next_integer_number (int lower, int upper) {
        return this.rand.nextInt(upper + 1  - lower) + lower;






    } 


    public double next_decimal_number(double lower, double upper){ 
        return this.rand.nextDouble() * (upper - lower) + lower;




    }

    public static void main(String[]args){
        
        
        boolean go = true;
        Scanner input = new Scanner(System.in);
        MinRandom y = new MinRandom();

        while(go){
            System.out.println(" Press \n 1 for Integer \n 2 for Decimal number \n 3 to quit" );
            int choice = input.nextInt();
        
            if (choice == 1)  {
                System.out.println (" Enter the lower limit ");
                int lower_limit = input.nextInt();
                System.out.println ( " Enter the upper limit ");
                int upper_limit = input.nextInt();
                System.out.println ( "Your Integer number is:" + y.next_integer_number(lower_limit,upper_limit));




            }

            if (choice == 2){
                System.out.println (" Enter the lower limit ");
                double lower_limit2 = input.nextDouble();
                System.out.println ( " Enter the upper limit ");
                double upper_limit2 = input.nextDouble();
                System.out.println ( "Your Integer number is:" + y.next_decimal_number(lower_limit2,upper_limit2));





            }

            if (choice == 3){
                go = false;
                System.out.println(" Bye! ");

            }


    }

    


    }
}














