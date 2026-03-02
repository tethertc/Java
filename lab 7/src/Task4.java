package task4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] C = new int[25];
        Random rand = new Random();
        long product = 1;
        boolean hasPositive = false;

        System.out.println("Задание 4: Произведение положительных элементов массива C[25]");
        System.out.print("Массив C: ");

        for (int i = 0; i < C.length; i++) {
            C[i] = rand.nextInt(41) - 20;
            System.out.print(C[i] + " ");
            if (C[i] > 0) {
                product *= C[i];
                hasPositive = true;
            }
        }

        if (hasPositive) {
            System.out.println("\nПроизведение положительных элементов: " + product);
        } else {
            System.out.println("\nПоложительных элементов нет");
        }
    }
}