package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PointTest {
    @Test
    void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to40thenDot40() {
        int x1 = 2;
        int y1 = 4;
        int x2 = 2;
        int y2 = 8;
        double expected = 4.0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to223thenDot223() {
        int x1 = 3;
        int y1 = 2;
        int x2 = 2;
        int y2 = 4;
        double expected = 2.23;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00to1then1() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 1;
        int y2 = 0;
        double expected = 1;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}