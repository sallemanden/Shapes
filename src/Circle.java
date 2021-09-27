import java.awt.Point;

public class Circle extends Shape
{
    double radius;

    public Circle()
    {
        name = "Circle";
        radius = 0;
    }

    public Circle(double radius2)
    {
        name = "Circle";
        radius = radius2;
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
