public class Main {
    public static void main(String[] args) {
        System.out.println("=== Вариант 9: Компьютерные компоненты ===");
        CPU cpu = new CPU("Intel", 3.5, 8);
        RAM ram = new RAM("Kingston", 16, 3200);
        GPU gpu = new GPU("NVIDIA", 8, 1750);

        cpu.showInfo();
        ram.showInfo();
        gpu.showInfo();
        System.out.println();
    }
}

class Component {
    String brand;
    String type;

    Component(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    void showInfo() {
        System.out.println(type + " by " + brand);
    }
}

class CPU extends Component {
    double speed;
    int cores;

    CPU(String brand, double speed, int cores) {
        super(brand, "CPU");
        this.speed = speed;
        this.cores = cores;
    }

    @Override
    void showInfo() {
        System.out.println(brand + " CPU: " + cores + " cores at " + speed + "GHz");
    }
}

class RAM extends Component {
    int size;
    int frequency;

    RAM(String brand, int size, int frequency) {
        super(brand, "RAM");
        this.size = size;
        this.frequency = frequency;
    }

    @Override
    void showInfo() {
        System.out.println(brand + " RAM: " + size + "GB at " + frequency + "MHz");
    }
}

class GPU extends Component {
    int vram;
    int coreClock;

    GPU(String brand, int vram, int coreClock) {
        super(brand, "GPU");
        this.vram = vram;
        this.coreClock = coreClock;
    }

    @Override
    void showInfo() {
        System.out.println(brand + " GPU: " + vram + "GB VRAM at " + coreClock + "MHz");
    }
}