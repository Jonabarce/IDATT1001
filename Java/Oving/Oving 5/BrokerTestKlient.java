public class BrokerTestKlient {
  
    public static void main(String[] args){
        int teller3 = 2;
        int nevner3 = 2;
        int teller4 = 2;
        int nevner4 = 6;

        Brøk brok3 = new Brøk(teller3,nevner3);
        Brøk brok4 = new Brøk(teller4,nevner4);


        System.out.println(brok3);
        brok3.sum(teller4,nevner4);
        System.out.print(brok3);

        System.out.println ("Test for summering er ok");

        System.out.println(brok3);
        brok3.sub(teller4,nevner4);
        System.out.print(brok3);

        System.out.println ("Test for subtrahering er ok");

        System.out.println(brok3);
        brok3.multi(teller4,nevner4);
        System.out.print(brok3);

        System.out.println ("Test for multiplikasjon er ok");

        System.out.println(brok3);
        brok3.div(teller4,nevner4);
        System.out.print(brok3);

        System.out.println ("Test for divisjon er ok");

    }
    




















}

