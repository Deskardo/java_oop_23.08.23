package seminar_7.abstractFactory.task2;

// Абстрактный класс животного
abstract class Animal {
    abstract String getName();
}

// Конкретный класс для собаки
class Dog extends Animal {
    @Override
    String getName() {
        return "Собака";
    }
}

// Конкретный класс для кошки
class Cat extends Animal {
    @Override
    String getName() {
        return "Кошка";
    }
}

// Абстрактный класс для фабрики животных
abstract class AnimalFactory {
    abstract Animal createAnimal();

    abstract ColorFactory createColorFactory(); // Добавляем абстрактный метод для создания фабрики цветов
}

// Фабрика для создания собак
class DogFactory extends AnimalFactory {
    @Override
    Animal createAnimal() {
        return new Dog();
    }

    @Override
    ColorFactory createColorFactory() {
        return new DogColorFactory(); // Создаем фабрику цветов для собак
    }
}

// Фабрика для создания кошек
class CatFactory extends AnimalFactory {
    @Override
    Animal createAnimal() {
        return new Cat();
    }

    @Override
    ColorFactory createColorFactory() {
        return new CatColorFactory(); // Создаем фабрику цветов для собак
    }
}

// Абстрактная Фабрика создания цветов
abstract class ColorFactory {
    abstract String getColor();
}

// Фабрика цветов для собак
class DogColorFactory extends ColorFactory {
    @Override
    String getColor() {
        return "Коричневый";
    }
}

// Фабрика цветов для кошек
class CatColorFactory extends ColorFactory {
    @Override
    String getColor() {
        return "Серый";
    }
}

class AnimalClient {
    public static void main(String[] args) {
        // Создаем фабрику для создания собак
        AnimalFactory dogFactory = new DogFactory();

        // Создаем собаку
        Animal dog = dogFactory.createAnimal();
        System.out.println("Создано: " + dog.getName());

        // Создаем фабрику цветов для собаки
        ColorFactory dogColorFactory = dogFactory.createColorFactory();
        System.out.println("Цвет: " + dogColorFactory.getColor());

        // Создаем фабрику для создания кошек
        AnimalFactory catFactory = new CatFactory();

        // Создаем кошку
        Animal cat = catFactory.createAnimal();
        System.out.println("Создано: " + cat.getName());

        // Создаем фабрику цветов для кошки
        ColorFactory catColorFactory = catFactory.createColorFactory();
        System.out.println("Цвет: " + catColorFactory.getColor());

    }
}
