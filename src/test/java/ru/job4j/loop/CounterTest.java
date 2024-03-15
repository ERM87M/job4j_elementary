package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import ru.job4j.loop.Counter;

import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {

    @Test
    void when0To5then15() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int output = Counter.sum(0, 5);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when3To8Then33() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        int output = Counter.sum(3, 8);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when0To10Then55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int output = Counter.sum(0, 10);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when5To2Then0() {
        int start = 5;
        int finish = 2;
        int expected = 0;
        int output = Counter.sum(5, 2);
        assertThat(output).isEqualTo(expected);
    }
}

