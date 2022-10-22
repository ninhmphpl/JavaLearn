package Sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CounterSortTest {

    int[] a = Sort.arrayRandom(10000);
    int[] expected = CounterSort.sort(a.clone());
    int[] array;

    @BeforeEach
    void reset(){
        array = a.clone();
        System.out.println("Test");
    }

    @Test
    void quickSort() {
        QuickSort.sort(array);
        assertEquals(Arrays.toString(array),Arrays.toString(expected));
    }
    @Test
    void counterSort() {
        CounterSort.sort(array);
        assertEquals(Arrays.toString(array),Arrays.toString(expected));
    }
    @Test
    void selectionSort() {
        SelectionSort.sort(array);
        assertEquals(Arrays.toString(array),Arrays.toString(expected));
    }
    @Test
    void insertionSort() {
        InsertionSort.sort(array);
        assertEquals(Arrays.toString(array),Arrays.toString(expected));
    }
}