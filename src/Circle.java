import java.awt.*;


public class Circle extends Shape
{
    double radius;
    // Create points
    private Point point1, point2;

    public Circle()
    {
        name = "Circle";
        radius = 0;

        // Create object Point
        point1 = new Point(1,1);
        point2 = new Point(1,1);

    }

    public Circle(double radius2)
    {
        name = "Circle";
        radius = radius2;
    }

    public void circleCenter(int x1, int y1, int x2, int y2){
        int cx = (x1 + x2) / 2;
        int cy = (y1 + y2) / 2;

        System.out.println("The center point of the circle is...");
        System.out.println("X: " + cx);
        System.out.println("Y: " + cy);

        centerCircleX = cx;
        centerCircleY = cy;




    }
    public void calcArea()
    {
        area = Math.PI * radius * radius;
    }

    public void calcPerimeter()
    {
        perimeter = 2 * Math.PI * radius;
    }



}
