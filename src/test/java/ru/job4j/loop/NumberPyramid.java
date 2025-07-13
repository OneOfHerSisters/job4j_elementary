package ru.job4j.loop;

public class NumberPyramid {
    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            // Печатаем пробелы
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Печатаем числа в прямом порядке
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            // Печатаем числа в обратном порядке
            for (int t = i - 1; t > 0; t--) {
                System.out.print(t);
            }
            // Переход на новую строку
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Number pyramid of height 3:");
        draw(3);
        System.out.println("Number pyramid of height 5:");
        draw(5);
    }
}
