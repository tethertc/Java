package lab4;

import java.util.Scanner;

public class primer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean accessGranted = false;

        while (!accessGranted) {
            System.out.print("Введите ваш возраст: ");

            // Проверка на корректность ввода
            if (scanner.hasNextInt()) {
                int age = scanner.nextInt();

                if (age < 0) {
                    System.out.println("Ошибка: возраст не может быть отрицательным!");
                } else if (age == 0) {
                    System.out.println("Ошибка: возраст не может быть нулевым!");
                } else if (age < 18) {
                    System.out.println("Доступ запрещен. Вам должно быть не менее 18 лет.");
                    System.out.println("Осталось ждать: " + (18 - age) + " лет");
                    System.out.println("Попробуйте снова через год!\n");
                } else {
                    System.out.println("Доступ разрешен. Добро пожаловать в систему!");
                    accessGranted = true; // Выход из цикла
                }
            } else {
                System.out.println("Ошибка: пожалуйста, введите целое число!");
                scanner.next(); // Очистка некорректного ввода
            }
        }
        scanner.close();
    }
}