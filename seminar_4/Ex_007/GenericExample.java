package seminar_4.Ex_007;

import java.util.*;

public class GenericExample<T> {

    // Метод printList теперь использует параметр типа T для 
    // списка, позволяя нам работать с элементами конкретного типа.
    public void printList(List<T> list) {
        for (T item : list) {
            System.out.println(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        GenericExample<Integer> intPrinter = new GenericExample<>();
        GenericExample<String> stringPrinter = new GenericExample<>();

        List<Integer> intList = List.of(1, 2, 3);
        List<String> stringList = List.of("Привет", "Мир");

        intPrinter.printList(intList);
        stringPrinter.printList(stringList);
    }
}
