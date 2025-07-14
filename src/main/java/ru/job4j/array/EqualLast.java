package ru.job4j.array;

public class EqualLast {
    public static boolean check(int[] left, int[] right) {
        return left[left.length - 1] == right[right.length - 1]
                && left[left.length - 2] == right[right.length - 2];
    }
}