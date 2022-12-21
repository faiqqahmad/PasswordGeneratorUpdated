package com.example.passwordgenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SequenceGenerator {
    private static int length;
    private static boolean upCase;
    private static boolean specChar;
    private static boolean nums;
    private static List<Integer> numSequence;
    private static String finalSequence;

    public SequenceGenerator(int length, boolean upCase, boolean specChar, boolean nums) {
        this.length = length;
        this.upCase = upCase;
        this.specChar = specChar;
        this.nums = nums;
        numSequence = new ArrayList<>();
        finalSequence = "";
    }

    public static String generateSequence() {

        // int values will represent different types of characters in the password
        // 0 -> lowercase, 1 -> uppercase, 2 -> numbers, 3 -> special characters

        //Following code creates a random sequence with the chosen options
        List<Integer> selected = new ArrayList<>();
        Random rand = new Random();
        selected.add(0);
        if (upCase) {
            selected.add(1);
        }
        if (specChar) {
            selected.add(3);
        }
        if (nums) {
            selected.add(2);
        }

        for (int i = 0; i < length; i++) {
            numSequence.add(i, selected.get(rand.nextInt(selected.size())));
        }

        for (int i = 0; i < length; i++) { // translates the number sequence into the randomized password
            String added = "";
            switch (numSequence.get(i)) {
                case 0:
                    added = added + PossibleChars.randomLowercase();
                    break;
                case 1:
                    added = added + PossibleChars.randomUppercase();
                    break;
                case 2:
                    added = added + PossibleChars.randomNumber();
                    break;
                case 3:
                    added = added + PossibleChars.randomSpecial();
                    break;
            }
            finalSequence = finalSequence + added;
        }

        return finalSequence;
    }

    public static void setLength(int length1) {
        length = length1;
    }

    public static void setUpCase(boolean upCase1) {
        upCase = upCase1;
    }

    public static void setNums(boolean nums1) {
        nums = nums1;
    }

    public static void setSpecChar(boolean specChar1) {
        specChar = specChar1;
    }

    public static int getLength() {
        return length;
    }

    public static boolean getUpCase() {
        return upCase;
    }

    public static boolean getNums() {
        return nums;
    }

    public static boolean getSpecChar() {
        return specChar;
    }

}
