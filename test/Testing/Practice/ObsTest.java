package Testing.Practice;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObsTest {
Obs a = new Obs();
    @Test
    void obs() {
        int expected = 1;
        int input = 1;
        int result = a.obs(input);
        assertEquals(expected, result);
    }
    @Test

    void obs1() {
        int expected = 0;
        int input = 0;
        int result = a.obs(input);
        assertEquals(expected, result);
    }
    @Test

    void obs2() {
        int expected = 1;
        int input = -1;
        int result = a.obs(input);
        assertEquals(expected, result);
    }
    @Test

    void obs3() {
        int expected = 10;
        int input = -10;
        int result = a.obs(input);
        assertEquals(expected, result);
    }
}