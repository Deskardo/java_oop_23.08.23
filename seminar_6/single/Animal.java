package seminar_6.single;

public class Animal {
    // public String name;

    // public Animal(String name) {
    // this.name = name;
    // }

    // public void makeSound() {
    // if("Dog".equals(name)){
    // System.out.println("гав - гав");
    // } else if ("Cat".equals(name)) {
    // System.out.println("мяу - мяу");
    // }
    // }

    // public void saveToDatabase() {
    // // Логика сохранения в базу данных...
    // }
    // }

    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        if ("Dog".equals(name)) {
            System.out.println("гав - гав");
        } else if ("Cat".equals(name)) {
            System.out.println("мяу - мяу");
        }
    }
}

class AnimalDatabase {
    public void save(Animal animal) {
        // Логика сохранения в базу данных...
    }
}