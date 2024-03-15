package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CounterTwoTest {
    @Test
    void when0T010Then30() {
        int start = 0;
        int finish = 10;
        int expected = 30;
        int output = CounterTwo.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when4T08Then18() {
        int start = 4;
        int finish = 8;
        int expected = 18;
        int output = CounterTwo.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when1T010Then30() {
        int start = 1;
        int finish = 10;
        int expected = 30;
        int output = CounterTwo.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenMinus1T010Then30() {
        int start = -1;
        int finish = 10;
        int expected = 30;
        int output = CounterTwo.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}