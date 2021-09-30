import java.awt.*;


public class Circle extends Shape
{
    int centerX;
    int centerY;
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

    public void circleCenter(int x1, int y1, int x2, int y2){
        int cx = (x1 + x2) / 2;
        int cy = (y1 + y2) / 2;
        centerX = cx;
        centerY = cy;

        System.out.println("The center point of the circle is...");
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
