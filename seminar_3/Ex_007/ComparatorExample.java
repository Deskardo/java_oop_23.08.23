package seminar_3.Ex_007;

import java.util.*;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "(" + age + " years)";
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));
        people.add(new Person("Charlie", 22));

        System.out.println("Before sorting: ");
        for (Person person : people) {
            System.out.println(person);
        }

        // Создаем компаратор для сортировки по возрасту в порядке возрастания
        Comparator<Person> ageComparator = Comparator.comparingInt(person -> person.age);

        // Сортируем список с помощью компаратора
        Collections.sort(people, ageComparator);

        System.out.println("\nAfter sorting by age (ascending): ");
        for (Person person : people) {
            System.out.println(person);
        }

        // Создаем компаратор для сортировки по имени в алфавитном порядке
        Comparator<Person> nameComparator = Comparator.comparing(person -> person.name);

        // Сортируем список с помощью нового компаратора
        Collections.sort(people, nameComparator);

        System.out.println("\nAfter sorting by name (alphabetical):");
        for (Person person : people) {
            System.out.println(person);
        }

        // сщздаем компаратор для сотрировки по имени в обратном алфавитном порядке
        Comparator<Person> nameComparator2 = (person1, person2) -> person2.name.compareTo(person1.name);

        // Сортируем список с использоваием нового компаратора
        Collections.sort(people, nameComparator2);

        System.out.println("\nAfter sorting by name (reverse alphabetical):");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
