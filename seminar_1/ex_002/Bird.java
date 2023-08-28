package seminar_1.ex_002;

// Подкласс наследуемый от Animal
class Bird extends Animal{
    boolean canFly;

    // Конструктор класса Bird
    public Bird(String name, int age, boolean canFly){
        super(name, age); // Вызов конструктора базового класса.
        this.canFly = canFly;
    }

    // Переопределение метода makeSound()
    @Override
    public void makeSound(){
        System.out.println("The bird makes a chirping sound.");
    }

    // Метод для вывода информации о птицуб включая наследование свойства
    @Override
    public void displayInfo(){
        super.displayInfo(); // Вызов метода базового класса
        System.out.println("Can fly: " + canFly);
    }


}
