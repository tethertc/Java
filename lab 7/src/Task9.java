package task9;

import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        int[][] C = new int[5][5];
        Random rand = new Random();
        long product = 1;
        boolean hasPositive = false;

        System.out.println("Задание 9: Произведение положительных элементов главной диагонали");

        // Заполнение и вывод матрицы
        System.out.println("Матрица C[5][5]:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                C[i][j] = rand.nextInt(41) - 20;
                System.out.printf("%4d", C[i][j]);
            }
            System.out.println();
        }

        // Вычисление произведения положительных на главной диагонали
        System.out.print("\nЭлементы главной диагонали: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(C[i][i] + " ");
            if (C[i][i] > 0) {
                product *= C[i][i];
                hasPositive = true;
            }
        }

        if (hasPositive) {
            System.out.println("\nПроизведение положительных элементов главной диагонали: " + product);
        } else {
            System.out.println("\nПоложительных элементов на главной диагонали нет");
        }
    }
}