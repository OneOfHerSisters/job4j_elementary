package ru.job4j.condition;

public class Max {
    public int max(int first, int second) {
        return Math.max(first, second);
    }

    public int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public int max(int first, int second, int third, int fourth) {
        return max(max(first, second), third, fourth);
    }

    public static void main(String[] args) {
        Max max = new Max();
        System.out.println(max.max(3, 4, 5, 6));
        System.out.println(max.max(3, 4, 5));
        System.out.println(max.max(3, 4));
    }
}

