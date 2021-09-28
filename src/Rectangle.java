import java.awt.*;

public class Rectangle extends Shape {

    double width,length;
    java.awt.Rectangle Square = new java.awt.Rectangle(0,0, 300, 600);

public Rectangle(){

    name = "Rectangle";
    width = 0;
    length = 0;

}

public Rectangle(double rectWidth, double rectLength){

    name = "Rectangle";
    width = rectWidth;
    length = rectLength;
}

public void calcArea(){

area = width * length;

}

public void calcPerimeter(){

    perimeter = 2 * (width + length);

}

// Testing find Center
public static Point rectCenter(java.awt.Rectangle Square){
int x = Square.x + Square.width / 2;
int y = Square.y + Square.height / 2;
return new Point (x, y);
}

}
