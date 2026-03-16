public class Main {
    public static void main(String[] args) {
        System.out.println("=== Вариант 11: Спортивные команды ===");
        Player player = new Player("Mike", 25, "Forward");
        Coach coach = new Coach("Coach Smith", 50, 15);
        Doctor doctor = new Doctor("Dr. Brown", 45, "Sports Medicine");

        player.play();
        coach.train();
        doctor.heal();
        System.out.println();
    }
}

class TeamMember {
    String name;
    int age;

    TeamMember(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Player extends TeamMember {
    String position;

    Player(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    void play() {
        System.out.println(name + " (Player, " + position + ") is playing");
    }
}

class Coach extends TeamMember {
    int experienceYears;

    Coach(String name, int age, int experienceYears) {
        super(name, age);
        this.experienceYears = experienceYears;
    }

    void train() {
        System.out.println(name + " (Coach, " + experienceYears + " years exp) is training the team");
    }
}

class Doctor extends TeamMember {
    String specialization;

    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    void heal() {
        System.out.println(name + " (Doctor, " + specialization + ") is healing players");
    }
}