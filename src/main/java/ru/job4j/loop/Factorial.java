package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * calculate(number - 1);
    }
}
