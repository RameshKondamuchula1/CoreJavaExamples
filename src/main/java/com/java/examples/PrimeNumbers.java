package com.java.examples;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(1139));
        System.out.println(isPrime(1141));
    }

    static boolean isPrime(int n) {
        if (n <=1) return false;
        if (n ==2) return true;
        if (n%2==0) return false;
        double condition = Math.sqrt(n);
        for (int i = 3; i <= condition; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
