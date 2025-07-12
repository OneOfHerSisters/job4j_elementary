package ru.job4j;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert1RblThen0dot0111Euro() {
        float input = 1;
        float expected = 0.0111f;
        float output = (float) Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert140RblThen1dot5555Euro() {
        float input = 140;
        float expected = 1.5555f;
        float output = (float) Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert1RblThen0dot0133Dollar() {
        float input = 1;
        float expected = 0.0133f;
        float output = (float) Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert180RblThen2dot4Dollar() {
        float input = 180;
        float expected = 2.4f;
        float output = (float) Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }


}