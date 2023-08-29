package home_work_1.ex_001;

public class Cat {
    private String name;
    private int age;

    // конструктор для создания экземпляра класса
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

        // геттер для получения имени кота
        public String getName(){
            return name;
        }
    
        // Сеттер для установки имени кота
        public void setName(String name) {
            this.name = name;
        }
    
        // геттер для получения возраста кота
        public int getAge() {
            return age;
        }
    
        // сеттер для установки возраста кота
        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            }
        }

        public void greet(){
            System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет).");
        }
    
}
