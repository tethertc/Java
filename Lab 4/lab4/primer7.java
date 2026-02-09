package lab4;

import java.util.Scanner;

public class primer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер месяца (1-12): ");
        int month = scanner.nextInt();

        int days;

        // Определение количества дней в месяце
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) {
            days = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        } else if (month == 2) {
            days = 28; // Февраль без учёта високосного года
        } else {
            System.out.println("Ошибка: месяц должен быть от 1 до 12!");
            scanner.close();
            return; // Выход из программы
        }

        // Вывод названия месяца и количества дней
        String monthName = getMonthName(month);
        System.out.println("В месяце " + monthName + " " + days + " дней.");

        scanner.close();
    }

    // Метод для получения названия месяца
    public static String getMonthName(int month) {
        return switch (month) {
            case 1 -> "Январь";
            case 2 -> "Февраль";
            case 3 -> "Март";
            case 4 -> "Апрель";
            case 5 -> "Май";
            case 6 -> "Июнь";
            case 7 -> "Июль";
            case 8 -> "Август";
            case 9 -> "Сентябрь";
            case 10 -> "Октябрь";
            case 11 -> "Ноябрь";
            case 12 -> "Декабрь";
            default -> "Неизвестный месяц";
        };
    }
}