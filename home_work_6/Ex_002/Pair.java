package home_work_6.Ex_002;

public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void setFirst(T first){
        this.first = first;
    }

    public void setSecond(U second){
        this.second = second;
    }

    public void printType(){
        System.out.println("Тип первого элемента: " + first.getClass().getName());
        System.out.println("Тип второго элемента: " + second.getClass().getName());
    }

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<Integer,String>(42, "Hello");
        Pair<Double, Boolean> pair2 = new Pair<Double,Boolean>(3.14, true);

        pair1.printType();
        // Вывод
        // Тип первого элемента java.lang.Integer
        // Тип второго элемента java.lang.String

        System.out.println();

        pair2.printType();
        // Вывод
        // Тип первого элемента java.lang.Double
        // Тип второго элемента java.lang.Boolean
    }
}
