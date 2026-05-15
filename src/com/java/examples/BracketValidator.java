package com.java.examples;

import java.util.Stack;

public class BracketValidator {
    public static void main(String[] args) {

        System.out.println(validator("{()sh}})")); // Output: false
        System.out.println(validator("{[()()]}")); // Output: true
    }

    public static boolean validator(String input) {
        Stack<Character> bracktes = new Stack<>();
        if(input == null || input.isEmpty()) {
            return false;
        }

        for (char c: input.toCharArray()) {
            if('(' == c || '{' == c || '[' == c) {
                 bracktes.push(c);
            } else if(')' == c || '}' == c || ']' == c) {
                if(bracktes.isEmpty()) {
                    return false;
                }
                char current = bracktes.pop();

                if(c == ')' && current != '(') return false;
                if(c == '}' && current != '{') return false;
                if(c == ']' && current != '[') return false;

            }
        }



        return bracktes.isEmpty();
    }
}
