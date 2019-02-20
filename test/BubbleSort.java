package test;

public class BubbleSort extends HelperMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 3, 4, 8, 0, 1, 3, 6, 7, 9, 3, 2 };

		int firstIndex, firstValue, nextIndex, nextValue;
		printArray(array);

		for (int a = 0; a < array.length; a++) {
			firstIndex = 0;
			nextIndex = 0;
			nextValue = array[nextIndex];
			for (int i = 0; i < array.length; i++) {

				firstIndex = i;

				if (nextIndex < array.length - 1) {
					nextIndex++;
				}
				firstValue = array[firstIndex];

				nextValue = array[nextIndex];

				if (firstValue > nextValue) {
					array[nextIndex] = firstValue;
					array[firstIndex] = nextValue;
				}

			}

		}

		printArray(array);

	}

}
