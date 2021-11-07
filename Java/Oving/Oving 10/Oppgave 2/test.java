package com.Documents;


public class test {


    public static void main(String[] args){
        restaurantRegister test = new restaurantRegister();
        test.RegisterNewDish("IDK", "Whatever",500);
        test.RegisterNewDish("IDK2", "Whatever2",501);
        test.RegisterNewDish("IDK3", "Whatever3",502);

        String name = "IDK";
        System.out.println(test.DishName(name).toString());

        String type = "Whatever2";
        System.out.println(test.DishType(type).toString());

        double min = 100;
        double max = 1000;



    }
}
