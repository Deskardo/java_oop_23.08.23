package seminar_1.ex_002;

class Animal {
    String name;
    int age;

    // конструктор класса Animal
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // метод для издания звука
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }

    // метод для вывода информации о животном
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
