package test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MergeSort extends HelperMethods {

	public static void main(String[] args) {
		mergeSort(new int [] {10,5,4,3});

	}

	public static int[] mergeSort(int[] array) {
		int n = array.length;
		int[] first;
		int[] second;

		//
		if (n % 2 == 0) {
			first = new int[n / 2];
			second = new int[n / 2];
		} else {
			first = new int[n / 2];
			second = new int[n / 2 + 1];
		}

		//
		for (int i = 0; i < n; i++) {
			if (i < n / 2) {
				first[i] = array[i];
			} else {
				second[i - n / 2] = array[i];
			}
		}

		//
		first = mergeSort(first);
		second = mergeSort(second);

		return merge(first, second);
	}

	public static int[] merge(int[] first, int[] second) {
		int[] result = new int[first.length + second.length];

		//
		int i = 0;
		int j = 0;
		int index = 0;

		//
		while (i < first.length && j < second.length) {
			if (first[i] < second[j]) {
				result[index++] = first[i++];
			} else {
				result[index++] = second[j++];
			}
		}

		//
		while (i < first.length) {
			result[index++] = first[i++];
		}

		//
		while (j < second.length) {
			result[index++] = second[j++];
		}

		return result;
	}

}
