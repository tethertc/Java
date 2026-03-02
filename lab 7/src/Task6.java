package task6;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int[][] A = new int[10][10];
        int[] B = new int[10];
        Random rand = new Random();

        System.out.println("Задание 6: Сумма отрицательных элементов по строкам");

        // Заполнение и вывод матрицы
        System.out.println("Матрица A[10][10]:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                A[i][j] = rand.nextInt(41) - 20;
                System.out.printf("%4d", A[i][j]);
            }
            System.out.println();
        }

        // Вычисление суммы отрицательных по строкам
        for (int i = 0; i < 10; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                if (A[i][j] < 0) {
                    sum += A[i][j];
                }
            }
            B[i] = sum;
        }

        // Вывод результата
        System.out.println("\nМассив B[10] (суммы отрицательных по строкам):");
        for (int i = 0; i < 10; i++) {
            System.out.println("Строка " + i + ": " + B[i]);
        }
    }
}