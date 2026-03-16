public class Main {
    public static void main(String[] args) {
        System.out.println("=== Задача 1: Автомобили ===");
        Sedan sedan = new Sedan("Toyota", 180);
        Truck truck = new Truck("Volvo", 120);
        SUV suv = new SUV("Jeep", 160);

        sedan.displayInfo();
        sedan.fuelConsumption();
        truck.displayInfo();
        truck.fuelConsumption();
        suv.displayInfo();
        suv.fuelConsumption();
        System.out.println();
    }
}

class Car {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

class Sedan extends Car {
    Sedan(String brand, int speed) {
        super(brand, speed);
    }

    void fuelConsumption() {
        System.out.println("Sedan fuel consumption: 7 liters/100km");
    }
}

class Truck extends Car {
    Truck(String brand, int speed) {
        super(brand, speed);
    }

    void fuelConsumption() {
        System.out.println("Truck fuel consumption: 20 liters/100km");
    }
}

class SUV extends Car {
    SUV(String brand, int speed) {
        super(brand, speed);
    }

    void fuelConsumption() {
        System.out.println("SUV fuel consumption: 12 liters/100km");
    }
}