package home_work_3.ex_001;

import java.util.*;

// класс компаратора для сортировки сначала по имени владельца, затем по возрасту кота
public class MyComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        int nameCompare = o1.getName().compareTo(o2.getName());
        if (nameCompare != 0) {
            return nameCompare;
        }
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}