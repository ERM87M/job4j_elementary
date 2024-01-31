package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ReactangleAreaTest {
    @Test
    void whenP6K2Square2() {
        int p = 6;
        double k = 2;
        int expected = 2;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP8K2Square3Dot55() {
        int p = 8;
        double k = 2;
        double expected = 3.55;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));

    }

    @Test
    void whenP4K1Square1() {
        int p = 4;
        double k = 1;
        int expected = 1;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
