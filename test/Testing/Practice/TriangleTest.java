package Testing.Practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle a = new Triangle();

    @Test
    void checkTriangle() {
        assertEquals(0, a.checkTriangle(1,1,3) );
    }
    @Test
    void checkTriangle1() {
        assertEquals(3, a.checkTriangle(1,1,1) );
    }
    @Test
    void checkTriangle2() {
        assertEquals(1, a.checkTriangle(2,4,3) );
    }
    @Test
    void checkTriangle3() {
        assertEquals(2, a.checkTriangle(3,1,3) );
    }

}