package seminar_7.singleton;
// Создаем класс Singleton для хранения зоопарка
public class Zoo {
    // Приватное статическое поле для хранения единственного экземпляра
    private static Zoo instance;

    // Приватный конструктор, чтобы предотвратить создание экземпляров извне класса
    private Zoo(){
        // Здесь можно инициализировать ресурсы зоопарка
    }

    // Метод для оплучения единственного экземпляра класса
    public static Zoo getInstance() {
        if (instance == null) {
            instance = new Zoo();
        }
        return instance;
    }

    // Добавим метод для добавления животных в зоопарк
    public void addAnimal(String animal) {
        System.out.println("Добавлено животное: " + animal);
    }

    // Другие методы и данные о зоопарке
}

class Main {
    public static void main(String[] args) {
        // Получаем единственный экземпляр зоопарка
        Zoo zoo = Zoo.getInstance();

        // Добавляем животных в зоопарк
        zoo.addAnimal("Слон");
        zoo.addAnimal("Зебра");
        zoo.addAnimal("Лев");

        // Получаем ещё раз тот же экземпляр зоопарка
        Zoo sameZoo = Zoo.getInstance();

        // Проверяем, что это действтельно один и тот же объект
        if(zoo == sameZoo){
            System.out.println("Это один и тот же зоопарк!");
        }
    }
}

// Паттерн синглтон полезен, когда необходимо гарантировать, что у класса будет только один экземпляр
// и есть необходимость предоставить к нему доступ из любой точки программы.
