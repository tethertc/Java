package task13;

import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        int[] C = new int[20];
        Random rand = new Random();
        int sum = 0;

        System.out.println("Задание 13: Среднее значение массива");

        // Заполнение массива
        System.out.print("Массив C: ");
        for (int i = 0; i < C.length; i++) {
            C[i] = rand.nextInt(101) - 50;
            System.out.print(C[i] + " ");
            sum += C[i];
        }

        double average = (double) sum / C.length;
        System.out.printf("\nСреднее значение: %.4f\n", average);
    }
}