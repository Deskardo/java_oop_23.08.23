package home_work_3.ex_001;

class Cat extends Owner implements IgetSet{
    private String nickName;
    private int age;

    // конструктор для создания экземпляра класса
    public Cat(String nickName, int age, String name) {
        super(name);
        this.nickName = nickName;
        this.age = age;
    }

        // геттер для получения имени кота
        @Override
        public String getName(){
            return name;
        }
    
        // Сеттер для установки имени кота
        @Override
        public void setName(String nickName) {
            this.nickName = nickName;
        }
    
        // геттер для получения возраста кота
        @Override
        public int getAge() {
            return age;
        }
    
        // сеттер для установки возраста кота
        @Override
        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            }
        }

        public void greet(){
            System.out.println("Мяу! Меня зовут " + nickName + ". Мне " + age + " года(лет). Мой владелец - " + name);
        }
    
}
