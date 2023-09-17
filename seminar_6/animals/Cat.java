package seminar_6.animals;

/**
 * Класс Cat наследует класс Animal и представляет собой конкретное животное -
 * собаку
 */
public class Cat extends Animal {
    /**
     * Конструктор для создания собаки с именем.
     * 
     * @param name имя кота
     */
    public Cat(String name) {
        super(name);
    }

    /**
     * @return Звук, который издает кот (мяу-мяу)
     */
    @Override
    public String makeSound() {
        return "мяу-мяу";
    }
}
