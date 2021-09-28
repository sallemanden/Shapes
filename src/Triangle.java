import java.awt.*;

public class Triangle extends Shape{

    double sideA, sideB, sideC;

    public Triangle(){

        name = "Triangle";
        sideA = 0;
        sideB = 0;

    }

    public Triangle(double triWidth, double triLength){

        name = "Triangle";
        sideA = triWidth;
        sideB = triLength;
    }

    public void calcArea(){

        area = sideA * sideB / 2;
    }

    public void calcPerimeter(){
            sideC = Math.sqrt(sideA * sideA + sideB * sideB);

            perimeter = sideA + sideB + sideC;
    }
}
