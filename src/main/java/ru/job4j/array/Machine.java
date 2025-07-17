package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int index = 0;
        money -= price;
            while (money > 0 && index < coins.length) {
                if (money >= coins[index]) {
                    result[size++] = coins[index];
                    money -= coins[index];
                } else {
                    index++;
                }
            }
        return Arrays.copyOf(result, size);
    }
}