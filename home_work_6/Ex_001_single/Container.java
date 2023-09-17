package home_work_6.Ex_001_single;

/**
 * Класс позволяющий создать экземпляры с обобщенными типами данных
 */
public class Container<T> {
    private T item;

    /**
     * Конструктор для создания объекта с конкретным типом данных
     * 
     * @param item элемент контейнера хранящий значение
     */
    public Container(T item) {
        this.item = item;
    }

    /**
     * Возвращает элемент хранящийся в контейнере
     * 
     * @return строковое представление элемента
     */
    public T getItem() {
        return item;
    }

    /**
     * Позволяет задать элемент, который будет храниться в контейнере
     */
    public void setItem(T item) {
        this.item = item;
    }

    // public void printType() { // выношу печать типа в отдельный класс, таким образом нет привязки к базовому конструктору.
    // System.out.println("Тип элемента: " + item.getClass().getName());
    // }

    // public static void main(String[] args) { // метод main так же вынесу
    // отдельным классом
    // Container<Integer> intContainer = new Container<>(42);
    // Container<String> stringContainer = new Container<>("Привет мир");

    // intContainer.printType();
    // stringContainer.printType();
    // }
}