import java.util.Scanner;
public class Task2_ArithmeticOperations {
    public static void main(String[] args) {
        System.out.println("\n=== ЗАДАНИЕ 2: Арифметические операции ===");

        Scanner scanner = new Scanner(System.in);

        // Ввод двух чисел
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nРезультаты арифметических операций:");
        System.out.println("--------------------------------");

        // Сложение
        double sum = num1 + num2;
        System.out.printf("Сложение: %.2f + %.2f = %.2f%n", num1, num2, sum);

        // Вычитание
        double difference = num1 - num2;
        System.out.printf("Вычитание: %.2f - %.2f = %.2f%n", num1, num2, difference);

        // Умножение
        double product = num1 * num2;
        System.out.printf("Умножение: %.2f * %.2f = %.2f%n", num1, num2, product);

        // Деление (с проверкой)
        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.printf("Деление: %.2f / %.2f = %.2f%n", num1, num2, quotient);
        } else {
            System.out.println("Деление: на ноль делить нельзя!");
        }

        // Демонстрация приоритета операций
        System.out.println("\nДемонстрация приоритета операций:");
        System.out.println("5 + 3 * 2 = " + (5 + 3 * 2) + " (сначала умножение, потом сложение)");
        System.out.println("(5 + 3) * 2 = " + ((5 + 3) * 2) + " (скобки меняют приоритет)");
    }
}