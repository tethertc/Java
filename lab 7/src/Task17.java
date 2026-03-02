package task17;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задание 17: Работа со строками");

        // Ввод строк
        System.out.print("Введите s1: ");
        String s1 = scanner.nextLine();

        System.out.print("Введите s2: ");
        String s2 = scanner.nextLine();

        System.out.print("Введите s3: ");
        String s3 = scanner.nextLine();

        System.out.print("Введите s4: ");
        String s4 = scanner.nextLine();

        System.out.print("Введите s5: ");
        String s5 = scanner.nextLine();

        System.out.println("\nРезультат:");
        if (s4.equals(s5)) {
            // Если s4 равно s5, объединить s1 и s2
            String result = s1 + s2;
            System.out.println("s4 равно s5, результат s1+s2: " + result);
        } else {
            // Иначе объединить s1 и s3
            String result = s1 + s3;
            System.out.println("s4 не равно s5, результат s1+s3: " + result);
        }

        scanner.close();
    }
}