public class RectangleTester extends Shape {
    public static void main(String[] args)
    {
        // Testing Circle
        Rectangle r = new Rectangle(130,200);

        // Calculate area of Rectangle
        r.calcArea(r.width,r.length);

        // Calculate perimeter of Rectangle
        r.calcPerimeter(r.width, r.length);

        // Print out Shape details
        r.showShape();

        // Print out the center point of Shape
        r.findCenter();

        if(r.findPoint(0,0,10,10,5,5)){
            System.out.println("Point is inside rectangle");
        } else {
            System.out.println("Point is not inside rectangle");
        }
    }
}
