package com.Documents;

public class testProperty {

    public static void main(String[] args){
        propertyRegister pr = new propertyRegister();

        property newProperty = new property(1445,"Gloppen",77,631,"no name",1017.6,"Jens Olsen");
        pr.RegisterNewProperty(1445,"Gloppen",77,631,"no name",1017.6,"Jens Olsen");

        property newProperty2 = new property(1445,"Gloppen",77,131,"Syningom",661.3,"Nicolay Madsen");
        pr.RegisterNewProperty(1445,"Gloppen",77,131,"Syningom",661.3,"Nicolay Madsen");

        property newProperty3 = new property(1445,"Gloppen",75,19,"Fugletun",650.6,"Evilyn Jensen");
        pr.RegisterNewProperty(1445,"Gloppen",75,19,"Fugletun",650.6,"Evilyn Jensen");

        property newProperty4 = new property(1445,"Gloppen",74,188,"no name",1457.2,"Karl Ove Broten");
        pr.RegisterNewProperty(1445,"Gloppen",74,188,"no name",1457.2,"Karl Ove Broten");

        property newProperty5 = new property(1445,"Gloppen",69,47,"Hoiberg",1339.4,"Elsa Indregord");
        pr.RegisterNewProperty(1445,"Gloppen",69,47,"Hoiberg",1339.4,"Elsa Indregord");





        System.out.println(" New properties is now registered ");
        System.out.println("");
        System.out.println(pr.PrintAllProperties().toString());
        System.out.println("Total properties registered is:" + pr.getTotalProperties());
        System.out.println("");
        System.out.println(pr.FindProperties(1445,77,631).toString());
        System.out.println("");
        System.out.println(pr.AverageArea() + "m2");
        System.out.println("");
        System.out.println(" Test is now completed ");
    }
}




