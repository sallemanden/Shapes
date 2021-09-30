public class TriangleTester {
    public static void main(String[] args){
        Triangle t = new Triangle();

        //calculates the distance between the three points giving the sides of the triangle
        t.calcDistance(0, 0,50,100,100, 0);

        //calculate the perimeter of the triangle
        t.calcPerimeter();

        //calculate the area of the triangle
        t.calcArea();

        //calculate the point-areas to measure if the point is inside the triangle
        if(t.findPoint(0,0,50,100,100,0, 99,1)){
           System.out.println("The point is inside the triangle");
       } else {
           System.out.println("The point is NOT inside the triangle");
       }

    }
}
