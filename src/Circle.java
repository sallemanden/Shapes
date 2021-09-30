import java.awt.*;


public class Circle extends Shape
{
    double radius;

    public Circle()
    {
        name = "Circle";
        radius = 0;
        centerX = 0;
        centerY = 0;
    }

    public Circle(double radius2, int x, int y)
    {
        name = "Circle";
        radius = radius2;
        centerX = x;
        centerY = y;

    }

    // If we have two points and want to calculate the center point
    public void centerOfTwoPoints(int x1, int y1, int x2, int y2){
        centerX = (x1 + x2) / 2;
        centerY = (y1 + y2) / 2;

        System.out.println("The center point of the two points is...");
        System.out.println("X: " + centerX);
        System.out.println("Y: " + centerY);
    }

    public int getX(){
        return centerX;
    }

    public int getY(){
        return centerY;
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
