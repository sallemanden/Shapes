public class ShapeTester {
    public static void main(String[] args)
    {
        Circle c = new Circle(4.0);

        c.CalcArea();
        c.CalcPerimeter();
        c.showShape();

        c.CircleCenter(-1, -2,7,4);
    }
}
