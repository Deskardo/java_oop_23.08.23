package home_work_6.Ex_003_openClosed;

/**
 * Класс Main вынесен отдельным классом, за пределы класса NumberContainer
 */
class Main {
    public static void main(String[] args) {
        NumberContainer<Integer> intContainer = new NumberContainer<Integer>(5);
        NumberContainer<Double> doubleContainer = new NumberContainer<Double>(3.14);

        Square square = new Square();
        // System.out.println("Квадрат целого числа: " + intContainer.square()); // вывод в этом формате не актуален
        // System.out.println("Квадрат вещественного числа: " +
        // doubleContainer.square());

        System.out.println("Квадрат целого числа: " + square.apply(intContainer));
        System.out.println("Квадрат вещественного числа: " + square.apply(doubleContainer));
    }
}