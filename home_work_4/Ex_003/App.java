package home_work_4.Ex_003;

public class App {

    public static <T extends Comparable<T>> T getMax(T a, T b){
        if(a.compareTo(b)>0){
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Integer value1 = 3, value2 = 6;
        Double num1 = 3.7, num2 = 2.3;
        String line1 = "hello", line2 = "world";

        System.out.println("Максимальное значение: " + getMax(value1, value2));
        System.out.println("Максимальное значение: " + getMax(num1, num2));
        System.out.println("Максимальное значение: " + getMax(line1,line2));
    }
}

