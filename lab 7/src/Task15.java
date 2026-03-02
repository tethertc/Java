package task15;

import java.util.Random;

public class Task15 {
    public static void main(String[] args) {
        int[][] table = new int[3][5];
        Random rand = new Random();

        System.out.println("Задание 15: Таблица 3×5 случайных чисел (a(i,j) < 10)");

        // Заполнение и вывод таблицы
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                table[i][j] = rand.nextInt(10); // числа от 0 до 9
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}