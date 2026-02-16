import java.util.Scanner;
public class Task1_CommandSequence {
    public static void main(String[] args) {
        System.out.println("\n=== ЗАДАНИЕ 1: Последовательность выполнения команд ===");

        // Объявление трех целочисленных переменных
        int number1 = 15;
        int number2 = 25;
        int number3 = 40;

        System.out.println("Шаг 1: Объявлены переменные:");
        System.out.println("   number1 = " + number1);
        System.out.println("   number2 = " + number2);
        System.out.println("   number3 = " + number3);

        // Выполнение сложения
        int sum = number1 + number2 + number3;
        System.out.println("Шаг 2: Выполняется сложение: " + number1 + " + " + number2 + " + " + number3);

        // Вывод результата
        System.out.println("Шаг 3: Результат сложения (sum) = " + sum);

        System.out.println("\nВывод: Команды выполняются строго последовательно, сверху вниз");
    }
}