package seminar_2.ex_001;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Вызов методов makeSound()
        dog.makeSound(); // выводит "Buddy braks." 
        cat.makeSound(); // выводит "Whiskers meows."
    }
}
