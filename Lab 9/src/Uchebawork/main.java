public class Main {
    public static void main(String[] args) {
        System.out.println("=== Вариант 13: Учебные курсы ===");
        ProgrammingCourse prog = new ProgrammingCourse("Java Programming", 40, "Java");
        MathCourse math = new MathCourse("Calculus", 30, "Calculus");
        HistoryCourse history = new HistoryCourse("World History", 25, "Modern");

        prog.startCourse();
        math.startCourse();
        history.startCourse();
        System.out.println();
    }
}

class Course {
    String name;
    int durationHours;

    Course(String name, int durationHours) {
        this.name = name;
        this.durationHours = durationHours;
    }

    void startCourse() {
        System.out.println("Starting course: " + name);
    }
}

class ProgrammingCourse extends Course {
    String language;

    ProgrammingCourse(String name, int durationHours, String language) {
        super(name, durationHours);
        this.language = language;
    }

    @Override
    void startCourse() {
        System.out.println("Starting " + language + " programming course: " + name +
                " (" + durationHours + " hours)");
    }
}

class MathCourse extends Course {
    String topic;

    MathCourse(String name, int durationHours, String topic) {
        super(name, durationHours);
        this.topic = topic;
    }

    @Override
    void startCourse() {
        System.out.println("Starting " + topic + " math course: " + name +
                " (" + durationHours + " hours)");
    }
}

class HistoryCourse extends Course {
    String period;

    HistoryCourse(String name, int durationHours, String period) {
        super(name, durationHours);
        this.period = period;
    }

    @Override
    void startCourse() {
        System.out.println("Starting " + period + " history course: " + name +
                " (" + durationHours + " hours)");
    }
}