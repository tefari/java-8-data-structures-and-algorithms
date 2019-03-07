package test;

import java.util.Stack;

public class Implementations {

	public static void main(String args[]) {
		stackTest();
	}

	static void stackTest() {
		MyStack myStack = new MyStack();
		myStack.push("first");
		System.out.println(myStack.peek());

		myStack.push("second");
		System.out.println(myStack.peek());

		myStack.pop();
		System.out.println(myStack.peek());

		myStack.pop();
		System.out.println(myStack.peek());

		myStack.pop();
		System.out.println(myStack.peek());

		myStack.push("first");
		System.out.println(myStack.peek());
	}
}

// my stack implementation
class MyStack {

	int index = -1;
	int max = 2;
	Object objects[] = new Object[max];

	// add object
	void push(Object o) {
		if (!isFull()) {
			if (index == max - 1) {
				objects[index] = o;
			} else
				objects[++index] = o;

		} else {
			// overflow condition
		}

	}

	// removes last object
	void pop() {
		if (!isEmpty()) {
			objects[index] = null;
			if (index > 0)
				index--;
		} else {
			// underflow occurrence
		}
	}

	// returns last object
	Object peek() {
		if (objects[index] != null) {
			return objects[index];
		} else
			return null;
	}

	// checks if stack is empty
	boolean isEmpty() {
		if (index == 0 && objects[0] == null) {
			return true;
		} else
			return false;
	}

	//
	boolean isFull() {
		if (index == max - 1 && objects[index] != null) {
			return true;
		} else
			return false;
	}

	//
	int getSize() {
		return max;
	}
}

class MyQueue {
}

class MyLinkedList {
}

class MyBinaryTree {
}

class MyHashTable {
}

class MyHeap {
}

class MyGraph {
}