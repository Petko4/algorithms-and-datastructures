package tech.petko4.algorithmsanddatastructures.recursion;

public class Recursion {

    /**
     * @param array
     * @param left  boundary of the searching area
     * @param right boundary of the searching area
     * @param x     search value
     */
    public static int findElement(int[] array, int left, int right, int x) {
        if (left > right) {
            return -1;
        } else {
            if (array[left] == x) {
                return left;
            } else {
                return findElement(array, left + 1, right, x);
            }
        }
    }
    
    /**
     * 
     * @param array
     * @param left - first index of the array
     * @param right - last index of the array
     * @return array in reversed order
     */
    public static int[] reverseArray(int[] array, int left, int right) {
        if(left >= right) {
            return array;
        } else {
            int helperVaribale = array[left];
            array[left] = array[right];
            array[right] = helperVaribale;
            return reverseArray(array, left + 1, right - 1);
        }
    }
}
