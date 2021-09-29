public class TriangleTester {
    public static void main(String[] args){
        Triangle t = new Triangle();

        //calculates the distance between the three points giving the sides of the triangle
        t.calcDistance(50, 0,50,100,100, 0);

        //calculate the area of the triangle
        t.calcArea();

        //calculate the perimeter of the triangle
        t.calcPerimeter();

    }
}
