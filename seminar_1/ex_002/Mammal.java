package seminar_1.ex_002;

class Mammal extends Animal{
    String furColor;

    // конструктор класса Mammal
    public Mammal(String name, int age, String furColor) {
        super(name, age); // Вызов конструктора бызового класса
        this.furColor = furColor;
    }

    // Переопределение метода makeSound() - полиморфизм
    @Override
    public void makeSound(){
        System.out.println("The mammal makes a mammal sound.");
    }

    // Метод для вывода информации о млекопитающемб включая наследованные свойства
    @Override
    public void displayInfo(){
        super.displayInfo(); // Вызов метода базового класса
        System.out.println("Fur color: " + furColor);
    }
    
}
