import java.util.Scanner;




class omgjoring {
public static void main (String [] args) {
    
    int time = 3600;
    int minutt = 60;
    int sekund = 1;
    
    Scanner myObj = new Scanner(System.in);
    System.out.println (" Skriv inn antall sekund ");
    int antall = myObj.nextInt();  
    
    int test_time = (antall/time);
    int test_minutt = (antall%time)/minutt;
    int test_sekund = (antall%time)%minutt/sekund;




System.out.println (test_time  + " timer " + test_minutt + " minutt " + test_sekund + " sekunder ");

}


}
