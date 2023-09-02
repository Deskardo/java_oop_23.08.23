package seminar_2.ex_003;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Использование методов из интерфейсов
        dog.makeSound();
        dog.play();

        cat.makeSound();
    }
}
