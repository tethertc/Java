public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задача 2: Животные ===");
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");
        Bird bird = new Bird("Tweety");

        dog.sound();
        cat.sound();
        bird.sound();
        System.out.println();
    }
}

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("This animal makes a sound.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Meow!");
    }
}

class Bird extends Animal {
    Bird(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println(name + " says: Tweet Tweet!");
    }
}