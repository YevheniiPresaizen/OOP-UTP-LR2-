package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. Java method to check whether a string is a valid password.\n" +
                "2. Java method to create the area of a pentagon.\n" +
                "3. Java method to find all twin prime numbers less than 100 \n" +
                "Input your choice ([1-3]): ");
        String yourChoice = input.nextLine();

        switch (yourChoice) {
            case "1":
                System.out.print("1. A password must have at least eight characters.\n" +
                        "2. A password consists of only letters and digits.\n" +
                        "3. A password must contain at least two digits \n" +
                        "Input a password (You are agreeing to the above Terms and Conditions.): ");
                String inputPassword = input.nextLine();

                Password.Validation(inputPassword);
                break;
            case "2":
                System.out.print("Input the number of sides:   ");
                double n = Integer.parseInt(input.nextLine());
                System.out.print("Input the side:   ");
                double s = Integer.parseInt(input.nextLine());

                Pentagon.isAreaPentagon(n, s);
                break;
            case "3":
                TwinPrime.isTwinPrime();
                break;
        }
    }
}
