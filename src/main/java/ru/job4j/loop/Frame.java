package ru.job4j.loop;

public class Frame {
    public static void draw(int size) {
        boolean isTopOrBottomBorder;
        boolean isSideBorder;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if ((row == 0 && col == 0) || (row == size - 1 && col == size - 1)
                        || (row == size - 1 && col == 0) || (row == 0 && col == size - 1)) {
                    isTopOrBottomBorder = true;
                    isSideBorder = true;
                } else if (row == size - 1 || row == 0) {
                    isSideBorder = false;
                    isTopOrBottomBorder = true;
                } else if (col == size - 1 || col == 0) {
                    isSideBorder = true;
                    isTopOrBottomBorder = false;
                } else {
                    isSideBorder = false;
                    isTopOrBottomBorder = false;
                }

                if (isTopOrBottomBorder && isSideBorder) {
                    System.out.print("+");
                    // Углы рамки
                } else if (isTopOrBottomBorder) {
                    System.out.print("-"); // Верхняя и нижняя границы
                } else if (isSideBorder) {
                    System.out.print("|"); // Левые и правые границы
                } else {
                    System.out.print(" "); // Внутреннее пространство рамки
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Draw frame of size 3");
        draw(3);
        System.out.println("Draw frame of size 5");
        draw(5);
    }
}
