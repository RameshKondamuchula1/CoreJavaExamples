package com.java.examples;

public class BalacedParanthesis {

    public static void main(String[] args) {
        BalacedParanthesis paranthesis = new BalacedParanthesis();
        paranthesis.printBalancedparanthesis();
        paranthesis.printBalancedparanthesis2();
    }

    public void printBalancedparanthesis() {
        String input = ")))";
        int balance = 0, neededAtStart = 0;
        for (char c : input.toCharArray()) { // TC O(N)
            if (c == '(') balance++;
            else balance--;

            // If balance is negative, we need an opening bracket at the start
            if (balance < 0) {
                neededAtStart++;
                balance = 0; // Reset for the next characters
            }
        }
        // "neededAtStart" is the '(' count for the front
        // "balance" is the remaining ')' count for the end
        System.out.println("(".repeat(neededAtStart) + input + ")".repeat(balance));
    }


    public void printBalancedparanthesis2() {
        String input = ")))";
        int balance = 0, neededAtStart = 0;
        for (char c : input.toCharArray()) { // O(N) time complexicity
            if (c == '(') balance++;
            else balance--;
        }
        if (balance < 0){
            balance = -balance;
            input = "(".repeat(balance) + input;
        } else {
            input = input + ")".repeat(balance);
        }
        System.out.println(input);
    }
}
