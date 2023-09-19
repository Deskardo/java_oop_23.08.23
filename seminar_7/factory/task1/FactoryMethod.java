package seminar_7.factory.task1;

// Абстрактный класс Animal, Представляющий животных
abstract class Animal{
    abstract void makeSound();
}

// Конкретный класс для создания собак
class Dog extends Animal {
    @Override
    void makeSound(){
        System.out.println("Собака гавкает");
    }
}

// Конкретный класс для создания кошек
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Кошка мяукает");
    }
}

// Абстрактная фабрика для создания животных
abstract class AnimalFactory{
    abstract Animal createAnimal();
}

// Конкретная фабрика для создания собак
class DogFactory extends AnimalFactory {
    @Override
    Animal createAnimal(){
        return new Dog();
    }
}

// Конкретная фабрика для создания кошек
class CatFactory extends AnimalFactory {
    @Override
    Animal createAnimal(){
        return new Cat();
    }
}

class Main {
    public static void main(String[] args) {
        // Создаем фабрику для собак
        AnimalFactory dogFactory = new DogFactory();

        // Создаем собаку с помощью фабрики
        Animal dog = dogFactory.createAnimal();
        dog.makeSound();// Вывод: собака гавкае

        // Создадим фабрику для кошек
        AnimalFactory catFactory = new CatFactory();

        // Создадим кошку с помощью фабрики
        Animal cat = catFactory.createAnimal();
        cat.makeSound(); // Вывод: Кошка мяукает

    }
}