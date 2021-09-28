public class ShapeTester {
    public static void main(String[] args)
    {
        // Testing Circle
        Circle c = new Circle(7.0);

        // Calculate area of Circle
        c.CalcArea();

        // Calculate perimeter of Circle
        c.CalcPerimeter();

        // Print out Shape details
        c.showShape();

        // Print out the center point of Shape
        c.CircleCenter(-8, -2,2,9);
    }
}
