package test;

import java.util.List;
import java.util.ArrayList;

public class HelperMethods {
	

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.print("\n");
	}

	public static int[] duplicateArray(int[] array) {
		int[] duplicateArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			duplicateArray[i] = array[i];
		}
		return duplicateArray;
	}

	public static int findMinimum(int[] array, int index) {

		int min = array[index];
		for (int i = index; i < array.length; i++) {

			if (min > array[i]) {
				min = array[i];
				index = i;
			}
		}
		return index;
	}

	public static void print(String str) {
		System.out.println(str);
	}

	public static void print(int num) {
		System.out.println(num);
	}
}
