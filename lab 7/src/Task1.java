package task1;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] A = new int[20];
        Random rand = new Random();
        int sum = 0;

        System.out.println("Задание 1: Сумма отрицательных элементов массива A[20]");
        System.out.print("Массив A: ");

        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(41) - 20; // числа от -20 до 20
            System.out.print(A[i] + " ");
            if (A[i] < 0) {
                sum += A[i];
            }
        }

        System.out.println("\nСумма отрицательных элементов: " + sum);
    }
}