package org.alvarx4z.chapters.c02;

public class Time {

    static final int SECONDS_IN_A_DAY = 24 * 60 * 60;

    public static void exercise3() {
        final int hour = 15, minute = 8, second = 30;
        final int passedSecondsSinceMidnight = calculatePassedTimeSinceMidnight(hour, minute, second);
        final int remainingSecondsUntilMidnight = calculateRemainingTimeUntilMidnight(passedSecondsSinceMidnight);

        System.out.println("\n| EXERCISE 03 |");
        System.out.println("---------------");
        System.out.printf("Time passed since midnight (seconds): %s\n", passedSecondsSinceMidnight);
        System.out.printf("Remaining times until midnight (seconds): %s\n", remainingSecondsUntilMidnight);
        System.out.printf("Percentage of time passed since midnight: %d\n", 123);
        System.out.println(passedSecondsSinceMidnight / SECONDS_IN_A_DAY);
    }

    static int calculatePassedTimeSinceMidnight(int hour, int minute, int second) {
        return (hour * 3600) + (minute * 60) + second;
    }

    static int calculateRemainingTimeUntilMidnight(int passedSeconds) {
        return SECONDS_IN_A_DAY - passedSeconds;
    }
}
