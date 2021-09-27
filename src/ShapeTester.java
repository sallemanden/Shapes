public class ShapeTester {
    public static void main(String[] args)
    {
        Shape s = new Shape();
        Circle c = new Circle(4.0);

        c.CalcArea();
        c.CalcPerimeter();
        c.showShape();
    }
}
