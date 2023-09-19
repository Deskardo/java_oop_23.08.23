package seminar_7.factory.task2;

// Абстрактный класс Animal, представляющий животных
abstract class Animal {
    abstract void makeSound();

    abstract void displayInfo();

    abstract int getCount(); // Добавляем метод для отслеживания количества созданных животных
}

// Конкретный класс для создания собак
class Dog extends Animal {
    private static int count = 0; // счетчик собак
    private String name;

    public Dog(String name) {
        this.name = name;
        count++;
    }

    @Override
    void makeSound() {
        System.out.println(name + " гавкает");
    }

    @Override
    void displayInfo() {
        System.out.println("Это собака по имени: " + name);
    }

    @Override
    int getCount() {
        return count;
    }

}

// Конкретный класс для создания кошек
class Cat extends Animal {
    private static int count = 0; // счетчик кошек
    private String name;

    public Cat(String name) {
        this.name = name;
        count++;
    }

    @Override
    void makeSound() {
        System.out.println(name + " мяукает");
    }

    @Override
    void displayInfo() {
        System.out.println("Это кошка по имени: " + name);
    }

    @Override
    int getCount() {
        return count;
    }
}

// Абстрактная фабрика для создания животных
abstract class AnimalFactory {
    abstract Animal createAnimal(String name);
}

// Конкретная фабрика для создания собак
class DogFactory extends AnimalFactory {
    @Override
    Animal createAnimal(String name) {
        return new Dog(name);
    }
}

// Конкретная фабрика для создания кошек
class CatFactory extends AnimalFactory {
    @Override
    Animal createAnimal(String name) {
        return new Cat(name);
    }
}

class Main {
    public static void main(String[] args) {
        // Создаем фабрику для собак
        AnimalFactory dogFactory = new DogFactory();

        // Создаем собаку с помощью фабрики
        Animal dog1 = dogFactory.createAnimal("Бобик");
        Animal dog2 = dogFactory.createAnimal("Тузик");
        dog1.makeSound(); // Вывод собака гавкает
        dog1.displayInfo(); // Вывод это собака

        // Создаем фабрику для создания кошек
        AnimalFactory catFactory = new CatFactory();

        // Создаем кошку с помощью фабрики
        Animal cat1 = catFactory.createAnimal("Матвей");
        Animal cat2 = catFactory.createAnimal("Котофей");
        cat1.makeSound(); // Вывод кошка мяукает
        cat1.displayInfo(); // Вывод это кошка

        // Выводим количество созданных животных каждого типа

        System.out.println("Количество собак: " + dog2.getCount());
        System.out.println("Количество кошек: " + cat2.getCount());
    }
}
