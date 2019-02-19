package test;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[] { 6, 2, 0, 1, 9, 8, 3 };
		int searchValue = 9;
		int indexMatch = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == searchValue) {
				indexMatch = i;
			}
		}

		System.out.println("value " + searchValue + " found at index " + indexMatch);
	}

}
