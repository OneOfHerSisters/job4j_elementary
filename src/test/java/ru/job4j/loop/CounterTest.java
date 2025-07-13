package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {
    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus6To2ThenMinus10() {
        int start = -6;
        int finish = 2;
        int result = Counter.sumByEven(start, finish);
        int expected = -10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom6ToMinus2Then0() {
        int start = 6;
        int finish = -2;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus10ToMinus6ThenMinus24() {
        int start = -10;
        int finish = -6;
        int result = Counter.sumByEven(start, finish);
        int expected = -24;
        assertThat(result).isEqualTo(expected);
    }
}