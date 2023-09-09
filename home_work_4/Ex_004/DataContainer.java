package home_work_4.Ex_004;

import java.util.*;


public class DataContainer<T> {
    private ArrayList<T> list;

    public DataContainer(ArrayList<T> list) {
        this.list = list;
    }

    public void add(T item) {
        list.add(item);
    }

    public T get(Integer i) {
        return list.get(i);
    }

    public ArrayList<T> sort() {
        Comparator<T> reverseComparator = Collections.reverseOrder();
        Collections.sort(list, reverseComparator);
        return list;
    }

    public void print(ArrayList<T> list) {
        for (T item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

}
