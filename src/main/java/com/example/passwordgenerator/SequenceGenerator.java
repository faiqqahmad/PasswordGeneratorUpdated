package com.example.passwordgenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SequenceGenerator {
    private static int length = 0;
    private static boolean upCase = false;
    private static boolean specChar = false;
    private static boolean nums = false;

    public static String generateSequence() {

        // int values will represent different types of characters in the password
        // 0 -> lowercase, 1 -> uppercase, 2 -> numbers, 3 -> special characters

        //Following code creates a random sequence with the chosen options
        List<Integer> selected = new ArrayList<>();
        Random rand = new Random();
        String finalSequence = "";
        List<Integer> numSequence = new ArrayList<>();
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
            
            switch (numSequence.get(i)) {
                case 0:
                    finalSequence = finalSequence + PossibleChars.randomLowercase();
                    break;
                case 1:
                    finalSequence = finalSequence + PossibleChars.randomUppercase();
                    break;
                case 2:
                    finalSequence = finalSequence + PossibleChars.randomNumber();
                    break;
                case 3:
                    finalSequence = finalSequence + PossibleChars.randomSpecial();
                    break;
            }
            
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
