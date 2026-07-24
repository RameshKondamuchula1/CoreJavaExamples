package com.java.examples;

public class StringUppercase {
    public static void main(String[] args) {

        String input1 = "UPPERCASE";

        String input = "lowercase";

        StringUppercase stringUppercase = new StringUppercase();

        System.out.println("UPPERCASE: " + stringUppercase.toUpperCasFromString(input));

        System.out.println("lowercase: " + stringUppercase.toLowerCasFromString(input1));
    }

   private String toUpperCasFromString(String input) {

        StringBuilder builder = new StringBuilder();

        input.chars().forEach(c -> {
            if (c >= 97 && c <= 122) {
                builder.append((char) (c - 32));
            }
        });

        return builder.toString();
    }

    private String toLowerCasFromString(String input) {

        StringBuilder builder = new StringBuilder();

        input.chars().forEach(c -> {
            if (c >= 65 && c <= 90) {
                builder.append((char) (c + 32));
            }
        });

        return builder.toString();
    }

}
