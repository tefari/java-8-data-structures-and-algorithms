package test;

public class SimpleSelectionSort extends HelperMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// unsorted array
		int[] array = new int[] { 2, 3, 1, 0, 5, 4, 4 };

		// starting selection index
		int selectionIndex = 0;

		// selection value
		int selectionValue = 0;

		// minimum index
		int minimumIndex = 0;

		// minimum value
		int minimumValue = 0;

		printArray(array);

		for (int i = 0; i < array.length; i++) {

			// first step
			selectionIndex = i;
			minimumIndex = findMinimum(array, selectionIndex);
			minimumValue = array[minimumIndex];
			selectionValue = array[selectionIndex];

			// compare and swap
			if (minimumValue < selectionValue) {
				array[minimumIndex] = selectionValue;
				array[selectionIndex] = minimumValue;
			}

		}
		printArray(array);

	}

}
