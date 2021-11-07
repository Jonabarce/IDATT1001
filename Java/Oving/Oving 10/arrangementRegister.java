package com.Documents;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class arrangementRegister {
    private ArrayList<arrangement> arrangement = new ArrayList<arrangement>();

    public arrangementRegister() {
        arrangement = new ArrayList<arrangement>();
    }

    public void registerNewArrangement(int number, String name, String place, String organizer, String type, long point) {
        boolean nameTrue = false;
        for (int i = 0; i < arrangement.size(); i++) {
            if (arrangement.get(i).getNumber() == (number)) {
                nameTrue = true;
            }
        }
        if (!nameTrue) {
            arrangement newArrangement = new arrangement(number, name, place, organizer, type, point);
            arrangement.add(newArrangement);
        } else {
            System.out.println(" Error! This Arrangement does already exist ");
        }


    }

    public ArrayList<arrangement> arrangementPlace (String place) {
        ArrayList<arrangement> test = new ArrayList<>();
        for (int i = 0; i < arrangement.size(); i++) {
            if (arrangement.get(i).getPlace().equals(place)) {
                test.add(arrangement.get(i));
            }
        }
        return test;
    }


    public ArrayList<arrangement> arrangementPoint(int point){
        ArrayList<arrangement> test2 = new ArrayList();
        for (int i = 0; i < arrangement.size(); i++){
            int removeTime = (int)Math.floor(arrangement.get(i).getPoint() / 10000);
            if (removeTime == (int)point){
                test2.add(arrangement.get(i));
            }
        }
        return test2;
    }

    public ArrayList<arrangement> arrangementTwoDates(int point1, int point2) {
        ArrayList<arrangement> test3 = new ArrayList<>();
        for (int i = 0; i < arrangement.size(); i++) {
            int arrangementDate = (int) Math.floor(arrangement.get(i).getPoint() / 10000);
            if (arrangementDate >= (int) point1 && arrangementDate <= (int) point2) {
                test3.add(arrangement.get(i));
            }


        }
        return test3;
    }

    public ArrayList<arrangement> arrangementSorted(){
        ArrayList<arrangement> test5 = new ArrayList<>();

        for (int i = 0; i < arrangement.size(); i++) {
            arrangement newArrangement = new arrangement(arrangement.get(i).getNumber(), arrangement.get(i).getName(), arrangement.get(i).getPlace(), arrangement.get(i).getOrganizer(), arrangement.get(i).getType(), arrangement.get(i).getPoint());
            test5.add(newArrangement);
        }

        test5.sort(
                (test6, test7) -> {
                    if (test6.getPoint() != test7.getPoint()) {
                        return test6.getPoint() > test7.getPoint() ? 1 : -1;
                    }

                    if (test6.getPlace().compareTo(test7.getPlace()) != 0) {
                        return test6.getPlace().compareTo(test7.getPlace());
                    }

                    if (test6.getType().compareTo(test7.getType()) != 0) {
                        return test6.getType().compareTo(test7.getType());
                    }
                    return 0;
                });


        return test5;
    }


    @Override
    public String toString() {
        return "arrangementRegister{" +
                "arrangement=" + arrangement +
                '}';
    }


}