package home_work_3.ex_002;

public class App {
    public static void main(String[] args) {
        int width = 5;
        int height = 2;
        Rectangle rectangle = new Rectangle(width, height);

        rectangle.calculateArea(width, height);
        System.out.println("The area: " + rectangle.calculateArea(width, height));

        rectangle.calculateArea();
        rectangle.calculatePerimeter();
    }
    
}
