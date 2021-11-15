package com.Documents;

import java.util.Objects;

public class MushroomArt {

    private String name;
    private String description;
    private String edable;




    public MushroomArt(String name, String description, String edible){
        this.name = name;
        this.description = description;
        this.edable = edable;



    }

    public MushroomArt(MushroomArt so){
        name = so.getName();
        description = so.getDescription();
        edable = so.getEdable();
    }
    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get Description
     * @return Description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get Edable
     * @return Edable
     */
    public String getEdable() {
        return edable;
    }

    /**
     * Method to see if a soppart == another soppart
     * @param o
     * @return Boolean true/false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MushroomArt mushroomArt = (MushroomArt) o;
        return Objects.equals(name, mushroomArt.name);
    }

    /**
     * Method to see if a String contains in the description of the soppart
     * @param anything
     * @return
     */
    public boolean equalsDescription(String anything){
        if(this.getDescription().contains(anything)){
            return true;
        }else{
            return false;
        }
    }

    /**
     * In case of the sopp getting edible in the future
     * @param edable
     */
    public void setEdable(String edable) {
        this.edable = edable;
    }

    /**
     * toString method
     * @return name, desccription, edable
     */
    @Override
    public String toString() {
        return name + " " + description + " " +
                edable + "\n";
    }
}
