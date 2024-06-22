package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinTest {
    @Test
    public void whenFirstMin() {
        int[] arr = new int[]{0, 5, 10};
        int res = Min.findMin(arr);
        int expected = 0;
        assertThat(res).isEqualTo(expected);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[]{10, 5, 3};
        int result = Min.findMin(array);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[]{10, 2, 5};
        int result = Min.findMin(array);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }
}
