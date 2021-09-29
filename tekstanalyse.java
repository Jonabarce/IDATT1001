import java.util.Scanner;
import java.lang.Math;


public class tekstanalyse {
    




    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        boolean go = true;

        int[] totalletters = new int[31];
        char[] letters = {'a', 'b', 'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; //':', ',', '!', '.'};
        // char[] notletters = {'æ','ø','å', '-','<', '>', '/', '1','2','3','4','5','6','7','8','9','0','*'};

    
    
    
    
    while (go){
        System.out.println (" Welcome to the text analysis \n Press 1 to continue and 2 to quit ");
        int choice = input.nextInt();

        if (choice == 1){
            System.out.println ( " Want would you like to do? \n Please press the following numbers \n 1: Total different letters \n 2: Total letters \n 3: What part of the text (percent) is not letters? \n 4: Find the number of occurrences of a particular letter \n 5: Most common letters ");
            int choice2 = input.nextInt();

            if(choice2 == 1) { //Total different letters
                System.out.println("Please write in a text");
                input.nextLine();
                String text = input.nextLine();
                for (int i=0;i<text.length();i++){
                        for (int z=0;z<letters.length;z++){
                            if (text.charAt(i) == letters[z]){
                            totalletters[z]++;
                            

                            }
                        }
                    }
                    for (int x=0;x<letters.length;x++){
                        if (totalletters[x]>0)
                        System.out.println (letters[x]+":"+totalletters[x]);
                        
                        }
                        
                    }

                    
                
            
    
            if(choice2 == 2){ // total letters in the text
                System.out.println(" Please write in a text here:");
                input.nextLine();
                String text = input.nextLine(); 
                int stringLength = text.length();
                System.out.println(" Total letters in this text: " + stringLength);

                int stringLenghtWithoutSpaces = text.replace(" ", "").length();
                System.out.println( " Total letters in this text without counting whitespaces: " + stringLenghtWithoutSpaces);

            }


            if(choice2 == 3){ // What part of the text (percent) is not letters?
                System.out.println("Please write in a text");
                input.nextLine();
                String text = input.nextLine(); 
                int stringLength = text.length();

                int letter = 0;
                int not_letters = 0;
                int others = 0;


                for (int i = 0; i< text.length(); i++){
                    
                    char ch = text.charAt(i);

                    if(Character.isLetter(ch)){
                        letter++;
                    }else if(Character.isDigit(ch)){
                        not_letters++;
                    }else{
                        others++;
                    }
                    

                    
                    
    
                }

                double letterPercentage = (letter * 100.0) / stringLength ;
                double not_letterPercentage = ((not_letters+others) * 100.0) / stringLength ;
                
                System.out.println(" In the text ");
                System.out.println( " Letters occures: " + Math.round(letterPercentage) + "%");
                System.out.println( " Symbols occures(not letters) " + Math.round(not_letterPercentage) + "%");
            }
            
            if(choice2 == 4){ // Occurances of a specified letter
                int times=0;
                int position;


                System.out.println("Please write in a text");
                input.nextLine();
                String text = input.nextLine();
                System.out.println(" Please enter the character you wish to be counted here;");
                String letter = input.nextLine();

                for (position=0; position<text.length(); position++){
                    if (text.charAt(position) == letter.charAt(0) ){
                        times++;
                    }


                }
                
                
            
                System.out.println(" There are " + times + " ocurrances of the letter " + letter + " in your text");

            }

            if(choice2 == 5){ // Most common letters
                System.out.println("Please write in a text");
                input.nextLine();
                String text = input.nextLine();
                int stringLength = text.length();

                char maxappearchar = ' ';
                int counter = 0;
                int[] charcnt = new int[Character.MAX_VALUE + 1];


                for (int i = 0; i<text.length(); i++){
                    char ch = text.charAt(i);

                    charcnt[ch]++ ;

                    if (charcnt[ch] >= counter){
                        counter = charcnt[ch];
                        maxappearchar = ch;
                    }
                        
                }
                System.out.println(" There are Total " + stringLength + " letters in this text ");
                System.out.println(" And the max letter is " + maxappearchar + " and displayed " + counter + " times ");


            }

        }
        
        if (choice == 2){
            go = false;
            System.out.println( " Bye! ");

        }


    }
    










    







    }
















}