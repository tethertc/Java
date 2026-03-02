package task7;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int[][] B = new int[5][5];
        int[] A = new int[5];
        Random rand = new Random();

        System.out.println("Задание 7: Сумма положительных элементов по строкам");

        // Заполнение и вывод матрицы
        System.out.println("Матрица B[5][5]:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                B[i][j] = rand.nextInt(41) - 20;
                System.out.printf("%4d", B[i][j]);
            }
            System.out.println();
        }

        // Вычисление суммы положительных по строкам
        for (int i = 0; i < 5; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                if (B[i][j] > 0) {
                    sum += B[i][j];
                }
            }
            A[i] = sum;
        }

        // Вывод результата
        System.out.println("\nМассив A[5] (суммы положительных по строкам):");
        for (int i = 0; i < 5; i++) {
            System.out.println("Строка " + i + ": " + A[i]);
        }
    }
}