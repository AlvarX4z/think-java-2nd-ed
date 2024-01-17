package org.alvarx4z.chapters.c02;

import org.alvarx4z.exceptions.InvalidHourNumberException;
import org.alvarx4z.exceptions.InvalidMinuteNumberException;
import org.alvarx4z.exceptions.InvalidSecondNumberException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TimeTest {

    private static final int MINUS_TWO = -2;
    private static final int TEN = 10;
    private static final int TWENTY = 20;
    private static final int THIRTY = 30;
    private static final int SIXTY_TWO = 62;

    @Test
    @DisplayName("Should calculate in seconds a given passed time since the previous midnight")
    void calculatePassedTimeSinceMidnight() {
        final int response = Time.calculatePassedTimeSinceMidnight(TEN, TWENTY, THIRTY);

        assertThat(response).isBetween(Time.ZERO, Time.SECONDS_IN_A_DAY);
    }

    @ParameterizedTest
    @ValueSource(ints = {MINUS_TWO, 25})
    @DisplayName("Should throw InvalidHourNumberException if the given hour number is invalid")
    void throwInvalidHourNumberException(int hour) {
        assertThrows(
            InvalidHourNumberException.class,
            () -> Time.calculatePassedTimeSinceMidnight(hour, TWENTY, THIRTY)
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {MINUS_TWO, SIXTY_TWO})
    @DisplayName("Should throw InvalidMinuteNumberException if the given minute number is invalid")
    void throwInvalidMinuteNumberException(int minute) {
        assertThrows(
            InvalidMinuteNumberException.class,
            () -> Time.calculatePassedTimeSinceMidnight(TEN, minute, THIRTY)
        );
    }

    @ParameterizedTest
    @ValueSource(ints = {MINUS_TWO, SIXTY_TWO})
    @DisplayName("Should throw InvalidSecondNumberException if the given second number is invalid")
    void throwInvalidSecondNumberException(int second) {
        assertThrows(
            InvalidSecondNumberException.class,
            () -> Time.calculatePassedTimeSinceMidnight(TEN, TWENTY, second)
        );
    }
}
