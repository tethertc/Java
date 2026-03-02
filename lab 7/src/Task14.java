package task14;

import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        int[] D = new int[30];
        Random rand = new Random();
        int sumEven = 0;  // сумма чётных
        int sumOdd = 0;   // сумма нечётных

        System.out.println("Задание 14: Сумма чётных и нечётных элементов");

        // Заполнение массива
        System.out.print("Массив D: ");
        for (int i = 0; i < D.length; i++) {
            D[i] = rand.nextInt(101) - 50;
            System.out.print(D[i] + " ");

            if (D[i] % 2 == 0) {
                sumEven += D[i];
            } else {
                sumOdd += D[i];
            }
        }

        System.out.println("\nСумма чётных элементов: " + sumEven);
        System.out.println("Сумма нечётных элементов: " + sumOdd);
    }
}