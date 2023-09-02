package seminar_2.ex_004;

public class App {
    public static void main(String[] args) {
        BasicMath basicMath = new BasicMath();

        int sum = basicMath.add(5, 3);
        int difference = basicMath.subtract(8, 4);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}
