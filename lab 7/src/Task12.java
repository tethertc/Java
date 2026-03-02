package task12;

import java.util.Random;
import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[] B = new int[25];
        Random rand = new Random();

        System.out.println("Задание 12: Сортировка массива по возрастанию");

        // Заполнение массива
        System.out.print("Исходный массив B: ");
        for (int i = 0; i < B.length; i++) {
            B[i] = rand.nextInt(101) - 50;
            System.out.print(B[i] + " ");
        }

        // Сортировка пузырьком
        for (int i = 0; i < B.length - 1; i++) {
            for (int j = 0; j < B.length - i - 1; j++) {
                if (B[j] > B[j + 1]) {
                    int temp = B[j];
                    B[j] = B[j + 1];
                    B[j + 1] = temp;
                }
            }
        }

        // Вывод отсортированного массива
        System.out.print("\nОтсортированный массив: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

        // Альтернативный способ с использованием Arrays.sort()
        // Arrays.sort(B);
    }
}