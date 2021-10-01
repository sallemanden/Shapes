import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest extends Shape {

    @Test
    void getX() {
        Circle c = new Circle (14,5,40);
        assertEquals(5, c.getX());
    }

    @Test
    void getY() {
        Circle c = new Circle (14,5,40);
        assertEquals(40, c.getY());
    }

    @Test
    void setX() {
        Circle c = new Circle (14,30,100);
        c.setX(60);
        assertEquals(60, c.getX());
    }

    @Test
    void setY() {
        Circle c = new Circle (60, 180, 300);
        c.setY(600);
        assertEquals(600, c.getY());
    }

    @Test
    void calcArea() {
        Circle c = new Circle (60, 180, 300);
        c.calcArea(600);
        assertEquals(615, c.calcArea(14), 1);
    }

    @Test
    void calcPerimeter() {
        Circle c = new Circle (60, 180, 300);
        assertEquals(87, c.calcPerimeter(14), 1);
    }

    @Test
    void findPoint() {
        Circle c = new Circle(60, 0, 0);
        assertEquals(true, c.findPoint(c.centerX, c.centerY, 40, 40, c.radius));
    }

    void findPointFalse() {
        Circle c = new Circle(120, 0, 0);
        assertEquals(false, c.findPoint(c.centerX, c.centerY, 130, 40, c.radius));
    }


}