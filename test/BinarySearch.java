package test;

public class BinarySearch extends HelperMethods {

	static int[] array = { 1, 2, 3, 4, 5, 6, 7,8,9 };

	public static void main(String args[]) {
		print("found is "+binarySearch(5,array,0,array.length));
	}

	private static String binarySearch(int[] array, int element) {

		String result = null;
		int target, index;
		boolean found = false;
		boolean notFound = false;

		//
		index = array.length / 2;

		while (!found && !notFound) {
			target = array[index];
			if (target == element) {
				result = ("value of " + target + " found at index " + index);
				found = true;
			} else if (target < element ) {
				
				index += ((array.length-index)/2);

			} else if (target > element && target > 0) {

				if (index == 1) {
					index--;
				} else {
					index = index - index / 2;
				}
			}
			else if ((index < 0 || index >= array.length-1 )&&target!=element) {
				result = "value not found in array";
				notFound=true;
			}
		}

		return result;
	}
	
	static boolean binarySearch(int v, int[] lst, int low, int high) {
	    if (low > high) {
	        System.out.println("not found");
	        return false;
	    }
	    
	    int middle = (low+high)/2;
	    
	    if (v == lst[middle]) {
	        System.out.println("found! It is at " + middle);
	        return true;
	    }
	    else if (v > lst[middle]) {
	        return binarySearch(v, lst, middle+1, high);
	    }
	    else {
	        return binarySearch(v, lst, low, middle-1);
	    }
	}
}
