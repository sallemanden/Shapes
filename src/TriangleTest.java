import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest extends Shape {

    @Test
    void calcDistance() {
        Triangle t = new Triangle();
        assertEquals(107, t.calcDistance(0,0,50,100,100,0), 0.9);
    }


    @Test
    void findPoint() {
        Triangle t = new Triangle();
        assertEquals(true, t.findPoint(0,0,50,100,100,0, 50, 50));
    }
}