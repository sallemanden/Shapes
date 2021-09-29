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

        //calculate distance between the three points giving the sides of the triangle
        sideAB = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        sideBC = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        sideCA = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        System.out.println("Side AB: " + sideAB);
        System.out.println("Side BC: " + sideBC);
        System.out.println("Side CA: " + sideCA);

        //calculates the average distance between the three points
        double d = (sideAB + sideBC + sideCA) / 3;
        System.out.println("Average distance: " + d);

    }

    public void calcPerimeter(){

        perimeter = sideAB + sideBC + sideCA;
        System.out.println("Perimeter: " + perimeter);
    }

    public void calcArea() {

        double s = perimeter/2;
        area = Math.sqrt(s * (s-sideAB) * (s - sideBC) * (s-sideCA));
        System.out.println("Area: " + area);
    }
}