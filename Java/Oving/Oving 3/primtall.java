import java.util.Scanner;


public class Primtall{    
 public static void main(String args[]){  
     int tall = 5000;
while (tall != -1) {
Scanner myObj = new Scanner(System.in);
    System.out.println (" Type in number or type -1 to quit ");
    tall = myObj.nextInt();
if (tall == -1){
    System.out.println ( " Koden er ferdig ");
    break;
}
    
  int i,m=0,flag=0;        
  m=tall/2;      
  if(tall==0||tall==1){  
   System.out.println(tall + " er ikke et primtall ");      
  }
  else{  
   for(i=2;i<=m;i++){      
    if(tall%i==0){      
     System.out.println(tall + " er ikke et primtall ");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(tall + " Er et primtall "); }  
   

}
}
}

}







