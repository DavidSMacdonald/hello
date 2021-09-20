package com.company;

public class MathEx {
    public static void main(String[] args) {
//        System.out.println(swap(123));
//        timeLeft(1,34,8,20);
//        System.out.println(dayOfWeek(2,1));

        // TODO Auto-generated method stub
        int input = 123;
        int output = swap(input);
        System.out.println(input +" " + output);

        input = 6;
        output = swap(input);
        System.out.println(input +" " + output);

        input = 381;
        output = swap(input);
        System.out.println(input +" " + output);

        timeLeft(1,34, 8, 20);
        timeLeft(1,15, 4, 36);

        System.out.println(dayOfWeek(0,1));
        System.out.println(dayOfWeek(0,14));
        System.out.println(dayOfWeek(6, 22));
        System.out.println(dayOfWeek(5, 4));
        System.out.println(dayOfWeek(1,24));
        System.out.println(dayOfWeek(2,1));
    }

    public static int swap(int num) {
        int ones = num % 10;
        int tens = num / 10 % 10;
        return (num/100)*100 + ones*10 + tens;
    }

    public static void timeLeft(int curHour, int curMin, int depHour, int depMin) {
        //take difference of times in total minutes
        int totalMinutes = (depHour-curHour)*60 + depMin-curMin;

        //manipulate total minutes in print command
        System.out.println((totalMinutes/60) + " hours and "+ (totalMinutes%60) + " minutes.");

        //timeLeft(1,15,4,36) returns "3 hours and 21 minutes."
        //timeLeft(1,34,8,20) returns "6 hours and 46 minutes."
    }

    public static int dayOfWeek(int firstDay, int date) {
        return (date - 1 + firstDay) % 7;
        //dayOfWeek(0, 1)  returns 0
        //dayOfWeek(0, 14) returns 6
        //dayOfWeek(6, 22) returns 6
        //dayOfWeek(5, 4)  returns 1
        //dayOfWeek(1, 24) returns 3
        //dayOfWeek(2, 1)  returns 2
    }

}
