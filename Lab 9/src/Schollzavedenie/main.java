public class Main {
    public static void main(String[] args) {
        System.out.println("=== Вариант 5: Учебное заведение ===");
        Student1 student = new Student1("John", "Doe", 2023001);
        Teacher teacher = new Teacher("Jane", "Smith", "Mathematics");
        Administrator1 admin = new Administrator1("Bob", "Johnson", "Registrar");

        student.study();
        teacher.teach();
        admin.manage();
        System.out.println();
    }
}

class Person1 {
    String firstName;
    String lastName;

    Person1(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

class Student1 extends Person1 {
    int studentId;

    Student1(String firstName, String lastName, int studentId) {
        super(firstName, lastName);
        this.studentId = studentId;
    }

    void study() {
        System.out.println(firstName + " " + lastName + " (ID: " + studentId + ") is studying");
    }
}

class Teacher extends Person1 {
    String subject;

    Teacher(String firstName, String lastName, String subject) {
        super(firstName, lastName);
        this.subject = subject;
    }

    void teach() {
        System.out.println(firstName + " " + lastName + " is teaching " + subject);
    }
}

class Administrator1 extends Person1 {
    String role;

    Administrator1(String firstName, String lastName, String role) {
        super(firstName, lastName);
        this.role = role;
    }

    void manage() {
        System.out.println(firstName + " " + lastName + " is managing as " + role);
    }
}