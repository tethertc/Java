import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Лабораторная работа №12: Работа со строками в Java ===\n");

        while (true) {
            showMenu();
            int choice = getIntInput("Выберите задание (1-20) или 0 для выхода: ");

            if (choice == 0) {
                System.out.println("Программа завершена.");
                break;
            }

            switch (choice) {
                case 1 -> task1_StringLength();
                case 2 -> task2_ChangeCase();
                case 3 -> task3_WordCount();
                case 4 -> task4_ReverseWords();
                case 5 -> task5_SearchWord();
                case 6 -> task6_ReplaceWord();
                case 7 -> task7_Palindrome();
                case 8 -> task8_StringEquals();
                case 9 -> task9_SplitString();
                case 10 -> task10_VowelsConsonants();
                case 11 -> task11_RemoveSpaces();
                case 12 -> task12_LongestWord();
                case 13 -> task13_CountWithoutSpaces();
                case 14 -> task14_StartsWith();
                case 15 -> task15_EndsWith();
                case 16 -> task16_ReverseString();
                case 17 -> task17_RemoveDigits();
                case 18 -> task18_ReplaceVowelsWithStar();
                case 19 -> task19_CharFrequency();
                case 20 -> task20_OnlyDigits();
                default -> System.out.println("Неверный выбор! Попробуйте снова.");
            }
            System.out.println("\n" + "=".repeat(50) + "\n");
        }
        scanner.close();
    }

    private static void showMenu() {
        System.out.println("""
                ┌────────────── МЕНЮ ЗАДАНИЙ ──────────────┐
                │  1. Длина строки                         │
                │  2. Изменение регистра                   │
                │  3. Подсчёт слов                         │
                │  4. Обратный порядок слов                │
                │  5. Поиск слова                          │
                │  6. Замена слова                         │
                │  7. Проверка палиндрома                  │
                │  8. Сравнение строк                      │
                │  9. Разделение строки                    │
                │ 10. Гласные и согласные                  │
                │ 11. Удалить пробелы                      │
                │ 12. Самое длинное слово                  │
                │ 13. Кол-во символов без пробелов         │
                │ 14. Начинается с... (startsWith)         │
                │ 15. Заканчивается на... (endsWith)       │
                │ 16. Строка в обратном порядке            │
                │ 17. Удалить все цифры                    │
                │ 18. Заменить гласные на *                │
                │ 19. Частота каждого символа              │
                │ 20. Проверка на только цифры             │
                │  0. Выход                                │
                └──────────────────────────────────────────┘
                """);
    }

    // Задание 1: Определение длины строки
    private static void task1_StringLength() {
        System.out.println("\n--- Задание 1: Длина строки ---");
        String input = getStringInput("Введите строку: ");
        System.out.println("Длина строки: " + input.length());
    }

    // Задание 2: Изменение регистра
    private static void task2_ChangeCase() {
        System.out.println("\n--- Задание 2: Изменение регистра ---");
        String input = getStringInput("Введите строку: ");
        System.out.println("Верхний регистр: " + input.toUpperCase());
        System.out.println("Нижний регистр: " + input.toLowerCase());
    }

    // Задание 3: Подсчёт слов
    private static void task3_WordCount() {
        System.out.println("\n--- Задание 3: Подсчёт слов ---");
        String input = getStringInput("Введите предложение: ").trim();
        String[] words = input.split("\\s+");
        int count = input.isEmpty() ? 0 : words.length;
        System.out.println("Количество слов: " + count);
    }

    // Задание 4: Обратный порядок слов (развернуть каждое слово)
    private static void task4_ReverseWords() {
        System.out.println("\n--- Задание 4: Обратный порядок слов ---");
        String input = getStringInput("Введите предложение: ");
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        System.out.println("Результат: " + result.toString().trim());
    }

    // Задание 5: Поиск слова
    private static void task5_SearchWord() {
        System.out.println("\n--- Задание 5: Поиск слова ---");
        String text = getStringInput("Введите текст: ");
        String search = getStringInput("Введите слово для поиска: ");
        if (text.contains(search)) {
            System.out.println("Слово \"" + search + "\" найдено!");
        } else {
            System.out.println("Слово \"" + search + "\" не найдено.");
        }
    }

    // Задание 6: Замена слова
    private static void task6_ReplaceWord() {
        System.out.println("\n--- Задание 6: Замена слова ---");
        String text = getStringInput("Введите текст: ");
        String oldWord = getStringInput("Какое слово заменить? ");
        String newWord = getStringInput("На какое слово заменить? ");
        String result = text.replace(oldWord, newWord);
        System.out.println("Результат: " + result);
    }

    // Задание 7: Проверка палиндрома
    private static void task7_Palindrome() {
        System.out.println("\n--- Задание 7: Проверка палиндрома ---");
        String input = getStringInput("Введите строку: ");
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        if (cleaned.equals(reversed)) {
            System.out.println("Строка является палиндромом!");
        } else {
            System.out.println("Строка НЕ является палиндромом.");
        }
    }

    // Задание 8: Сравнение строк
    private static void task8_StringEquals() {
        System.out.println("\n--- Задание 8: Сравнение строк ---");
        String str1 = getStringInput("Введите первую строку: ");
        String str2 = getStringInput("Введите вторую строку: ");
        if (str1.equals(str2)) {
            System.out.println("Строки равны (с учётом регистра)");
        } else {
            System.out.println("Строки не равны");
        }
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Строки равны (без учёта регистра)");
        }
    }

    // Задание 9: Разделение строки
    private static void task9_SplitString() {
        System.out.println("\n--- Задание 9: Разделение строки ---");
        String input = getStringInput("Введите строку с разделителями (например: яблоко,груша,банан): ");
        String delimiter = getStringInput("Введите разделитель: ");
        String[] parts = input.split(delimiter);
        System.out.println("Результат разбиения:");
        for (int i = 0; i < parts.length; i++) {
            System.out.println((i + 1) + ". " + parts[i]);
        }
    }

    // Задание 10: Гласные и согласные
    private static void task10_VowelsConsonants() {
        System.out.println("\n--- Задание 10: Гласные и согласные ---");
        String input = getStringInput("Введите строку: ").toLowerCase();
        int vowels = 0, consonants = 0;
        String vowelLetters = "аеёиоуыэюяaeiou";
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowelLetters.indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Гласных: " + vowels);
        System.out.println("Согласных: " + consonants);
    }

    // Задание 11: Удалить все пробелы
    private static void task11_RemoveSpaces() {
        System.out.println("\n--- Задание 11: Удалить все пробелы ---");
        String input = getStringInput("Введите строку с пробелами: ");
        String result = input.replaceAll("\\s+", "");
        System.out.println("Без пробелов: " + result);
    }

    // Задание 12: Самое длинное слово
    private static void task12_LongestWord() {
        System.out.println("\n--- Задание 12: Самое длинное слово ---");
        String input = getStringInput("Введите предложение: ");
        String[] words = input.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println("Самое длинное слово: \"" + longest + "\" (длина: " + longest.length() + ")");
    }

    // Задание 13: Количество символов без пробелов
    private static void task13_CountWithoutSpaces() {
        System.out.println("\n--- Задание 13: Количество символов без учёта пробелов ---");
        String input = getStringInput("Введите строку: ");
        int count = input.replaceAll("\\s+", "").length();
        System.out.println("Количество символов (без пробелов): " + count);
    }

    // Задание 14: Проверка startsWith
    private static void task14_StartsWith() {
        System.out.println("\n--- Задание 14: Проверка начала строки ---");
        String text = getStringInput("Введите строку: ");
        String prefix = getStringInput("Введите начало для проверки: ");
        if (text.startsWith(prefix)) {
            System.out.println("Строка начинается с \"" + prefix + "\"");
        } else {
            System.out.println("Строка НЕ начинается с \"" + prefix + "\"");
        }
    }

    // Задание 15: Проверка endsWith
    private static void task15_EndsWith() {
        System.out.println("\n--- Задание 15: Проверка окончания строки ---");
        String text = getStringInput("Введите строку: ");
        String suffix = getStringInput("Введите окончание для проверки: ");
        if (text.endsWith(suffix)) {
            System.out.println("Строка заканчивается на \"" + suffix + "\"");
        } else {
            System.out.println("Строка НЕ заканчивается на \"" + suffix + "\"");
        }
    }

    // Задание 16: Строка в обратном порядке
    private static void task16_ReverseString() {
        System.out.println("\n--- Задание 16: Строка в обратном порядке ---");
        String input = getStringInput("Введите строку: ");
        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("Обратный порядок: " + reversed);
    }

    // Задание 17: Удалить все цифры
    private static void task17_RemoveDigits() {
        System.out.println("\n--- Задание 17: Удалить все цифры ---");
        String input = getStringInput("Введите строку с цифрами (например: abc123def456): ");
        String result = input.replaceAll("\\d", "");
        System.out.println("Без цифр: " + result);
    }

    // Задание 18: Заменить все гласные на *
    private static void task18_ReplaceVowelsWithStar() {
        System.out.println("\n--- Задание 18: Заменить гласные на * ---");
        String input = getStringInput("Введите строку: ");
        String result = input.replaceAll("(?i)[аеёиоуыэюяaeiou]", "*");
        System.out.println("Результат: " + result);
    }

    // Задание 19: Частота каждого символа
    private static void task19_CharFrequency() {
        System.out.println("\n--- Задание 19: Частота каждого символа ---");
        String input = getStringInput("Введите строку: ");
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        System.out.println("Частота символов:");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }

    // Задание 20: Проверка, содержит ли строка только цифры
    private static void task20_OnlyDigits() {
        System.out.println("\n--- Задание 20: Проверка на только цифры ---");
        String input = getStringInput("Введите строку: ");
        if (input.matches("\\d+")) {
            System.out.println("Строка содержит ТОЛЬКО цифры");
        } else {
            System.out.println("Строка содержит НЕ ТОЛЬКО цифры (есть буквы или другие символы)");
        }
    }

    // Вспомогательные методы для ввода
    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    private static int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Ошибка! Введите число: ");
            scanner.next();
        }
        int result = scanner.nextInt();
        scanner.nextLine(); // очистка буфера
        return result;
    }
}