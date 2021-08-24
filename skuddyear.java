import java.util.Scanner;


class skuddor {
public static void main (String [] args) {

    

    Scanner myObj = new Scanner(System.in);
    System.out.println (" Type in year ");
    int year = myObj.nextInt();  
if (year%100 == 0){



    if (year%400 == 0){

System.out.println(year + " Det er riktig ");
    }
}
if (year%4 == 0 && year%100 != 0){
System.out.println(year + " Det er riktig ");   
}







}

}
