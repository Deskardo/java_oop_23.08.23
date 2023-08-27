package lesson_1.ex_03;

public class Program {

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);

        System.out.println(a.getX());

        Point2D b = new Point2D(0);

        System.out.println(b.getY());
        //System.out.println(distance(a, b));
        
        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}
