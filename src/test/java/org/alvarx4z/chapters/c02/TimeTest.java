package org.alvarx4z.chapters.c02;

import org.alvarx4z.exceptions.InvalidHourNumberException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class TimeTest {

    @Test
    @DisplayName("Should calculate in seconds a given passed time since the previous midnight")
    void calculatePassedTimeSinceMidnight() {
        final int response = Time.calculatePassedTimeSinceMidnight(10, 20, 30);

        assertThat(response).isBetween(Time.ZERO, Time.SECONDS_IN_A_DAY);
    }

    @ParameterizedTest
    @ValueSource(ints = {-2, 25})
    @DisplayName("Should throw InvalidHourNumberException if the given hour number is invalid")
    void throwInvalidHourNumberException(int hour) {
        Assertions.assertThrows(
            InvalidHourNumberException.class,
            () -> Time.calculatePassedTimeSinceMidnight(hour, 20, 30)
        );
    }
}
