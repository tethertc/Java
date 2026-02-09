package lab4;

import java.util.Scanner;

public class primer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Простой калькулятор ===");

        // Ввод данных
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result;
        boolean validOperation = true;

        // Выполнение операции
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, result);
                break;

            case '-':
                result = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, result);
                break;

            case '*':
                result = num1 * num2;
                System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, result);
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    validOperation = false;
                }
                break;

            default:
                System.out.println("Ошибка: неверная операция!");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("Операция выполнена успешно!");
        }

        scanner.close();
    }
}