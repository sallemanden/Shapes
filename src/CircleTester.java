public class CircleTester {
    public static void main(String[] args)
    {
        // Testing Circle
        Circle c = new Circle(10, 4,4);

        // Calculate area of Circle
        c.calcArea();

        // Calculate perimeter of Circle
        c.calcPerimeter();

        // Print out Shape details
        c.showShape();

        // Print out the center point of two points
        c.centerOfTwoPoints(1, 1,1,1);
    }
}
