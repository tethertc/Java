public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задача 3: Университет ===");
        Student student = new Student("Ali", "Khan", 12345);
        Professor professor = new Professor("Dr. John", "Doe", "Mathematics");
        Administrator admin = new Administrator("Anna", "Smith", "Registrar");

        student.displayInfo();
        student.study();
        professor.displayInfo();
        professor.teach();
        admin.displayInfo();
        admin.manage();
        System.out.println();
    }
}

class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void displayInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
    }
}

class Student extends Person {
    int studentId;

    Student(String firstName, String lastName, int studentId) {
        super(firstName, lastName);
        this.studentId = studentId;
    }

    void study() {
        System.out.println(firstName + " is studying.");
    }
}

class Professor extends Person {
    String subject;

    Professor(String firstName, String lastName, String subject) {
        super(firstName, lastName);
        this.subject = subject;
    }

    void teach() {
        System.out.println(firstName + " is teaching " + subject + ".");
    }
}

class Administrator extends Person {
    String role;

    Administrator(String firstName, String lastName, String role) {
        super(firstName, lastName);
        this.role = role;
    }

    void manage() {
        System.out.println(firstName + " is managing as " + role + ".");
    }
}