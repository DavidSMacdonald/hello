package com.company;

public class YummyFood {
    public static void main(String[] args) {
        System.out.print("Yummy ");
        System.out.println("Food");
        iceCream();
    }
    public static void chocolate(){
        System.out.println("CHOCOLATE");
    }

    public static void iceCream(){
        System.out.println("Chunky Chocolate Pudding");
        chocolate();
        System.out.println("That was yummy!!!!!! XD");
    }
}
