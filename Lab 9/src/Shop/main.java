public class Main {
    public static void main(String[] args) {
        System.out.println("=== Вариант 10: Магазин ===");
        Food food = new Food("Apple", 0.5, "2024-12-31");
        Electronics electronics = new Electronics("Laptop", 999.99, 24);
        Clothes clothes = new Clothes("T-shirt", 19.99, "M");

        food.showPrice();
        electronics.showPrice();
        clothes.showPrice();
        System.out.println();
    }
}

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void showPrice() {
        System.out.println(name + " costs $" + price);
    }
}

class Food extends Product {
    String expiryDate;

    Food(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    void showPrice() {
        System.out.println(name + " (Food) costs $" + price + ", expires on " + expiryDate);
    }
}

class Electronics extends Product {
    int warrantyMonths;

    Electronics(String name, double price, int warrantyMonths) {
        super(name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    void showPrice() {
        System.out.println(name + " (Electronics) costs $" + price + ", " + warrantyMonths + " months warranty");
    }
}

class Clothes extends Product {
    String size;

    Clothes(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    void showPrice() {
        System.out.println(name + " (Clothes) costs $" + price + ", size " + size);
    }
}