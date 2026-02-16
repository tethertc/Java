public class VariableDemo {
    // Поле класса (область видимости - весь класс)
    int classVariable = 100;

    // Задача 1. Переменные и константы
    public void task1VariablesAndConstants() {
        System.out.println("\n=== Задача 1. Переменные и константы ===");

        // Примитивные переменные
        byte smallNumber = 127;           // целое число от -128 до 127
        int integerNumber = 1000;          // целое число
        double pi = 3.14159;               // число с плавающей точкой

        // Константа (final)
        final String UNIVERSITY_NAME = "МГУ";

        // Вывод значений
        System.out.println("byte переменная (smallNumber): " + smallNumber + " (диапазон: -128 до 127)");
        System.out.println("int переменная (integerNumber): " + integerNumber);
        System.out.println("double переменная (pi): " + pi);
        System.out.println("Константа (final) UNIVERSITY_NAME: " + UNIVERSITY_NAME + " (нельзя изменить)");
    }

    // Задача 2. Примитивные и ссылочные типы данных
    public void task2PrimitiveAndReference() {
        System.out.println("\n=== Задача 2. Примитивные и ссылочные типы ===");

        // Примитивный тип int
        int primitiveInt = 42;

        // Ссылочный тип String
        String referenceString = "Hello, World!";

        // Вывод значений
        System.out.println("Примитивный тип (int): primitiveInt = " + primitiveInt);
        System.out.println("   - Хранит непосредственно значение");
        System.out.println("   - Занимает фиксированное место в памяти (4 байта)");
        System.out.println();

        System.out.println("Ссылочный тип (String): referenceString = \"" + referenceString + "\"");
        System.out.println("   - Хранит ссылку на объект в памяти");
        System.out.println("   - Может быть null");
        System.out.println("   - Имеет методы для работы с данными");
    }

    // Задача 3. Область видимости переменных
    public void task3ScopeOfVariables() {
        System.out.println("\n=== Задача 3. Область видимости переменных ===");

        // Локальная переменная (видна только внутри метода)
        int localVariable = 50;

        System.out.println("Поле класса (classVariable): " + classVariable);
        System.out.println("   - Доступно во всем классе");
        System.out.println("   - Видно во всех методах этого класса");
        System.out.println();

        System.out.println("Локальная переменная (localVariable): " + localVariable);
        System.out.println("   - Доступна только внутри этого метода");
        System.out.println("   - Создается при вызове метода и уничтожается после его завершения");

        // Демонстрация области видимости блока
        {
            int blockVariable = 30;
            System.out.println("\nПеременная внутри блока (blockVariable): " + blockVariable);
            System.out.println("   - Видна только внутри этого блока кода");
        }
        // System.out.println(blockVariable); // Ошибка! Переменная не видна за пределами блока
    }
}