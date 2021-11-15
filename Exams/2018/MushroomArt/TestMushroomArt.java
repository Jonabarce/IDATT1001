package com.Documents;

public class TestMushroomArt {


    public static void main(String[] args){
        Mushroomregister Mr = new Mushroomregister();

        MushroomArt newMushroomArt = new MushroomArt("Rod Fluesopp","Rod sopp med prikker. Du finner den i skog med bjørk og gran","Gifitg");
        Mr.registerNewMushRoomArt("Rod Fluesopp","Rod sopp med prikker. Du finner den i skog med bjørk og gran","Gifitg");

        MushroomArt newMushroomArt2 = new MushroomArt("Gronn fluesopp", "Gronn sopp. Naringsrik lovskog med eik, men ogso med bok og hassel", "Giftig");
        Mr.registerNewMushRoomArt("Gronn fluesopp", "Gronn sopp. Naringsrik lovskog med eik, men ogso med bok og hassel", "Giftig");


        System.out.println(Mr. printAllMushroomArts());
        System.out.println("");
        System.out.println(Mr.printInformationAboutAllRegisteredMushRoomArts());
        System.out.println(Mr.findAllMuhsroomArts("Gronn sopp"));

    }


}
