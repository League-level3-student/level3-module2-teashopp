package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	/*
	 * Bogo sort is a joke sorting algorithm. It is considered the most inefficient
	 * sorting algorithm while still maintaining the possibility of eventually
	 * sorting data.
	 * 
	 * It works by following these steps: STEP 1. Is the array in order? if yes,
	 * finished; if no, go to step 2. STEP 2. Take two random elements in the array
	 * and swap them. STEP 3. Go back to step 1.
	 */

	@Override
	void sort(int[] array, SortingVisualizer display) {

		for (int i = 0; i < array.length; i++) {

			int index = i;

			for (int j = 0; j < array.length; j++) {

				int index0 = j;

				if (array[j] > array[i]) {

					Random random = new Random();
					int rand = random.nextInt(array.length - 1) + 1;
					index = rand;

					Random random0 = new Random();
					int rand0 = random0.nextInt(array.length - 1) + 1;
					index0 = rand0;

				}
				
				int temp = array[index];
				int temp0 = array[index0];
				
				array[index] = temp0;
				array[index0] = temp;
				
			}

			display.updateDisplay();

		}

	}

}
