package home_work_6.Ex_006;

import java.util.*;


public class UnboundedWildcardExamle {
    public static void printList(List<?> list){
        for (Object item : list) {
            System.out.println(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(10);

        List<String> stringList = new ArrayList<>();
        stringList.add("Привет");
        stringList.add("Мир");

        printList(intList);
        printList(stringList);


    }
}
