package org.alvarx4z.chapters.c02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TimeTest {

    @Test
    @DisplayName("Should calculate in seconds a given passed time since the previous midnight")
    void calculatePassedTimeSinceMidnight() {
        final int response = Time.calculatePassedTimeSinceMidnight(10, 20, 30);

        assertThat(response).isBetween(Time.ZERO, Time.SECONDS_IN_A_DAY);
    }
}
