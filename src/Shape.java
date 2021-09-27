public class Shape {
    // Variables
    String name;
    double perimeter, area;

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
}

