public class Main {
    public static void main(String[] args) {
        System.out.println("=== Вариант 1: Транспорт ===");
        Car1 car = new Car1("Toyota", 120);
        Train train = new Train("Express", 200);
        Airplane plane = new Airplane("Boeing", 900);

        car.move();
        train.move();
        plane.move();
        System.out.println();
    }
}

class Transport {
    String name;
    int speed;

    Transport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void move() {
        System.out.println(name + " is moving");
    }
}

class Car1 extends Transport {
    Car1(String name, int speed) {
        super(name, speed);
    }

    @Override
    void move() {
        System.out.println(name + " (Car) is driving on roads at " + speed + " km/h");
    }
}

class Train extends Transport {
    Train(String name, int speed) {
        super(name, speed);
    }

    @Override
    void move() {
        System.out.println(name + " (Train) is moving on rails at " + speed + " km/h");
    }
}

class Airplane extends Transport {
    Airplane(String name, int speed) {
        super(name, speed);
    }

    @Override
    void move() {
        System.out.println(name + " (Airplane) is flying in the sky at " + speed + " km/h");
    }
}