package lesson_1.ex_03;

/**
 * Это точка 2D
 */

public class Point2D {
    public int x, y;

    /**
     * Это конструктор 
     * @param valueX координата X
     * @param valueY координата Y
     */

    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) {
        this(value, value);
    }

    public Point2D() {
        this(0);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int value){
        this.x = value;
    }

    public void setY(int value){
        this.y = value;
    }

    private String getInfo() {
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() { // перезапись стандартного метода
        return getInfo();
    }

    static double distance(Point2D a, Point2D b){
        return Math.sqrt(Math.pow(a.x- b.x, 2) + Math.pow(a.y - b.y, 2)); // перегрузка метода.
    }



    // ctor
    // get; set;
    // docs
    //
}
