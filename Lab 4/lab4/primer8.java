package lab4;

import java.util.Scanner;

public class primer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Определение состояния температуры ===");
        System.out.println("1. Градусы Цельсия (°C)");
        System.out.println("2. Градусы Фаренгейта (°F)");
        System.out.print("Выберите шкалу измерения (1 или 2): ");

        int choice = scanner.nextInt();
        double temperature;

        if (choice == 1) {
            System.out.print("Введите температуру в °C: ");
            temperature = scanner.nextDouble();
            printTemperatureState(temperature, "°C", true);
        } else if (choice == 2) {
            System.out.print("Введите температуру в °F: ");
            temperature = scanner.nextDouble();
            // Конвертация Фаренгейта в Цельсий
            double tempCelsius = (temperature - 32) * 5.0 / 9.0;
            printTemperatureState(tempCelsius, "°F", false);
        } else {
            System.out.println("Ошибка: выберите 1 или 2!");
        }

        scanner.close();
    }

    // Метод для определения и вывода состояния
    public static void printTemperatureState(double tempCelsius, String unit, boolean isCelsius) {
        String state;
        String emoji;

        if (tempCelsius < -20) {
            state = "Экстремальный мороз";
            emoji = "🧊";
        } else if (tempCelsius < 0) {
            state = "Морозно";
            emoji = "❄️";
        } else if (tempCelsius < 10) {
            state = "Холодно";
            emoji = "🥶";
        } else if (tempCelsius < 15) {
            state = "Прохладно";
            emoji = "😊";
        } else if (tempCelsius < 25) {
            state = "Комфортно";
            emoji = "😌";
        } else if (tempCelsius < 30) {
            state = "Тепло";
            emoji = "☀️";
        } else if (tempCelsius < 35) {
            state = "Жарко";
            emoji = "🔥";
        } else {
            state = "Экстремальная жара";
            emoji = "🥵";
        }

        if (isCelsius) {
            System.out.printf("Температура: %.1f°C%n", tempCelsius);
        } else {
            // Конвертируем обратно для вывода в Фаренгейтах
            double tempFahrenheit = tempCelsius * 9.0 / 5.0 + 32;
            System.out.printf("Температура: %.1f°F%n", tempFahrenheit);
        }
        System.out.println("Состояние: " + state + " " + emoji);

        // Дополнительная рекомендация
        giveRecommendation(tempCelsius);
    }

    // Метод для выдачи рекомендаций
    public static void giveRecommendation(double tempCelsius) {
        System.out.print("Рекомендация: ");
        if (tempCelsius < -10) {
            System.out.println("Оставайтесь дома! Опасно выходить на улицу.");
        } else if (tempCelsius < 0) {
            System.out.println("Наденьте тёплую одежду, шапку и перчатки.");
        } else if (tempCelsius < 15) {
            System.out.println("Наденьте куртку или свитер.");
        } else if (tempCelsius < 25) {
            System.out.println("Идеальная погода для прогулки!");
        } else if (tempCelsius < 30) {
            System.out.println("Наденьте лёгкую одежду, используйте солнцезащитный крем.");
        } else {
            System.out.println("Избегайте длительного пребывания на солнце, пейте больше воды.");
        }
    }
}