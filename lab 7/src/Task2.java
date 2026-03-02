package task2;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] B = new int[15];
        Random rand = new Random();
        int sum = 0;

        System.out.println("Задание 2: Сумма положительных элементов массива B[15]");
        System.out.print("Массив B: ");

        for (int i = 0; i < B.length; i++) {
            B[i] = rand.nextInt(41) - 20;
            System.out.print(B[i] + " ");
            if (B[i] > 0) {
                sum += B[i];
            }
        }

        System.out.println("\nСумма положительных элементов: " + sum);
    }
}