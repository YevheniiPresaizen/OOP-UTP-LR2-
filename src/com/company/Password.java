package com.company;
import java.util.Scanner;


public class Password {
    public static void Validation(String args) {
        if (isValidation(args)) {
            System.out.println("Password is valid: " + args);
        } else {
            System.out.println("Password is not valid");
        }
    }
    public static boolean isValidation(String password) {
        int lengthPassword = 8;
        if (password.length() < lengthPassword) return false;

        int letterCounter = 0;
        int numericCounter = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (isNumericValid(ch)) numericCounter++;
            else if (isLetterValid(ch)) letterCounter++;
            else return false;
        }
        return (numericCounter >= 2 && letterCounter >= 0);
    }

    public static boolean isLetterValid(char letter) {
        letter = Character.toLowerCase(letter);
        return (letter >= 'a' && letter <= 'z');
    }


    public static boolean isNumericValid(char ch) {
        return (ch >= '0' && ch <= '9');
    }

}
