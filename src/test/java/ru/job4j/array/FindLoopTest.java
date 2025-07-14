package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot9ThenMinus1() {
        int[] data = new int[] {5, 10, 3};
        int element = 9;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
        /* Здесь нужно дописать тест, когда в массиве не найдено число 10.
        Можно искать любое другое число, корректно изменив при этом название теста */
    }
}