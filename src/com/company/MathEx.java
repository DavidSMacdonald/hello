package com.company;

public class MathEx {
    public static void main(String[] args) {
        System.out.println(swap(123));
    }

    public static int swap(int num) {
        int ones = num % 10;
        int tens = num / 10 % 10;
        return (num/100)*100 + ones*10 + tens;
    }

}
