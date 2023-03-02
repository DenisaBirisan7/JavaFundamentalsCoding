package ro.sda.fundamentals._6_classes._part_6;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(23, 34);
        Point p2 = new Point(12,33);

        DecimalFormat df = new DecimalFormat("#.###");

        System.out.println("Distance (0,0) = " + df.format(p1.distance()));
        System.out.println("Distance (7,10) = " + df.format(p1.distance(7,10)));

        System.out.println("Distance (p2) = " + df.format(p1.distance(p2)));

        Point p3 = new Point(10,20);

        System.out.println("Distance p3 and another point is: " + p3.distance(new Point(100,200)));

        System.out.println("-------------------------------");

        Point other = new Point();

        System.out.println("anoher.x = " + other.getX());
        System.out.println("anoher.y = " + other.getY());
    }
}
