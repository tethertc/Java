package task3;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        double[] A = new double[12];
        Random rand = new Random();
        double product = 1.0;
        boolean hasNegative = false;

        System.out.println("Задание 3: Произведение отрицательных элементов массива A[12]");
        System.out.print("Массив A: ");

        for (int i = 0; i < A.length; i++) {
            A[i] = (rand.nextDouble() * 20) - 10; // числа от -10 до 10
            System.out.printf("%.2f ", A[i]);
            if (A[i] < 0) {
                product *= A[i];
                hasNegative = true;
            }
        }

        if (hasNegative) {
            System.out.printf("\nПроизведение отрицательных элементов: %.4f\n", product);
        } else {
            System.out.println("\nОтрицательных элементов нет");
        }
    }
}