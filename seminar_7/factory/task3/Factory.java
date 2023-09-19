package seminar_7.factory.task3;

// Абстрактный класс Animal, представляющий животных
abstract class Animal {
    abstract void makeSound();

    abstract void displayInfo();

    abstract int getCount(); // Добавляем метод для отслеживания количества созданных животных

    abstract int getAge(); // Добавляем метод для получения возраста животного
}

// Конкретный класс для создания собак
class Dog extends Animal {
    private static int count = 0; // Счетчик собак
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    @Override
    void makeSound() {
        System.out.println(name + " гавкает");
    }

    @Override
    void displayInfo() {
        System.out.println("Это собака по кличке " + name + ", возраст: " + age + " лет.");
    }

    @Override
    int getCount() {
        return count;
    }

    @Override
    int getAge() {
        return age;
    }
}

// Конкретный класс для создания кошек
class Cat extends Animal {
    private static int count = 0; // Счетчик кошек
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    @Override
    void makeSound() {
        System.out.println(name + " мяукает");
    }

    @Override
    void displayInfo() {
        System.out.println("Это кошка по кличке " + name + ", возраст: " + age + " лет.");
    }

    @Override
    int getCount() {
        return count;
    }

    @Override
    int getAge() {
        return age;
    }
}

// Абстрактная фабрика для создания животных
abstract class AnimalFactory {
    abstract Animal createAnimal(String name, int age);

    abstract boolean isLimitReached(); // Добавляем метод для проверки ограничения
}

// Конкретная фабрика для создания собак
class DogFactory extends AnimalFactory {
    private static final int MAX_DOGS = 3; // Максимальное количество собак
    private int createdDogs = 0;

    @Override
    Animal createAnimal(String name, int age) {
        if (createdDogs < MAX_DOGS) {
            createdDogs++;
            return new Dog(name, age);
        } else {
            System.out.println("Достигнуто максимальное количество собак.");
            return null; // Возвращаем null, чтоб указать на ограничение
        }
    }

    @Override
    boolean isLimitReached() {
        return createdDogs >= MAX_DOGS;
    }
}

// Конкретная фабрика для создания кошек
class CatFactory extends AnimalFactory {
    private static final int MAX_CATS = 3; // Максимальное количество кошек
    private int createdCats = 0;

    @Override
    Animal createAnimal(String name, int age) {
        if (createdCats < MAX_CATS) {
            createdCats++;
            return new Dog(name, age);
        } else {
            System.out.println("Достигнуто максимальное количество кошек.");
            return null; // Возвращаем null, чтоб указать на ограничение
        }
    }

    @Override
    boolean isLimitReached() {
        return createdCats >= MAX_CATS;
    }
}

class Main {
    public static void main(String[] args) {
        // Создаем фабрику для собак
        AnimalFactory dogFactory = new DogFactory();

        // Создаем собаку с помощью фабрики
        Animal dog1 = dogFactory.createAnimal("Бобик",8);
        Animal dog2 = dogFactory.createAnimal("Тузик", 2);
        Animal dog3 = dogFactory.createAnimal("Шарик", 4);

        dog1.makeSound(); // Вывод собака гавкает
        dog3.displayInfo(); // Вывод это собака

        System.out.println("Количество собак: " + dog2.getCount());
    }
}

// 1:03