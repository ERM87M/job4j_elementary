package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class FitTest {
    @Test
    void whenMan187Thendoot10005() {
        short input = 187;
        double expected = 100.05;
        double output = Fit.manWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman175Thendot7475() {
        short input = 175;
        double expected = 74.75;
        double output = Fit.womanWeight(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }
}
