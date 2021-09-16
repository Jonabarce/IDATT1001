import java.util.Scanner;

public class ValutaKalkulator {
    

public static void main(String[] args){
    Valuta usd = new Valuta("USD", 9);
    Valuta eur = new Valuta("EUR", 11);
    Valuta sek = new Valuta("SEK", 1);

    Scanner input = new Scanner(System.in);

    
    boolean go = true;
    
    while (go) {

    

    System.out.println("Velg valuta du vil fra: \n 1: USD \n 2: EUR \n 3: SEK \n 4: NOK \n 5: Avslutt" );
    int valg = input.nextInt();



    if (valg == 1){
        System.out.println(usd.toString());
        double penger = input.nextDouble();
        double konvertert = usd.convertToNOK(penger);
        System.out.println(penger + " Amerikanske dollar, er det samme som " + konvertert + " NOK ");
    }

    if (valg == 2){
        System.out.println(eur.toString());
        double penger = input.nextDouble();
        double konvertert = eur.convertToNOK(penger);
        System.out.println(penger + " EUR, er det samme som " + konvertert + " NOK ");
    }

    if (valg == 3){
        System.out.println(sek.toString());
        double penger = input.nextDouble();
        double konvertert = sek.convertToNOK(penger);
        System.out.println(penger + " Svenske kroner, er det samme som " + konvertert + " NOK ");
    }

    if (valg == 4){
       System.out.println ("Hvilken valuta vil du konvertere til? \n 1: USD \n 2: EUR \n 3: SEK ");
       int valg2 = input.nextInt ();
            if (valg2 == 1){
                System.out.println (" Skriv inn antall penger du vil konvertere ");
                double penger2 = input.nextDouble();
                double konvertert2 = usd.convertFromNOK (penger2);
                System.out.println (penger2 + " Norske kroner, er det samme som  " + konvertert2 + " USD ");
            }
            if (valg2 == 2){
                System.out.println (" Skriv inn antall penger du vil konvertere ");
                double penger2 = input.nextDouble();
                double konvertert2 = eur.convertFromNOK (penger2);
                System.out.println (penger2 + " Norske kroner, er det samme som  " + konvertert2 + " EUR ");
            }
            if (valg2 == 3){
                System.out.println (" Skriv inn antall penger du vil konvertere ");
                double penger2 = input.nextDouble();
                double konvertert2 = sek.convertFromNOK (penger2);
                System.out.println (penger2 + " Norske kroner, er det samme som " + konvertert2 + " SEK ");
            }

    }


    if (valg == 5){
        go = false;
        
    }











    }

}
}