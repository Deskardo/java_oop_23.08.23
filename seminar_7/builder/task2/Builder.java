package seminar_7.builder.task2;

// Класс животного с пятью полями (для примера)
class Animal {
    private String species;
    private String name;
    private int age;
    private String color;
    private String sound;

    public Animal(String species, String name, int age, String color, String sound) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.color = color;
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Вид: " + species + ", Имя: " + name + ", Возраст: " + age + ", Цвет: " + color + ", Звук: " + sound;
    }
}

// Строитель для создания животных с 5 полями
class AnimaBuilder {
    private String species;
    private String name;
    private int age;
    private String color;
    private String sound;

    // Метдоы для установки значений полей и возврата самого себя для цепочки
    // Вызовов
    public AnimaBuilder setSpecies(String species) {
        this.species = species;
        return this;
    }

    public AnimaBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public AnimaBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public AnimaBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public AnimaBuilder setSound(String sound) {
        this.sound = sound;
        return this;
    }

    public Animal build() {
        return new Animal(species, name, age, color, sound);
    }

}

class Main{
    public static void main(String[] args) {
        // Используем строитель для создания объекта Animal с заданными параметрами
        Animal animal = new AnimaBuilder()
                .setSpecies("Собака")
                .setName("Барон")
                .setAge(3)
                .setColor("Коричневый")
                .setSound("Гав-гав")
                .build();
        
        System.out.println(animal);
    }
}
