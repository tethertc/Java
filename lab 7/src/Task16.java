package task16;

import java.util.Random;

public class Task16 {
    public static void main(String[] args) {
        System.out.println("Задание 16: Поиск максимального элемента");

        // Тестирование метода maxX
        int maxElement = maxX();
        System.out.println("\nМаксимальный элемент: " + maxElement);
    }

    public static int maxX() {
        int[] array = new int[10];
        Random rand = new Random();

        System.out.print("Исходный массив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(50 * rand.nextDouble());
            System.out.print(array[i] + " ");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }
}