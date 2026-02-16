public class Student extends Person {
    String group;

    @Override
    void displayInfo() {
        super.displayInfo();  // Вызов метода базового класса
        System.out.println("Группа: " + group);
    }
}