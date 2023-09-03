package seminar_3.Ex_002;

public class App {
    public static void main(String[] args) {
        MyParamValue myParamValue = (n) -> 10.0 / n;
        System.out.println(myParamValue.getValue(5.0));

        MyDoubleParamValue myDoubleParamValue = (a, b, c) -> 10.0 * a * b * c;
        MyDoubleParamValue myDoubleParamValue2 = (x, y, z) -> x + y + z;
        System.out.println("Значение myDoubleParamValue: " + myDoubleParamValue.getValue(2, 3, 4));
        System.out.println("Значение myDoubleParamValue2: " + myDoubleParamValue2.getValue(5, 3, 4));
    }
}
