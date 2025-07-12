package ru.job4j;

public class Converter {

    public static float rubleToEuro(float value) {
        // Assuming the conversion rate is 1 Euro = 90 Rubles
        return value / 90;
    }

    public static float rubleToDollar(float value) {
        // Assuming the conversion rate is 1 Dollar = 75 Rubles
        return value / 75;
    }
}