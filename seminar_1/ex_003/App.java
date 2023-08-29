package seminar_1.ex_003;

public class App {
    public static void main(String[] args) {
        // создание объекта собаки
        Dog labrador = new Dog("Buddy", 3, "Labrador");

        // использование геттеров и сеттеров
        System.out.println("Name: " + labrador.getName());
        System.out.println("Age: " + labrador.getAge());

        // обновление данных собаки
        labrador.setName("Max");
        labrador.steAge(4);

        // вывод обновленных данных
        System.out.println("Updated Name: "+ labrador.getName());
        System.out.println("Updated Age: " + labrador.getAge());

        // вызов методов и вывод информации о собаке
        labrador.makeSound();
        labrador.displayInfo();
    }
}
