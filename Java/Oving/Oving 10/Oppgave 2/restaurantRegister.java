package com.Documents;

import java.util.ArrayList;

public class restaurantRegister {
    private ArrayList<menuuu> menus = new ArrayList<menuuu>();
    private ArrayList<dish> dishes = new ArrayList<dish>();

    public restaurantRegister(){
        menus = new ArrayList<menuuu>();
        dishes = new ArrayList<dish>();

    }

    public ArrayList<dish> getDishes() {
        return dishes;
    }

    public ArrayList<menuuu> getMenus() {
        return menus;
    }


    public void RegisterNewDish(String name, String type, double price){
        boolean go = false;
        for(int i = 0; i < dishes.size(); i++){
            if(dishes.get(i).getName().equals(name)){
                go = true;
            }
        }
        if(!go){
            dish newDish = new dish(name, type, price);
                dishes.add(newDish);
        }else{
            System.out.println( " The name of the Dish does already exist! Please use another name ");
        }

    }

    public ArrayList<dish> DishName(String name){
        ArrayList<dish> t = new ArrayList<dish>();
        for(int i = 0; i < getDishes().size(); i++){
            if (getDishes().get(i).getName().equals(name)){
                t.add(getDishes().get(i));
            }
        }
        return t;
    }


    public ArrayList<dish> DishType(String type){
        ArrayList<dish> t = new ArrayList<dish>();
        for(int i = 0; i < getDishes().size(); i++){
            if(getDishes().get(i).getType().equals(type)){
                t.add(getDishes().get(i));
            }
        }
        return t;
    }

    public menuuu RegisterNewMenu(ArrayList<dish> menuWithDishes){
        menuuu newMenu = new menuuu(menuWithDishes);
        getMenus().add(newMenu);
        return newMenu;
    }

    public ArrayList<menuuu> AllMenusBetweenPrices(double min, double max){
        ArrayList<menuuu> t = new ArrayList<menuuu>();
        for (int i = 0; i < getMenus().size(); i++){
            if (getMenus().get(i).getTotalPrice() >= min && getMenus().get(i).getTotalPrice() <= max ){
                t.add(getMenus().get(i));
            }
        }
        return t;
    }


    @Override
    public String toString() {
        return "restaurantRegister{" +
                "menues=" + menus +
                ", dishes=" + dishes +
                '}';
    }
}
