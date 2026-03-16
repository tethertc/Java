public class Main {
    public static void main(String[] args) {
        System.out.println("=== Вариант 8: Транспортные средства ===");
        Bike bike = new Bike("Yamaha", 2);
        Bus bus = new Bus("Mercedes", 40);
        Taxi taxi = new Taxi("Toyota", 4, "City Taxi");

        bike.startEngine();
        bus.startEngine();
        taxi.startEngine();
        System.out.println();
    }
}

class Vehicle {
    String brand;
    int wheels;

    Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }

    void startEngine() {
        System.out.println(brand + " vehicle engine starting");
    }
}

class Bike extends Vehicle {
    Bike(String brand, int wheels) {
        super(brand, wheels);
    }

    @Override
    void startEngine() {
        System.out.println(brand + " bike with " + wheels + " wheels: VROOM!");
    }
}

class Bus extends Vehicle {
    int capacity;

    Bus(String brand, int capacity) {
        super(brand, 6);
        this.capacity = capacity;
    }

    @Override
    void startEngine() {
        System.out.println(brand + " bus (capacity: " + capacity + ") engine: RUMBLE!");
    }
}

class Taxi extends Vehicle {
    String company;

    Taxi(String brand, int wheels, String company) {
        super(brand, wheels);
        this.company = company;
    }

    @Override
    void startEngine() {
        System.out.println(brand + " taxi from " + company + ": READY FOR PASSENGERS");
    }
}