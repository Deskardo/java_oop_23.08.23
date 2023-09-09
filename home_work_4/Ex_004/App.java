package home_work_4.Ex_004;

import java.util.*;


public class App {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        DataContainer<String> dataContainer = new DataContainer<>(list);

        dataContainer.add("hello");
        dataContainer.add("world");
        dataContainer.add(",");
        dataContainer.add("i");
        dataContainer.add("can");
        dataContainer.add("do this");

        dataContainer.print(list);

        dataContainer.sort();

        dataContainer.print(list);
    }

}
