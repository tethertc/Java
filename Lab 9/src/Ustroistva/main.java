public class Main {
    public static void main(String[] args) {
        System.out.println("=== Вариант 6: Устройства ===");
        Laptop laptop = new Laptop("Dell", 65, 16);
        Smartphone phone = new Smartphone("Samsung", 25, "Android");
        Tablet tablet = new Tablet("iPad", 30, true);

        laptop.turnOn();
        phone.turnOn();
        tablet.turnOn();
        System.out.println();
    }
}

class Device {
    String brand;
    int power;

    Device(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    void turnOn() {
        System.out.println(brand + " device is turning on");
    }
}

class Laptop extends Device {
    int ramSize;

    Laptop(String brand, int power, int ramSize) {
        super(brand, power);
        this.ramSize = ramSize;
    }

    @Override
    void turnOn() {
        System.out.println(brand + " laptop with " + ramSize + "GB RAM is booting up");
    }
}

class Smartphone extends Device {
    String os;

    Smartphone(String brand, int power, String os) {
        super(brand, power);
        this.os = os;
    }

    @Override
    void turnOn() {
        System.out.println(brand + " smartphone with " + os + " is starting");
    }
}

class Tablet extends Device {
    boolean hasStylus;

    Tablet(String brand, int power, boolean hasStylus) {
        super(brand, power);
        this.hasStylus = hasStylus;
    }

    @Override
    void turnOn() {
        System.out.println(brand + " tablet is powering on" + (hasStylus ? " (stylus supported)" : ""));
    }
}