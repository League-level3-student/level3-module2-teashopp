package _01_Sorting_Algorithms;

public class BubbleSorter extends Sorter {
	public BubbleSorter() {
		type = "Bubble";
	}

	/*
	 * Use the bubble sorting algorithm to sort the array. You can use
	 * display.updateDisplay() to show the current progress on the graph.
	 */
	@Override
	void sort(int[] array, SortingVisualizer display) {

		for (int i = 0; i < array.length; i++) {

			int index = i;

			for (int j = 0; j < array.length; j++) {

				if (array[j] < array[index]) {

					index = j;

				}

				int temp = array[i];
				array[i] = array[index];
				array[index] = temp;

			}

		}

		display.updateDisplay();

	}
}