import java.util.Scanner;


class ganga {
public static void main (String [] args) {

 Scanner myObj = new Scanner(System.in);
    System.out.println (" Skriv inn onsket gangetabell fra 1 til 10 ");
    int tall = myObj.nextInt(); 
Scanner myObj2 = new Scanner(System.in);
    System.out.println (" En tall hoyere enn dette tallet ");
int tall2 = myObj2.nextInt();

  
for (int e = tall; e <= tall2; e++){
for (int i = 1; i <= 10; i++){
System.out.println (i + " x " + e + " = " + i * e);

}
}

}

}
