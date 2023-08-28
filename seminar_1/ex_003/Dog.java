package seminar_1.ex_003;

// Подкласс для собак 
class Dog extends Pet {
    private String breed;

    // Конструктор класса Dog
    public Dog (String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // геттер для получения породы собаки
    public String getBreed() {
        return breed;
    }

    // сеттер для установки породы собаки
    public void setBreed(String breed){
        this.breed = breed;
    }

    // Переопределение метода makeSound()
    @Override
    public void makeSound(){
        System.out.println("The dog barks.");
    }

    // Переопределение метода displayInfo() с дополнительной информацией
    @Override
    public void displayInfo() {
        super.displayInfo(); // вызов метода базового класса
        System.out.println("Breed: " + breed);
    }
}
