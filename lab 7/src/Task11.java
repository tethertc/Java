package task11;

import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        int[] A = new int[25];
        Random rand = new Random();

        System.out.println("Задание 11: Поменять местами максимальный и минимальный элементы");

        // Заполнение массива
        System.out.print("Исходный массив A: ");
        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(101) - 50; // числа от -50 до 50
            System.out.print(A[i] + " ");
        }

        // Поиск индексов min и max
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[minIndex]) {
                minIndex = i;
            }
            if (A[i] > A[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("\nМинимальный элемент: " + A[minIndex] + " [индекс " + minIndex + "]");
        System.out.println("Максимальный элемент: " + A[maxIndex] + " [индекс " + maxIndex + "]");

        // Обмен элементов
        int temp = A[minIndex];
        A[minIndex] = A[maxIndex];
        A[maxIndex] = temp;

        // Вывод измененного массива
        System.out.print("Массив после замены: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }
}