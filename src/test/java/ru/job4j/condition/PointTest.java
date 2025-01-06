package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    void whenThis00That20Then2() {
        Point x = new Point(0, 0);
        Point y = new Point(2, 0);
        double expected = 2;
        double output = x.distance(y);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenThis54That12Then4Dot47() {
        Point x = new Point(5, 4);
        Point y = new Point(1, 2);
        double expected = 4.47;
        double output = x.distance(y);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenThis44That2Minus2Then6Dot32() {
        Point x = new Point(4, 4);
        Point y = new Point(2, -2);
        double expected = 6.32;
        double output = x.distance(y);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenDistance3dIs0() {
        Point p1 = new Point(0, 0, 0);
        Point p2 = new Point(0, 0, 0);
        double result = p1.distance3d(p2);
        assertEquals(0, result, 0.01);
    }

    @Test
    public void whenDistance3dIs2() {
        Point p1 = new Point(0, 0, 0);
        Point p2 = new Point(0, 2, 0);
        double result = p1.distance3d(p2);
        assertEquals(2, result, 0.01);
    }

    @Test
    public void whenDistance3dIsSqrt12() {
        Point p1 = new Point(0, 0, 0);
        Point p2 = new Point(2, 2, 2);
        double result = p1.distance3d(p2);
        assertEquals(Math.sqrt(12), result, 0.01);
    }

    @Test
    public void whenDistance3dIsDiagonal() {
        Point p1 = new Point(1, 2, 3);
        Point p2 = new Point(4, 6, 8);
        double result = p1.distance3d(p2);
        assertEquals(Math.sqrt(3 * 3 + 4 * 4 + 5 * 5), result, 0.01);
    }
}