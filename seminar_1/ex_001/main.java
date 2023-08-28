package seminar_1.ex_001;

public class main {
    public static void main(String[] args) {
        Animal animal = new Animal("Matvei", 1);
        animal.displayInfo();

        Animal animal2 = new Animal("Petr");
        animal2.displayInfo();

        Animal animal3 = new Animal();
        animal3.displayInfo();

        animal3.name = "Vasilii";
        animal3.age = 30;
        animal3.displayInfo();
    }
}
