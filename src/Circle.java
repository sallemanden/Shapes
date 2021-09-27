import java.awt.*;


public class Circle extends Shape
{
    double radius;
    // Create points
    private Point point;
    private Point point2;

    public Circle()
    {
        name = "Circle";
        radius = 0;

        // Create object Point
        point = new Point(0,0);
        point2 = new Point(0,0);

    }

    public Circle(double radius2)
    {
        name = "Circle";
        radius = radius2;
    }

    public void CircleCenter(int x1, int y1, int x2, int y2){
        point = new Point(x1,y1);
        point2 = new Point(x2,y2);

        System.out.println((float)(x1 + x2) / 2 + ", " + (float)(y1 + y2) / 2);
    }
    public void CalcArea()
    {
        area = Math.PI * radius * radius;
    }

    public void CalcPerimeter()
    {
        perimeter = 2 * Math.PI * radius;
    }



}
