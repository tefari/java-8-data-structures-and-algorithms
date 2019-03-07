package test;

import java.util.LinkedList;

public class LinkedLists {

	public static void main(String args[]) {
		LinkedList linkedList = new LinkedList<Integer>();

		System.out.println("\nAdding");
		for (int i = 0; i <= 10; i++) {
			linkedList.add(i);
			printListDetails(linkedList);

		}
		System.out.println("\nRemoving");
		for (int i = 0; i <= 10; i++) {
			printListDetails(linkedList);
			linkedList.removeLast();
			//
		}
	}

	public static void printListDetails(LinkedList list) {

		System.out.print("size: " + list.size() + ", ");
		System.out.print("first: " + list.getFirst() + ", ");
		System.out.println("last: " + list.getLast());

	}

}
