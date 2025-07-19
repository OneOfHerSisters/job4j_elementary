package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void max2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertEquals(result, 2);
    }

    @Test
    void testMax3() {
        Max max = new Max();
        int result = max.max(1, 2, 3);
        assertEquals(result, 3);
    }

    @Test
    void testMax4() {
        Max max = new Max();
        int result = max.max(1, 2, 3, 4);
        assertEquals(result, 4);
    }
}