import java.util.Scanner;


class ganga {
public static void main (String [] args) {

 Scanner myObj = new Scanner(System.in);
    System.out.println (" Skriv inn ønsket gangetabell fra 1 til 10 ");
    int tall = myObj.nextInt(); 
Scanner myObj2 = new Scanner(System.in);
    System.out.println (" Skriv inn øsnket lengde på gangen ");
int tall2 = myObj2.nextInt();

for (int i = 1; i <= tall2; i++){


System.out.println (i + " x " + tall + " = " + tall*i);
}
}

}
