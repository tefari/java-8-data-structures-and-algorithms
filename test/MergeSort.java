package test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class MergeSort extends HelperMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList array = new ArrayList();

		array.add(8);
		array.add(7);
		array.add(6);
		array.add(5);
		array.add(4);
		array.add(3);
		array.add(2);
		array.add(1);
		array.add(8);
	
		ArrayList<ArrayList> arrayList = new ArrayList();
		arrayList.add(array);
		arrayList.add(merge(array));

		ArrayList merger = arrayList.get(1);
		ArrayList i = new ArrayList();

		for (Object a : merger) {
			ArrayList al = merge((ArrayList<ArrayList>) a);
			for (Object o : al) {				
				i.add(o);
			}
		}
		arrayList.add(i);
		
		for(Object o:arrayList) {
			System.out.println(o);
		}

	}

	public static ArrayList<ArrayList> merge(ArrayList<ArrayList> array) {
		ArrayList<ArrayList> arraylist = new ArrayList();
		// first array
		ArrayList firstArray = new ArrayList();
		arraylist.add(firstArray);

		// second array
		ArrayList secondArray = new ArrayList();
		arraylist.add(secondArray);

		// iterate through array and add elements to array list
		for (int i = 0; i < array.size(); i++) {
			if (i < array.size() / 2) {
				// first half of array
				firstArray.add(array.get(i));
			} else {
				// second half of array
				secondArray.add(array.get(i));
			}
		}

		return arraylist;
	}

}
