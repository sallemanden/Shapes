public class CircleTester {
    public static void main(String[] args)
    {
        // Testing Circle
        Circle c = new Circle(7.0);

        // Calculate area of Circle
        c.calcArea();

        // Calculate perimeter of Circle
        c.calcPerimeter();

        // Print out Shape details
        c.showShape();

        // Print out the center point of Shape
        c.circleCenter(-8, -2,2,9);
    }
}