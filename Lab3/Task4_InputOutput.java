import java.util.Scanner;
public class Task4_InputOutput {
    public static void main(String[] args) {
        System.out.println("\n=== ЗАДАНИЕ 4: Ввод и вывод данных ===");

        // Создание объекта Scanner для ввода данных
        Scanner scanner = new Scanner(System.in);

        // Запрос числа у пользователя
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        // Вычисление квадрата числа
        int square = number * number;

        // Вывод результата
        System.out.println("Вы ввели число: " + number);
        System.out.println("Квадрат числа " + number + " равен: " + square);

        // Дополнительная демонстрация
        System.out.println("\nПроверка: " + number + "² = " + number + " * " + number + " = " + square);

        scanner.close();
    }
}