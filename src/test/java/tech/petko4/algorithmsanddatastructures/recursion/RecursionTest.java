package tech.petko4.algorithmsanddatastructures.recursion;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RecursionTest {

    private final static int[] array = { 1, 2, 3, 2, -7, 44, 5, 1, 0, -3 };
    
    @Test
    public void findElementTest() {
        assertEquals(-1, Recursion.findElement(array, 0, array.length - 1, 7));
        assertEquals(6, Recursion.findElement(array, 0, array.length - 1, 5));
    }
    
}
