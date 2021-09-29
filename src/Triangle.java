import java.awt.*;

public class Triangle extends Shape {

    double sideAB, sideBC, sideCA;
    int[] x = {50, 50, 100};
    int[] y = {0, 100, 0};
    java.awt.Polygon Triangle = new java.awt.Polygon(x, y, 3);

    public Triangle() {

        name = "Triangle";
        sideAB = 0;
        sideBC = 0;
        sideCA = 0;
    }

    public void calcDistance(int x1, int y1, int x2, int y2, int x3, int y3) {
        sideAB = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        sideBC = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        sideCA = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        System.out.println("Side AB: " + sideAB);
        System.out.println("Side BC: " + sideBC);
        System.out.println("Side CA: " + sideCA);
        double d = (sideAB + sideBC + sideCA) / 3;
        System.out.println(d);

    }

    public void calcArea() {

        area = sideAB * sideCA / 2;
        System.out.println(area);
    }

    public void calcPerimeter(){

        perimeter = sideAB + sideBC + sideCA;
        System.out.println(perimeter);
    }
}