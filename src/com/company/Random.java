package com.company;

import java.security.spec.RSAOtherPrimeInfo;

public class Random {
    public static void main(String[] args) {
        double r = 10 * Math.random(); // [0.0, 10.0)
        System.out.println(r);
        int p = (int) (r + 0.5); // [0, 10]
        System.out.println(p);
    }
}