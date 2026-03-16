public class Main {
    public static void main(String[] args) {
        System.out.println("=== Вариант 14: Игровые персонажи ===");
        Warrior warrior = new Warrior("Conan", 100, "Sword");
        Mage mage = new Mage("Gandalf", 80, "Fireball");
        Archer archer = new Archer("Legolas", 90, 50);

        warrior.attack();
        mage.attack();
        archer.attack();
        System.out.println();
    }
}

class Character {
    String name;
    int health;

    Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    void attack() {
        System.out.println(name + " attacks!");
    }
}

class Warrior extends Character {
    String weapon;

    Warrior(String name, int health, String weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    @Override
    void attack() {
        System.out.println(name + " the Warrior attacks with " + weapon + "!");
    }
}

class Mage extends Character {
    String spell;

    Mage(String name, int health, String spell) {
        super(name, health);
        this.spell = spell;
    }

    @Override
    void attack() {
        System.out.println(name + " the Mage casts " + spell + "!");
    }
}

class Archer extends Character {
    int arrows;

    Archer(String name, int health, int arrows) {
        super(name, health);
        this.arrows = arrows;
    }

    @Override
    void attack() {
        System.out.println(name + " the Archer shoots an arrow! (" + arrows + " arrows left)");
        arrows--;
    }
}