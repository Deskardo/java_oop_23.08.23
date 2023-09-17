package seminar_6.animals;

/**
 * Абстрактный класс Animal представляет собой основу для всех животных.
 * Он содержит основные характеристики и методы, общие для всех животных.
 */
public abstract class Animal {
    protected String name;

    /**
     * Конструктор для создания животного с именем
     * 
     * @param name Имя животного.
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Возвращает звук, который издает животное,
     * 
     * @return Строковое представление звука животного.
     */
    public abstract String makeSound();
    
    // геттеры, сеттевры и другие методы...
}