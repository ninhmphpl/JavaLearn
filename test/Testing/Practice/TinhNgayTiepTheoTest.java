package Testing.Practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TinhNgayTiepTheoTest {

    @Test
    void nexDay() {
        int[] expected = {1,3,2020};
        int[] resuil = TinhNgayTiepTheo.nexDay(29,2,2020);


        assertEquals(expected[0],resuil[0] );
        assertEquals(expected[1],resuil[1] );
        assertEquals(expected[2],resuil[2] );
    }
    @Test
    void nexDay1() {
        int[] expected = {1,3,2020};
        int[] resuil = TinhNgayTiepTheo.nexDay(29,2,2020);


        assertEquals(expected[0],resuil[0] );
        assertEquals(expected[1],resuil[1] );
        assertEquals(expected[2],resuil[2] );
    }
    @Test
    void nexDay2() {
        int[] expected = {1,1,2020};
        int[] resuil = TinhNgayTiepTheo.nexDay(31,12,2019);


        assertEquals(expected[0],resuil[0] );
        assertEquals(expected[1],resuil[1] );
        assertEquals(expected[2],resuil[2] );
    }
    @Test
    void nexDay3() {
        int[] expected = {11,3,2020};
        int[] resuil = TinhNgayTiepTheo.nexDay(10,3,2020);


        assertEquals(expected[0],resuil[0] );
        assertEquals(expected[1],resuil[1] );
        assertEquals(expected[2],resuil[2] );
    }
    @Test
    void nexDay4() {
        int[] expected = {29,2,2020};
        int[] resuil = TinhNgayTiepTheo.nexDay(28,2 ,2020);


        assertEquals(expected[0],resuil[0] );
        assertEquals(expected[1],resuil[1] );
        assertEquals(expected[2],resuil[2] );
    }

}