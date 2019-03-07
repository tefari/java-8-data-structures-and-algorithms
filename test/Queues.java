package test;

import java.util.Queue;
import java.util.LinkedList;
/*
 * QUEUE 
 * data structure supports first-in-first-out
 * */
public class Queues extends HelperMethods {

	public static void main(String[] args) {
		
		//
		Queue queue = new LinkedList();
		
		//
		for (int i = 0; i <= 10; i++) {
			queue.add(i);
			System.out.print(queue.peek());
		}
		
		//
		System.out.println();
		
		//
		for (int i = 0; i <= 10; i++) {
			System.out.print(queue.peek());
			queue.poll();
		}

		
	}

}
