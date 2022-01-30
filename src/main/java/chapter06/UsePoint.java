package chapter06;

public class UsePoint {
    public static void main(String[] args) {
        Point point = new Point();
        point.x = 1;
        point.y = 1;
        System.out.println(point.name);

        Point.name = "Point2";
        System.out.println(point.name);

    }
}
