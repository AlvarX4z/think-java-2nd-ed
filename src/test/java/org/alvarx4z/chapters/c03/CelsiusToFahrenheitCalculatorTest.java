package org.alvarx4z.chapters.c03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

final class CelsiusToFahrenheitCalculatorTest {

    @Test
    @DisplayName("Should calculate an input from Celsius to Fahrenheit")
    void calculateFahrenheit() {
        final double response = CelsiusToFahrenheitCalculator.calculate(24);

        assertThat(response).isEqualTo(75.2);
    }
}
