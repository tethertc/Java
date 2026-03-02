package task5;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        double[] D = new double[17];
        Random rand = new Random();
        double sum = 0;

        System.out.println("Задание 5: Среднее арифметическое элементов массива D[17]");
        System.out.print("Массив D: ");

        for (int i = 0; i < D.length; i++) {
            D[i] = rand.nextDouble() * 20 - 10;
            System.out.printf("%.2f ", D[i]);
            sum += D[i];
        }

        double average = sum / D.length;
        System.out.printf("\nСреднее арифметическое: %.4f\n", average);
    }
}