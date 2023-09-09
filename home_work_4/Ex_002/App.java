package home_work_4.Ex_002;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        GenericPrint<Integer> intPrint = new GenericPrint<>();
        GenericPrint<String> stringPrint = new GenericPrint<>();

        ArrayList<Integer> intArray = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("Дима", "Ваня", "Степа", "Таня"));

        intPrint.printArray(intArray);
        stringPrint.printArray(stringArray);
    }
}

class GenericPrint<T>{
    public void printArray(ArrayList<T> arrayList){
        for (T item : arrayList) {
            System.out.println(item + " ");
        }
        System.out.println();
    }
}
