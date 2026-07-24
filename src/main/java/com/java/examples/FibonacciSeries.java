package com.java.examples;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 10;
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        fibonacciSeries.fib(n);

        for (int i = 0; i < n; i++) {

            System.out.print(" "+fibonacciSeries.fibWithRecursive(i));
        }
    }

    public void fib(int n) {

        int num1 = 0;
        int num2 = 1;
        System.out.print(num1 + " " + num2);

        for (int i = 2; i < n; i++) {
            int num3 = num2 + num1;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }


    public int fibWithRecursive(int n) {

        if(n <= 1) return n;

        return fibWithRecursive(n - 1) + fibWithRecursive(n - 2);
    }
}
