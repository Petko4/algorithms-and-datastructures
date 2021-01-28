package com.petko.algorithms_and_datastructures.recursion;

public class Recursion {

	private static int[] array = {1,2,3,2,-7,44,5,1,0,-3};
	
	public static void main(String[] args) {
		findElement(array, 0, array.length - 1, 7);
		findElement(array, 0, array.length - 1, 5);
	}
	
	
	
	
	
	/**
	 * @param array
	 * @param left boundary of the searching area
	 * @param right boundary of the searching area
	 * @param x search value
	 */
	public static void findElement(int[] array, int left, int right, int x) {
		if(left > right) {
			System.out.println("The element has not been found.");
		} else {
			if(array[left] == x) {
				System.out.println("The element has been found. Index: " + left);
			} else {
				findElement(array, left + 1, right, x);
			}
		}
	}
}
