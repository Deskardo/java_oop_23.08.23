package seminar_4.Ex_001;

public class Container<T> {
    private T item;

    public Container(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item){
        this.item = item;
    }

    public void printType() {
        System.out.println("Тип элемента: " + item.getClass().getName());
    }

    public static void main(String[] args) {
        Container<Integer> intContainer = new Container<>(42);
        Container<String> stringContainer = new Container<>("Привет мир");

        intContainer.printType();
        stringContainer.printType();
    }
}
