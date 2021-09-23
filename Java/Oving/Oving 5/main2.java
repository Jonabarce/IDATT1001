import java.util.Scanner;
import static javax.swing.JOptionPane.*;





public class main2 {
    public static void main(String[]args){
        

        




        Scanner input = new Scanner(System.in);
        boolean go = true;

        while (go) {
        System.out.println (" Velg hva du vil gjøre: \n 1: Summer \n 2: Subtraher \n 3: Multipliser \n 4: Divider  \n 5: Avslutt" );
        int valg = input.nextInt();

        
        if (valg == 1){
            System.out.println ( " Skriv inn teller til den første brøken ");
            int teller1 = input.nextInt();
            System.out.println ( " Skriv inn nevner til den første brøken ");
            int nevner1 = input.nextInt();
            Brøk brok = new Brøk (teller1, nevner1);

            System.out.println ( " Skriv inn teller til den andre brøken  ");
            int teller2 = input.nextInt();
            System.out.println ( " Skriv inn nevner til den andre brøken ");
            int nevner2 = input.nextInt ();
            Brøk brok2 = new Brøk (teller2, nevner2);

            brok.sum(teller2,nevner2);
            System.out.println(brok.toString());



                



            
        }



        if (valg == 2){

            System.out.println ( " Skriv inn teller til den første brøken ");
            int teller1 = input.nextInt();
            System.out.println ( " Skriv inn nevner til den første brøken ");
            int nevner1 = input.nextInt();
            Brøk brok = new Brøk (teller1, nevner1);

            System.out.println ( " Skriv inn teller til den andre brøken  ");
            int teller2 = input.nextInt();
            System.out.println ( " Skriv inn nevner til den andre brøken ");
            int nevner2 = input.nextInt ();
            Brøk brok2 = new Brøk (teller2, nevner2);

            brok.sub(teller2,nevner2);
            System.out.println(brok.toString());

        }


        if (valg == 3){

            System.out.println ( " Skriv inn teller til den første brøken ");
            int teller1 = input.nextInt();
            System.out.println ( " Skriv inn nevner til den første brøken ");
            int nevner1 = input.nextInt();
            Brøk brok = new Brøk (teller1, nevner1);

            System.out.println ( " Skriv inn teller til den andre brøken  ");
            int teller2 = input.nextInt();
            System.out.println ( " Skriv inn nevner til den andre brøken ");
            int nevner2 = input.nextInt ();
            Brøk brok2 = new Brøk (teller2, nevner2);

            brok.multi(teller2,nevner2);
            System.out.println(brok.toString());

        }


        if (valg == 4){

            System.out.println ( " Skriv inn teller til den første brøken ");
            int teller1 = input.nextInt();
            System.out.println ( " Skriv inn nevner til den første brøken ");
            int nevner1 = input.nextInt();
            Brøk brok = new Brøk (teller1, nevner1);

            System.out.println ( " Skriv inn teller til den andre brøken  ");
            int teller2 = input.nextInt();
            System.out.println ( " Skriv inn nevner til den andre brøken ");
            int nevner2 = input.nextInt ();
            Brøk brok2 = new Brøk (teller2, nevner2);

            brok.div(teller2,nevner2);
            System.out.println(brok.toString());

        }


        if (valg == 5){
            go = false;
            System.out.println (" Hade! ");



        }











        }
        















    }

    

}