package Ex_001;

public class App {
    public static void main(String[] args) {
        Sum<Integer> sum = new Sum<>();
        Integer a = 10;
        Integer b = 20;

        System.out.println(sum.sumNum(a, b));
        
    }
}
