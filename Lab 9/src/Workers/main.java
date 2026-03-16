public class Main {
    public static void main(String[] args) {
        System.out.println("=== Вариант 3: Работники компании ===");
        Manager manager = new Manager("Alice", 5000, "IT");
        Developer dev = new Developer("Bob", 4000, "Java");
        Designer designer = new Designer("Charlie", 3500, "UI/UX");

        manager.work();
        dev.work();
        designer.work();
        System.out.println();
    }
}

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void work() {
        System.out.println(name + " is working");
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    void work() {
        System.out.println(name + " (Manager) manages " + department + " department");
    }
}

class Developer extends Employee {
    String language;

    Developer(String name, double salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    void work() {
        System.out.println(name + " (Developer) codes in " + language);
    }
}

class Designer extends Employee {
    String tool;

    Designer(String name, double salary, String tool) {
        super(name, salary);
        this.tool = tool;
    }

    @Override
    void work() {
        System.out.println(name + " (Designer) designs with " + tool);
    }
}