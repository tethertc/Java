package task8;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        int[][] A = new int[12][6];
        double[] products = new double[6];
        Random rand = new Random();

        System.out.println("Задание 8: Произведение отрицательных элементов по столбцам");

        // Инициализация массивов для произведений
        for (int j = 0; j < 6; j++) {
            products[j] = 1;
        }

        // Заполнение и вывод матрицы
        System.out.println("Матрица A[12][6]:");
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                A[i][j] = rand.nextInt(41) - 20;
                System.out.printf("%4d", A[i][j]);

                if (A[i][j] < 0) {
                    products[j] *= A[i][j];
                }
            }
            System.out.println();
        }

        // Вывод результата
        System.out.println("\nПроизведения отрицательных элементов по столбцам:");
        for (int j = 0; j < 6; j++) {
            System.out.println("Столбец " + j + ": " + products[j]);
        }
    }
}