package _00_Intro_to_Sorting_Algorithms;

import java.sql.Array;
import java.util.function.BooleanSupplier;

public class _01_SortedArrayChecker {
	/*
	 * Write a static method called intArraySorted.
	 *
	 * This method takes in an array of integers and it returns a boolean. The
	 * method returns true if the integer array is in ascending order and false
	 * otherwise.
	 */

	public static boolean intArraySorted(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int k = 0; k < arr.length - 1; k++) {

				if (arr[k] > arr[k + 1]) {

					int temp = arr[k];
					arr[k] = arr[k + 1];
					arr[k + 1] = temp;
					return false;

				}
			}
		}

		return true;
		
	}

	/*
	 * 2. Write a static method called doubleArraySorted.
	 *
	 * This method takes in an array of doubles and it returns a boolean. The method
	 * returns true if the double array is in ascending order and false otherwise.
	 */
	public static boolean doubleArraySorted(double[] unsorted) {

		for (int i = 0; i < unsorted.length; i++) {

			for (int k = 0; k < unsorted.length - 1; k++) {

				if (unsorted[k] > unsorted[k + 1]) {

					double temp = unsorted[k];
					unsorted[k] = unsorted[k + 1];
					unsorted[k + 1] = temp;
					return false;

				}
			}
		}

		return true;

	}

	/*
	 * 3. Write a static method called charArraySorted.
	 * 
	 * This method takes in an array of characters and it returns a boolean. The
	 * method returns true if the character array is in alphabetical order and false
	 * otherwise (You can compare characters just like integers).
	 */
	public static boolean charArraySorted(char[] unsorted) {

		for (int i = 0; i < unsorted.length; i++) {

			for (int k = 0; k < unsorted.length - 1; k++) {

				if (unsorted[k] > unsorted[k + 1]) {

					char temp = unsorted[k];
					unsorted[k] = unsorted[k + 1];
					unsorted[k + 1] = temp;
					return false;
					
				}

			}

		}

		return true;

	}

	/*
	 * 4. Write a static method called stringArraySorted.
	 *
	 * This method takes in an array of Strings and it returns a boolean. The method
	 * returns true if the String array is in alphabetical order and false otherwise
	 * (Use the compareTo(String) method).
	 */
	public static boolean stringArraySorted(String[] unsorted) {

		for (int i = 0; i < unsorted.length; i++) {

			for (int k = 0; k < unsorted.length - 1; k++) {

				if (unsorted[k].compareTo(unsorted[k + 1]) > 0) {

					String temp = unsorted[k];
					unsorted[k] = unsorted[k + 1];
					unsorted[k + 1] = temp;
					return false;

				}

			}

		}

		return true;

	}

}
