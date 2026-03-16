public class Main {
    public static void main(String[] args) {
        System.out.println("=== Вариант 12: Музыкальные инструменты ===");
        Guitar guitar = new Guitar("Fender", 6, "Electric");
        Piano piano = new Piano("Yamaha", 88, "Grand");
        Drums drums = new Drums("Pearl", 5, true);

        guitar.playSound();
        piano.playSound();
        drums.playSound();
        System.out.println();
    }
}

class Instrument {
    String brand;

    Instrument(String brand) {
        this.brand = brand;
    }

    void playSound() {
        System.out.println(brand + " instrument makes sound");
    }
}

class Guitar extends Instrument {
    int strings;
    String type;

    Guitar(String brand, int strings, String type) {
        super(brand);
        this.strings = strings;
        this.type = type;
    }

    @Override
    void playSound() {
        System.out.println(brand + " " + type + " guitar (" + strings + " strings): STRUM STRUM");
    }
}

class Piano extends Instrument {
    int keys;
    String pianoType;

    Piano(String brand, int keys, String pianoType) {
        super(brand);
        this.keys = keys;
        this.pianoType = pianoType;
    }

    @Override
    void playSound() {
        System.out.println(brand + " " + pianoType + " piano (" + keys + " keys): PLINK PLONK");
    }
}

class Drums extends Instrument {
    int pieces;
    boolean hasCymbals;

    Drums(String brand, int pieces, boolean hasCymbals) {
        super(brand);
        this.pieces = pieces;
        this.hasCymbals = hasCymbals;
    }

    @Override
    void playSound() {
        System.out.println(brand + " drum set (" + pieces + " pieces" +
                (hasCymbals ? ", with cymbals" : "") + "): BAM BAM BAM");
    }
}