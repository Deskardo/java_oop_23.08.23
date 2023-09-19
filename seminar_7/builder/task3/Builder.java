package seminar_7.builder.task3;

// Класс животного с десятью полями (для примера)
class Animal {
    private String species;
    private String name;
    private int age;
    private String color;
    private double weight;
    private String habitat;
    private boolean isDomestic;
    private String diet;
    private String sound;
    private String gender;

    public Animal(String species, String name, int age, String color, double weight,
            String habitat, boolean isDomestic, String diet, String sound, String gender) {
        this.species = species;
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.habitat = habitat;
        this.isDomestic = isDomestic;
        this.diet = diet;
        this.sound = sound;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format(
                "Вид: %s, Имя: %s, Возраст: %d, Цвет: %s, Вес: %.2f, Среда обитания: %s, Домашнее: %b, Рацион: %s, Звук: %s, Пол: %s",
                species, name, age, color, weight, habitat, isDomestic, diet, sound, gender);
    }
}

// Строитель для создания животных с 10 полями
class AnimaBuilder {
    private String species;
    private String name;
    private int age;
    private String color;
    private double weight;
    private String habitat;
    private boolean isDomestic;
    private String diet;
    private String sound;
    private String gender;

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

    public AnimaBuilder setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public AnimaBuilder setHabitat(String habitat) {
        this.habitat = habitat;
        return this;
    }

    public AnimaBuilder setDomestic(boolean isDomestic) {
        this.isDomestic = isDomestic;
        return this;
    }

    public AnimaBuilder setDiet(String diet) {
        this.diet = diet;
        return this;
    }

    public AnimaBuilder setSound(String sound) {
        this.sound = sound;
        return this;
    }

    public AnimaBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Animal build() {
        return new Animal(species, name, age, color, weight, habitat, isDomestic, diet, sound, gender);
    }

}

class Main {
    public static void main(String[] args) {
        // Используем строитель для создания объекта Animal с заданными параметрами
        Animal animal = new AnimaBuilder()
                .setSpecies("Собака")
                .setName("Барон")
                .setAge(3)
                .setColor("Коричневый")
                .setSound("Гав-гав")
                .build();

        Animal animal2 = new AnimaBuilder()
                .setSpecies("кошка").build();

        System.out.println(animal);
        System.out.println(animal2);
    }
}
