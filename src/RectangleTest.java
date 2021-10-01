import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest extends Shape {

    @Test
    void findPoint() {
        Rectangle r = new Rectangle();
        assertEquals(false, r.findPoint(0,30, 10,20, 5, 70 ));
    }

    @Test
    void findPointTrue() {
        Rectangle r = new Rectangle();
        assertEquals(true, r.findPoint(0,60, 10,20, 5, 70 ));
    }

}