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


    @Test
    public void whenDiapasonHas8ThenResultEqualFinish() {
        int[] data = new int[] {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int element = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = new int[] {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int element = 4;
        int start = 1;
        int finish = 8;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int element = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot8ThenMinus1() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int element = 8;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
        /* Дописать тест, когда элемент 8 в диапазоне не найден.
        Можно искать любой другой элемент, корректно отражая этот факт в названии теста. */
    }

    @Test
    public void whenDiapasonHas0Then4() {
        int[] data = new int[] {1, 2, 3, 4, 0};
        int element = 0;
        int start = 3;
        int finish = 4;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

}
