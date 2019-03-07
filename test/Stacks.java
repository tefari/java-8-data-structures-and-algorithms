package test;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {

		Stack stack = new Stack<Integer>();
		
		for(int i=0;i<=10;i++) {
			stack.push(i);
			System.out.println("first: "+stack.firstElement()+" last: "+stack.lastElement());
		}
		
		for(int i=0;i<=10;i++) {
			System.out.println("first: "+stack.firstElement()+" last: "+stack.lastElement());
			stack.pop();
			
		}
	}

}
