package seminar_1.ex_002;

public class App {
    public static void main(String[] args) {
        // создание объектов разных классов
        Mammal lion = new Mammal("Lion", 5, "Yellow");
        Bird sparrow = new Bird("Sparrow", 2, true);

        // Использование методов и вывод информации
        lion.makeSound();
        lion.displayInfo();

        sparrow.makeSound();
        sparrow.displayInfo();
    }
}
