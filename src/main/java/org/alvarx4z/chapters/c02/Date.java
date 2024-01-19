package org.alvarx4z.chapters.c02;

public final class Date {

    public static void exercise2() {
        final String day = "Wednesday", month = "January";
        final int date = 17, year = 2024;

        System.out.println("| EXERCISE 02 |");
        System.out.println("---------------");
        System.out.printf("American format: %s, %s %s, %s\n", day, month, date, year);
        System.out.printf("European format: %s %s %s %s\n", day, date, month, year);
    }
}
