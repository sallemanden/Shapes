public class TriangleTester {
    public static void main(String[] args){
        Triangle t = new Triangle();

        //calculates the distance between the three points giving the sides of the triangle
        t.calcDistance(89, 0,67,100,100, 0);

        //calculate the perimeter of the triangle
        t.calcPerimeter();

        //calculate the area of the triangle
        t.calcArea();
    }
}
