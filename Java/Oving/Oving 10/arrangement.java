package com.Documents;

import java.util.ArrayList;


public class arrangement {
    private int number;
    private String name;
    private String place;
    private String organizer;
    private String type;
    private long point;

    public arrangement(int number, String name, String place, String organizer, String type, long point ){
        this.number = number;
        this.name = name;
        this.place = place;
        this.organizer = organizer;
        this.type = type;
        this.point = point;
    }

    public int getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }

    public String getPlace(){
        return place;
    }

    public String getOrganizer(){
        return organizer;
    }

    public String getType(){
        return type;
    }

    public long getPoint(){
        return point;
    }

    @Override
    public String toString() {
        return "arrangement{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", organizer='" + organizer + '\'' +
                ", type='" + type + '\'' +
                ", point=" + point +
                '}';
    }
}


