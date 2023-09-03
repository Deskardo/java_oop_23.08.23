package home_work_3.ex_002;

public class App {
    public static void main(String[] args) {
        int width = 5;
        int height = 2;
        // Rectangle rectangle = new Rectangle(width, height);

        // использование функционального интерфейса для вычисления площади
        // прямоугольника
        MyParamValue myParamValue = (x, y) -> x * y;
        int area = myParamValue.getValue(width, height);
        System.out.println("The area: " + area);

        // использование функционального интерфейса для вычисления периметра прямоугольника
        MyParamValue myParamValue2 = (a, b) -> (a + b) * 2;
        int perimeter = myParamValue2.getValue(width, height);
        System.out.println("The perimeter: " + perimeter);

        // rectangle.calculateArea(width, height);
        // System.out.println("The area: " + rectangle.calculateArea(width, height));

        // rectangle.calculateArea();
        // rectangle.calculatePerimeter();

    }

}
