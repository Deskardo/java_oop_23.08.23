package home_work_3.ex_001;

import java.util.*;

public class App {
    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Матвей", 1, "Алексей"));
        cats.add(new Cat("Персик", 5, "Алексей"));
        cats.add(new Cat("Сема", 7, "Анна"));
        cats.add(new Cat("Ферзь", 2, "Костя"));
        cats.add(new Cat("Кись", 3, "Костя"));
        cats.add(new Cat("Маркиз", 5, "Анна"));

        System.out.println("Before sorting: ");
        for (Cat cat : cats) {
            System.out.println(cat);
        }

        // Компаратор из семинара для сортировки по возрасту
        Comparator<Cat> ageComparator = Comparator.comparingInt(cat -> cat.getAge());

        Collections.sort(cats, ageComparator);

        System.out.println("\nAfter age sorting: ");
        for (Cat cat : cats) {
            System.out.println(cat);
        }

        // Компаратор из семинара для сортировки по имени
        Comparator<Cat> nickNameComparator = Comparator.comparing(cat -> cat.getNickName());

        Collections.sort(cats, nickNameComparator);

        System.out.println("\nAfter name sorting: ");
        for (Cat cat : cats) {
            System.out.println(cat);
        }

        // Компаратор из функционального интерфейса, для двойной сортировки, по имени владельца, затем по возрасту.
        Collections.sort(cats, new MyComparator());

        System.out.println("\nAfter double sorting: ");
        for (Cat cat : cats) {
            System.out.println(cat);
        }

    }

}
