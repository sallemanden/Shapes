public class Shape {
    // Variables
    String name;
    double perimeter, area;
     int centerCircleX, centerCircleY, centerRectX, centerRectY;

    public Shape()
    {
        name = "unknown";
        area = perimeter = 0;
    }

    public void showShape()
    {
        System.out.println("Name: " + name);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }

    public void calcDistance(int x1, int y1, int x2, int y2){
        double distance = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
        System.out.println("Distance from: ");
        System.out.println("X1: " + x1);
        System.out.println("Y1: " + y1);
        System.out.println(" ");
        System.out.println("X2: " + x2);
        System.out.println("Y2: " + y2);
        System.out.println("Distance: " + distance);
    }
}

