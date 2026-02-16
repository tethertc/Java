public class Main {
    public static void main(String[] args) {
        System.out.println("Практическая работа по Java");
        System.out.println("============================");

        // Создание объекта класса Student (из основной части)
        System.out.println("\n=== Основная часть (Наследование) ===");
        Student student = new Student();
        student.name = "Иван";
        student.age = 20;
        student.group = "ИС-2204";

        System.out.println("Вызов переопределенного метода displayInfo():");
        student.displayInfo();

        // Создание объекта для демонстрации задач 1-3
        VariableDemo demo = new VariableDemo();
        demo.task1VariablesAndConstants();
        demo.task2PrimitiveAndReference();
        demo.task3ScopeOfVariables();

        // Задача 4. Реализация наследования (уже показано выше)
        System.out.println("\n=== Задача 4. Реализация наследования ===");
        System.out.println("Класс Student наследует от Person поля name и age");
        System.out.println("и добавляет свое поле group");

        // Задача 5. Переопределение методов и полиморфизм
        System.out.println("\n=== Задача 5. Переопределение методов и полиморфизм ===");

        // Демонстрация полиморфизма
        Person personRef = new Student();  // Ссылка базового класса на объект производного
        ((Student)personRef).name = "Мария";
        ((Student)personRef).age = 19;
        ((Student)personRef).group = "ИС-2205";

        System.out.println("Вызов метода через ссылку базового класса (Person):");
        System.out.println("(вызывается переопределенный метод класса Student)");
        personRef.displayInfo();  // Полиморфный вызов

        System.out.println("\nОбъяснение полиморфизма:");
        System.out.println("- Несмотря на то, что переменная personRef имеет тип Person,");
        System.out.println("- она ссылается на объект типа Student");
        System.out.println("- Поэтому вызывается метод displayInfo() из класса Student");
        System.out.println("- Это называется полиморфизмом (множество форм)");
    }
}