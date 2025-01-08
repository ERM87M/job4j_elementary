package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.withPrecision;

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
    public void whenThis00That00Then0() {
        Point p1 = new Point(0, 0, 0);
        Point p2 = new Point(0, 0, 0);
        double expected = 0;
        double result = p1.distance3d(p2);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenThis00That02Then2() {
        Point p1 = new Point(0, 0, 0);
        Point p2 = new Point(0, 2, 0);
        double expected = 2;
        double result = p1.distance3d(p2);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenThis00That111Then1Dot73() {
        Point p1 = new Point(0, 0, 0);
        Point p2 = new Point(1, 1, 1);
        double expected = 1.73;
        double result = p1.distance3d(p2);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

}
