package home_work_6.Ex_003_openClosed;

/**
 * Базовый класс контейнера, позволяющего создать экземпляр класса обобщенного типа внутри типа Number
 */
public class NumberContainer<T extends Number> {
    private T number;

    public NumberContainer(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number){
        this.number = number;
    }
}

