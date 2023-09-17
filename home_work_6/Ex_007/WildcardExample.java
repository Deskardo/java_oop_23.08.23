package home_work_6.Ex_007;
import java.util.*;

public class WildcardExample {

    // Мы объявляем метод printList с параметром List<?>. Это означает, что метод принимает список любого типа
    // данных, но мы не можем выполнять операции, зависяцие от конгкрентного типа элементов списка.
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<String> stringList = List.of("Привет", "Мир");

        printList(intList);
        printList(stringList);
    }
}
