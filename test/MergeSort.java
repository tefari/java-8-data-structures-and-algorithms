package test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MergeSort extends HelperMethods {

	public static void main(String[] args) {

	}

	public static int[] mergeSort(int[] array) {
		return null;
	}

	public static int[] merge(int[] first, int[] second) {
		return null;
	}

	public static void test() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[][] array2 = new int[8][8];

		int timesHalved = 0;
		while (halve(array)[0].length >= 2) {
			int h = halve(array)[0].length;
			array = halve(array)[0];
			timesHalved++;

//			int h[][] = new int[array.length][array.length/2];
//			
//			for (int i = 0; i < array.length; i++) {
//				int [][] ha = halve(array);
//				
//				for(int hai=0;hai<ha.length;hai++) {
//					int[][] t = halve(ha[hai]);
//					for(int ti = 0; ti<t.length;ti++) {
//						
//					}
//				}
//				
//				int index = 0;
//				for (int hi = 0; hi < array.length/2; hi++) {
//					h[i][hi] =ha[i][index];
//					 ++index;
//				}
			//
//			}
		}

	}

	public static int[][] halve(int[] array) {

		int length = array.length;
		int index = 0;
		int[][] result = new int[2][length / 2];

		for (int i = 0; i < length; i++) {
			// System.out.println(array[i]);
			if (i < length / 2) {
				// System.out.println("1:" + array[i]);
				result[0][i] = array[i];
			} else {
				// System.out.println("2:" + array[i]);
				result[1][index] = array[i];
				index++;
			}
		}

		return result;
	}

}
