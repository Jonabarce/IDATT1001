package com.Documents;

import java.util.ArrayList;

public class menuuu {
    private ArrayList<dish> menuWithDishes = new ArrayList<dish>();

    public menuuu(ArrayList<dish> menuWithDishes){
        this.menuWithDishes = menuWithDishes;
    }

    public ArrayList<dish> getMenuWithDishes() {
        return menuWithDishes;
    }

    public double getTotalPrice(){
        double price = 0;
        for(int i = 0; i < getMenuWithDishes().size(); i++){
            price = price + getMenuWithDishes().get(i).getPrice();
        }
        return price;
    }

    @Override
    public String toString() {
        return "menuuu{" +
                "menuWithDishes=" + menuWithDishes +
                '}';
    }
}