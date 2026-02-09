package lab4;

import java.util.Scanner;

public class primer9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Проверка попадания в произвольный диапазон ===");

        // Ввод границ диапазона
        System.out.print("Введите нижнюю границу диапазона: ");
        int min = scanner.nextInt();

        System.out.print("Введите верхнюю границу диапазона: ");
        int max = scanner.nextInt();

        // Проверка корректности диапазона
        if (min > max) {
            System.out.println("⚠️ Внимание: нижняя граница больше верхней!");
            System.out.println("Меняем границы местами...");
            int temp = min;
            min = max;
            max = temp;
        }

        System.out.println("\nДиапазон установлен: [" + min + ", " + max + "]");

        // Цикл для проверки нескольких чисел
        while (true) {
            System.out.print("\nВведите число для проверки (или '999' для выхода): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка: введите целое число!");
                scanner.next(); // Очистка ввода
                continue;
            }

            int number = scanner.nextInt();

            // Проверка на выход
            if (number == 999) {
                System.out.println("Программа завершена.");
                break;
            }

            // Проверка попадания в диапазон
            checkNumberInRange(number, min, max);
        }

        scanner.close();
    }

    // Метод для проверки числа в диапазоне
    public static void checkNumberInRange(int number, int min, int max) {
        boolean inRange = (number >= min && number <= max);

        System.out.println("Число: " + number);
        System.out.println("Диапазон: [" + min + ", " + max + "]");

        if (inRange) {
            System.out.println("✅ Попадает в диапазон!");

            // Дополнительная информация
            System.out.println("Информация о положении:");
            System.out.println("  Расстояние от начала: " + (number - min));
            System.out.println("  Расстояние до конца: " + (max - number));

            // Определяем треть диапазона
            int rangeSize = max - min + 1;
            int position = number - min + 1;

            System.out.printf("  Позиция в диапазоне: %d из %d%n", position, rangeSize);

            if (position <= rangeSize / 3) {
                System.out.println("  Находится в первой трети диапазона");
            } else if (position <= 2 * rangeSize / 3) {
                System.out.println("  Находится во второй трети диапазона");
            } else {
                System.out.println("  Находится в последней трети диапазона");
            }

        } else {
            System.out.println("❌ НЕ попадает в диапазон!");

            if (number < min) {
                System.out.println("  Число меньше минимальной границы");
                System.out.println("  Не хватает: " + (min - number) + " до начала диапазона");
            } else {
                System.out.println("  Число больше максимальной границы");
                System.out.println("  Превышение: " + (number - max) + " после конца диапазона");
            }
        }
    }
}