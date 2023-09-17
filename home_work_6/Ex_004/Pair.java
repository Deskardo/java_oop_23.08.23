package home_work_6.Ex_004;

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

    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<Integer, String>(42, "Hello");
        Pair<Double, Boolean> pair2 = new Pair<Double, Boolean>(3.14, true);

        Pair<Integer, String> pair3 = new Pair<Integer, String>(100, "World");

        Pair pair4 = new Pair(42, "Hello"); // Без использования явного указания типов (предупреждение о неявном использовании).
        // компилятор предупреждает о неявном использовании raw-типов (непараметризованных) и рекомендует использовать параметризованные типы.
    }

}
