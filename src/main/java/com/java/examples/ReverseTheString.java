package com.java.examples;

public class ReverseTheString {

    public static void main(String[] args) {
        ReverseTheString reverseTheString = new ReverseTheString();
        String input = " My name is Kriti. I love Programming";
        String result = reverseTheString.reverseString(input.trim());
        System.out.println(input);
        System.out.println(result);
    }

    private String reverseString(String input) {
        StringBuilder reverse = new StringBuilder();
        String[] inpArray = input.split("\\. ");

        String[] firstSentence = inpArray[0].split(" ");
        String[] secondSentence = inpArray[1].split(" ");

        /*for (int i = firstSentence.length - 1; i >= 0; i--) {
            reverse.append(firstSentence[i]);
            if ( i != 0) {
                reverse.append(" ");
            } else {
                reverse.append(". ");
            }
        }*/

        for (int i = firstSentence.length - 1; i >= 0; i--) {
            reverse.append(i != 0 ? firstSentence[i] + " " : firstSentence[i] + ". ");
        }

        /*for (int i = secondSentence.length - 1; i >= 0; i--) {
            reverse.append(firstSentence[i]);
            if ( i != 0) {
                reverse.append(" ");
            }
        }*/

       for (int i = secondSentence.length - 1; i >= 0; i--) {
            reverse.append(i != 0 ? secondSentence[i] + " " : secondSentence[i]);
        }


        return reverse.toString();
    }


}
