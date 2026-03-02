package task10;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        int[][] D = new int[7][7];
        Random rand = new Random();
        int sum = 0;

        System.out.println("Задание 10: Среднее арифметическое элементов главной диагонали");

        // Заполнение и вывод матрицы
        System.out.println("Матрица D[7][7]:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                D[i][j] = rand.nextInt(41) - 20;
                System.out.printf("%4d", D[i][j]);
            }
            System.out.println();
        }

        // Вычисление суммы элементов главной диагонали
        System.out.print("\nЭлементы главной диагонали: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(D[i][i] + " ");
            sum += D[i][i];
        }

        double average = (double) sum / 7;
        System.out.printf("\nСреднее арифметическое элементов главной диагонали: %.4f\n", average);
    }
}