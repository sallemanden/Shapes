import java.awt.*;

public class Triangle extends Shape{

    double width, length;
    double cathetusA = length;
    double cathetusB = width;

    public Triangle(){

        name = "Triangle";
        width = 0;
        length = 0;

    }

    public Triangle(double triWidth, double triLength){

        name = "Triangle";
        width = triWidth;
        length = triLength;
    }

    public void calcArea(){

        area = width * length / 2;
    }

    public void calcPerimeter(){

    }
}
