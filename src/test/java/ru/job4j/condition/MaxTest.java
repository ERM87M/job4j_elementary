package ru.job4j.condition;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test

    public void whenFourNumbersAreDifferent() {
        int result = Max.max(2, 4, 6, 8);
        assertThat(result).isEqualTo(8);
    }

    @Test

    public void whenThreeNumbersAreDifferent() {
        int result = Max.max(1, 2, 3);
        assertThat(result).isEqualTo(3);
    }

    @Test
    public void whenAllFourNumbersAreEqual() {
        int result = Max.max(5, 5, 5, 5);
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void whenTwoNumbersAreEqualAndLargest() {
        int result = Max.max(7, 7, 3, 5);
        assertThat(result).isEqualTo(7);
    }

    @Test
    public void whenAllNegativeNumbers() {
        int result = Max.max(-10, -5, -20, -15);
        assertThat(result).isEqualTo(-5);
    }

    @Test
    public void whenMixOfPositiveAndNegativeNumbers() {
        int result = Max.max(-3, 0, 5, -1);
        assertThat(result).isEqualTo(5);
    }
}

