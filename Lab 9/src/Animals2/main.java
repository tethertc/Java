public class Main {
    public static void main(String[] args) {
        System.out.println("=== Вариант 7: Животные (Lion, Elephant, Monkey) ===");
        Lion lion = new Lion("Simba", 5);
        Elephant elephant = new Elephant("Dumbo", 10);
        Monkey monkey = new Monkey("George", 3);

        lion.makeSound();
        elephant.makeSound();
        monkey.makeSound();
        System.out.println();
    }
}

class Animal2 {
    String name;
    int age;

    Animal2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println(name + " makes a sound");
    }
}

class Lion extends Animal2 {
    Lion(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " the lion: ROAR!");
    }
}

class Elephant extends Animal2 {
    Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " the elephant: PAWOOO!");
    }
}

class Monkey extends Animal2 {
    Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " the monkey: OOH OOH AH AH!");
    }
}