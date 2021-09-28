public class RectangleTester extends Shape {
    public static void main(String[] args)
    {
        // Testing Circle
        Rectangle r = new Rectangle(100,200);
        Circle c = new Circle(5);
        Shape s = new Shape();

        // Calculate area of Rectangle
        r.calcArea();

        // Calculate perimeter of Rectangle
        r.calcPerimeter();

        // Print out Shape details
        r.showShape();

        // Print out the center point of Shape
        r.findCenter();



        s.calcDistance(c.centerCircleX, c.centerCircleY, r.centerRectX, r.centerRectY);
    }
}
