package home_work_4.Ex_001;

public class App<T>{
    public void printElemnt(T element){
        System.out.println(element);
    }

    public static void main(String[] args) {
        App<Integer> intApp = new App<>();
        App<String> stringApp = new App<>();
        App<Double> doubleApp = new App<>();


        Integer value1 = 13;
        String value2 = "Hello";
        Double value3 = 3.14;

        intApp.printElemnt(value1);
        stringApp.printElemnt(value2);
        doubleApp.printElemnt(value3);
    }
}    

