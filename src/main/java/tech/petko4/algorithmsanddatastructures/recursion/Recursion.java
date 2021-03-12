package tech.petko4.algorithmsanddatastructures.recursion;

public class Recursion {

    private final static int[] array = { 1, 2, 3, 2, -7, 44, 5, 1, 0, -3 };

    public static void main(String[] args) {
        System.out.println(findElement(array, 0, array.length - 1, 7));
        System.out.println(findElement(array, 0, array.length - 1, 5));
    }

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
}
