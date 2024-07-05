package ru.job4j.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
        @Test
        public void whenSort() {
            int[] data = new int[]{3, 4, 1, 2, 5};
            int[] result = SortSelected.sort(data);
            int[] expected = new int[]{1, 2, 3, 4, 5};
            assertThat(result).containsExactly(expected);
        }

        @Test
        public void whenSortThree() {
            int[] data = new int[]{3, 1, 2};
            int[] result = SortSelected.sort(data);
            int[] expected = new int[]{1, 2, 3};
            assertThat(result).containsExactly(expected);
        }

        @Test
        public void whenSortFive() {
            int[] data = new int[]{4, 2, 3, 1, 5};
            int[] result = SortSelected.sort(data);
            int[] expected = new int[]{1, 2, 3, 4, 5};
            assertThat(result).containsExactly(expected);
        }
    }

