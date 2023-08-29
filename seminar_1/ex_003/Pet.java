package seminar_1.ex_003;

// базовый класс для питомцев
class Pet {
    private String name;
    private int age;

    // конструктор класса Pet
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // геттер для получения имени питомца
    public String getName(){
        return name;
    }

    // Сеттер для установки имени питомца
    public void setName(String name) {
        this.name = name;
    }

    // геттер для получения возраста питомца
    public int getAge() {
        return age;
    }

    // сеттер для установки возраста питомца
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // метод для издания звука
    public void makeSound() {
        System.out.println("The pet makes a sound.");
    }

    // метод для вывода информации о питомце
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
