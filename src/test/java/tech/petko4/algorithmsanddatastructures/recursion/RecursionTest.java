package tech.petko4.algorithmsanddatastructures.recursion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class RecursionTest {

    private static int[] ARRAY;
    private static int[] REVERSED_ARRAY;
    
    @Before
    public void init() {
        ARRAY = new int[]{ 1, 2, 3, 2, -7, 44, 5, 1, 0, -3 };
        REVERSED_ARRAY = new int[]{ -3, 0, 1, 5, 44, -7, 2, 3, 2, 1 };
    }
    
    @Test
    public void findElementTest() {
        assertEquals(-1, Recursion.findElement(ARRAY, 0, ARRAY.length - 1, 7));
        assertEquals(6, Recursion.findElement(ARRAY, 0, ARRAY.length - 1, 5));
    }
    
    @Test
    public void reversedArrayTest() {
        assertArrayEquals(REVERSED_ARRAY, Recursion.reverseArray(ARRAY, 0, ARRAY.length - 1));
    }
    
}
