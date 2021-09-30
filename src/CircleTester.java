public class CircleTester {
    public static void main(String[] args)
    {
        // Testing Circle
        Circle c = new Circle(3, 4,4);

        // Calculate area of Circle
        c.calcArea(c.radius);

        // Calculate perimeter of Circle
        c.calcPerimeter(c.radius);

        // Print out Shape details
        c.showShape();

        // Print out the center point of two points
        c.centerOfTwoPoints(1, 1,1,1);

        if(c.findPoint(c.getX(), c.getY(), 2, 5,c.radius)){
            System.out.println("Point is inside");
        } else {
            System.out.println("Point is not inside");
        }
    }
}
