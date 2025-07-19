package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints00And20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2.0;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        Point a = new Point(-1, -1);
        Point b = new Point(1, 1);
        double expected = 2.83;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        Point a = new Point(-2, -2);
        Point b = new Point(2, 2);
        double expected = 5.66;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints00AndMinus1Minus1Then5Dot66() {
        Point a = new Point(0, 0);
        Point b = new Point(-1, -1);
        double expected = 1.41;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints000And111Then1Dot73() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        double expected = 1.73;
        double result = a.distance3d(b);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints123And321Then3Dot46() {
        Point a = new Point(1, 2, 3);
        Point b = new Point(3, 2, 1);
        double expected = 2.83;
        double result = a.distance3d(b);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus100And100Then2() {
        Point a = new Point(-1, 0, 0);
        Point b = new Point(1, 0, 0);
        double expected = 2;
        double result = a.distance3d(b);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenSamePointsThen0() {
        Point a = new Point(3, -5, 7);
        Point b = new Point(3, -5, 7);
        double expected = 0;
        double result = a.distance3d(b);
        assertThat(result).isEqualTo(expected, withPrecision(0.01));
    }
}
