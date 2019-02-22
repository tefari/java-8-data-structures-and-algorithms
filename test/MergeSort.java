package test;

public class MergeSort extends HelperMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 8, 7, 6, 5, 4, 3, 2, 1 };
		
		//declare
		int middle;
		int[] firstHalf ;
		int[] secondHalf ;
		int secondHalfIndex;
	
		//initialize
		secondHalfIndex = 0;
		middle = array.length / 2;
		firstHalf = new int[middle];
		secondHalf = new int[middle];
		
		//
		//printArray(array);		
		divide(array,firstHalf,secondHalf,secondHalfIndex);
		//printArray(firstHalf);
		//printArray(secondHalf);
		
		
		
		
	}
	
	public static void divide(int [] array,int [] firstHalf, int []secondHalf,int secondHalfIndex) {
		
		
		
		for (int i = 0; i < array.length; i++) {
			if (i < array.length / 2) {
				firstHalf[i] = array[i];
			} else {
				secondHalf[secondHalfIndex] = array[i];
				secondHalfIndex++;
			}
		}
	}

}
