package org.alvarx4z.chapters.c02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TimeTest {

    @Test
    @DisplayName("Should calculate in seconds a given passed time since the previous midnight")
    void calculatePassedTimeSinceMidnight() {
        final int hour = 10, minute = 20, second = 30;
        final int response = Time.calculatePassedTimeSinceMidnight(hour, minute, second);
        final int calculation = (hour * 3600) + (minute * 60) + second;

        assertThat(response).isEqualTo(calculation);
    }
}
