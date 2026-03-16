public class Main {
    public static void main(String[] args) {
        System.out.println("=== Вариант 15: Электронные устройства ===");
        Refrigerator fridge = new Refrigerator("Samsung", 150, 350);
        WashingMachine washer = new WashingMachine("LG", 500, 8);
        Microwave microwave = new Microwave("Panasonic", 1000, 5);

        fridge.operate();
        washer.operate();
        microwave.operate();
        System.out.println();
    }
}

class Appliance {
    String brand;
    int power;

    Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    void operate() {
        System.out.println(brand + " appliance is operating");
    }
}

class Refrigerator extends Appliance {
    int capacity;

    Refrigerator(String brand, int power, int capacity) {
        super(brand, power);
        this.capacity = capacity;
    }

    @Override
    void operate() {
        System.out.println(brand + " refrigerator (" + capacity + "L) is cooling at " + power + "W");
    }
}

class WashingMachine extends Appliance {
    int loadCapacity;

    WashingMachine(String brand, int power, int loadCapacity) {
        super(brand, power);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void operate() {
        System.out.println(brand + " washing machine (" + loadCapacity + "kg) is washing at " + power + "W");
    }
}

class Microwave extends Appliance {
    int powerLevels;

    Microwave(String brand, int power, int powerLevels) {
        super(brand, power);
        this.powerLevels = powerLevels;
    }

    @Override
    void operate() {
        System.out.println(brand + " microwave (" + powerLevels + " levels) is heating at " + power + "W");
    }
}