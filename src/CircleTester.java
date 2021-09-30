public class CircleTester {
    public static void main(String[] args)
    {
        // Testing Circle
        Circle c = new Circle(1, 4,4);

        // Calculate area of Circle
        c.calcArea(c.radius);

        // Calculate perimeter of Circle
        c.calcPerimeter(c.radius);

        // Print out Shape details
        c.showShape();

        // Print out the center point of two points
        c.centerOfTwoPoints(1, 1,1,1);
    }
}
