package org.alvarx4z.chapters.c02;

import org.alvarx4z.exceptions.InvalidHourNumberException;
import org.alvarx4z.exceptions.InvalidMinuteNumberException;
import org.alvarx4z.exceptions.InvalidSecondNumberException;

public class Time {

    static final int SECONDS_IN_A_DAY = 24 * 60 * 60;
    static final int ZERO = 0;
    static final int TWENTY_THREE = 23;
    static final int FIFTY_NINE = 59;
    static final int SIXTY = 60;

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
        checkHourNumber(hour);
        checkMinuteAndSecondNumbers(minute, second);
        return (hour * SIXTY * SIXTY) + (minute * SIXTY) + second;
    }

    static int calculateRemainingTimeUntilMidnight(int passedSeconds) {
        return SECONDS_IN_A_DAY - passedSeconds;
    }

    private static void checkHourNumber(int hour) {
        if (hour < ZERO || hour > TWENTY_THREE) {
            throw new InvalidHourNumberException();
        }
    }

    private static void checkMinuteAndSecondNumbers(int minute, int second) {
        if (minute < ZERO || minute > FIFTY_NINE) {
            throw new InvalidMinuteNumberException();
        }

        if (second < ZERO || second > FIFTY_NINE) {
            throw new InvalidSecondNumberException();
        }
    }
}
