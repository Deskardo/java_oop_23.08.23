package home_work_3.ex_001;

import java.util.*;

public class App {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Матвей", 1, "Алексей"));
        cats.add(new Cat("Персик", 5, "Алексей"));
        cats.add(new Cat("Сема", 7, "Анна"));
        cats.add(new Cat("Ферзь", 2, "Костя"));

        System.out.println("Before sorting: ");
        for (Cat cat : cats) {
            System.out.println(cat);
        }

        Comparator<Cat> ageComparator = Comparator.comparingInt(cat -> cat.getAge());

        Collections.sort(cats, ageComparator);

        System.out.println("\nAfter sorting: ");
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

}
