package org.alvarx4z.chapters.c03;

import java.util.Scanner;

public final class CelsiusToFahrenheitCalculator {

    public static void exercise2() {
        final Scanner scan = new Scanner(System.in);
        boolean isValidInput = false;

        System.out.println("\n| EXERCISE 02 |");
        System.out.println("---------------");
        System.out.print("Enter a temperature in Celsius: ");

        while (!isValidInput) {
            try {
                double celsiusInput = scan.nextDouble();
                System.out.printf("%.1f C = %.1f F\n", celsiusInput, calculate(celsiusInput));
                isValidInput = true;
            } catch (Exception ex) {
                System.err.println("Invalid Celsius temperature input. Try again: ");
                scan.next();
            }
        }

        scan.close();
    }

    static double calculate(double celsius) {
        return celsius * (9.0 / 5) + 32;
    }
}
