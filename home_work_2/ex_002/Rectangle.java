package home_work_2.ex_002;

public class Rectangle implements IcalulateAreaDefault{
    // базовые переменные ширина и высота прямоугольника
    private int width;
    private int height;

    // базовый конструктор для формирования прямоугольника
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // конструктор без параметров
    public Rectangle() {
        this(1, 1);
    }

    // гетер ширины
    public int getWidth() {
        return width;
    }

    // гетер высоты
    public int getHeight() {
        return height;
    }

    // сетер ширины
    public void setWidth(int width) {
        this.width = width;
    }

    // сетер высоты
    public void setHeight(int height) {
        this.height = height;
    }

    // метод вычисления площади
    public void calculateArea() {
        System.out.println("Площадь заданного прямоугольника: " + width * height);
    }

    // метод вычисления периметра
    public void calculatePerimeter() {
        System.out.println("Периметр заданного прямоугольника: " + (width + height) * IperimeterConstants.PERIMETR_MULTIPLIER);
    }

}
