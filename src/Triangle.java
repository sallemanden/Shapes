public class Triangle extends Shape {

    double sideAB, sideBC, sideCA;

    public Triangle() {

        name = "Triangle";
        sideAB = 0;
        sideBC = 0;
        sideCA = 0;
    }

    public double calcDistance(int x1, int y1, int x2, int y2, int x3, int y3) {

        //calculate distance between the three points giving the sides of the triangle
        sideAB = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        sideBC = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        sideCA = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        System.out.println("Side AB: " + sideAB);
        System.out.println("Side BC: " + sideBC);
        System.out.println("Side CA: " + sideCA);

        //calculates the average distance between the three points
        double d = (sideAB + sideBC + sideCA) / 3;
        System.out.println("Average distance: " + d);
        return d;

    }

    public double calcPerimeter(double sideAB, double sideBC, double sideCA){

        perimeter = sideAB + sideBC + sideCA;
        System.out.println("Perimeter: " + perimeter);
        return perimeter;
    }

    public void calcArea() {

        double s = perimeter/2;
        area = Math.sqrt(s * (s-sideAB) * (s - sideBC) * (s-sideCA));
        System.out.println("Area: " + area);
    }

    //calculate total area to help calculate if point is inside triangle
    public int areaTest(int x1, int y1, int x2, int y2, int x3, int y3){
        return Math.abs((x1 *(y2-y3) + x2 * (y3-y1) + x3 * (y1-y2))/2);
    }

    //calculate point areas to check if point is inside
    public boolean findPoint(int x1, int y1, int x2, int y2, int x3, int y3, int x, int y){
    double pointArea = areaTest(x1,y1,x2,y2,x3,y3);
    double pointArea1 = areaTest(x,y,x2,y2,x3,y3);
    double pointArea2 = areaTest(x1,y1,x,y,x3,y3);
    double pointArea3 = areaTest(x1,y1,x2,y2,x,y);

    return (pointArea == pointArea1 + pointArea2 + pointArea3);
    }
}