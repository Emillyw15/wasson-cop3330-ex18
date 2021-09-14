/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Emilly Wasson
 */

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class prog18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Press C to convert from Fahrenheit to Celsius. Press F to convert from Celsius to Fahrenheit. ");
        String convert = in.nextLine().toUpperCase(Locale.ROOT);

        if (Objects.equals(convert, "C")) {
            System.out.println("Your choice: C. \nPlease enter the temperature in Fahrenheit. ");
            int temp = in.nextInt();
            int C = (temp - 32) * 5 / 9;
            System.out.print("The temperature in Celsius is " + C + " degrees.");
        }
        else if (Objects.equals(convert, "F")) {
            System.out.println("Your choice: F. \nPlease enter the temperature in Celsius. ");
            int temp = in.nextInt();
            int F = (temp * 9 / 5) + 32;
            System.out.print("The temperature in Fahrenheit is " + F + " degrees.");
        }
        else {
            System.out.print("This is not a known value.");
            System.exit(0);
        }
    }
}
