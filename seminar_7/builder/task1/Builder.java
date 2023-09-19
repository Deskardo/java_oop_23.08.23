package seminar_7.builder.task1;

// Класс животного
class Animal {
    private String species;
    private String name;
    private int age;

    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Вид: " + species + ", Имя: " + name + ", Возраст: " + age;
    }
}

// Строитель для создания животных
class AnimaBuilder {
    private String species;
    private String name;
    private int age;

    public AnimaBuilder setSpecies(String species) {
        this.species = species;
        return this;
    }

    public AnimaBuilder setName (String name) {
        this.name = name;
        return this;
    }

    public AnimaBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public Animal build () {
        return new Animal(species, name, age);
    }
}

class Main{
    public static void main(String[] args) {
        Animal animal = new AnimaBuilder()
                .setSpecies("Собака")
                .setName("Барон")
                .setAge(3)
                .build();
        
        System.out.println(animal);
    }
}