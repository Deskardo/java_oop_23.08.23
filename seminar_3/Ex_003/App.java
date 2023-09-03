package seminar_3.Ex_003;

public class App {
    public static void main(String[] args) {
        MyParamValue myParamValue = (n) -> {
            for (int i = 0; i < n; i++) {
                System.out.println("Значение value: " + i * n);
            }
            return n + 10;
        };
        int num = myParamValue.getValue(20);
        System.out.println(myParamValue.getValue(10));
        System.out.println(num);
    }
}
