package com.example.passwordgenerator;

import java.util.Random;

public class PossibleChars {

    private static String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String lowercase = "abcdefghijklmnopqrstuvwxyz";
    private static String numbers = "0123456789";
    private static String special = "!@#$%^&*()-_+=";

    public static String randomUppercase() {
        Random rand = new Random();
        int begInd = rand.nextInt(uppercase.length());
        return uppercase.substring(begInd, begInd + 1);
    }

    public static String randomLowercase() {
        Random rand = new Random();
        int begInd = rand.nextInt(lowercase.length());
        return lowercase.substring(begInd, begInd + 1);
    }

    public static String randomNumber() {
        Random rand = new Random();
        int begInd = rand.nextInt(numbers.length());
        return numbers.substring(begInd, begInd + 1);
    }

    public static String randomSpecial() {
        Random rand = new Random();
        int begInd = rand.nextInt(special.length());
        return special.substring(begInd, begInd + 1);
    }
}
