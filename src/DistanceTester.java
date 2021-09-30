public class DistanceTester extends Shape {
    public static void main(String[] args)
    {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        Shape s = new Shape();

        c.centerOfTwoPoints(0,0,10,23);
        r.findCenter();
        s.calcDistance(c.getX(), c.getY(), r.getX(),r.getY());
    }
}
