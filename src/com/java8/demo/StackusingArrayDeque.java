package com.java8.demo;

import java.util.ArrayDeque;

/*Problem Statement
Deques can also be used as a stack to exhibit the LIFO (Last-In-First-Out) behavior.

When a deque is used as a stack, elements are pushed and popped from the beginning (top) of the deque.

The code given below contains the implementation of Stack data structure using the class ArrayDeque.

Execute the code, make necessary changes as per the comments and observe the output to understand the methods of the ArrayDeque class used for implementing stack.
*/

import java.util.Deque;

public class StackusingArrayDeque {

	public static void main(String[] args) {

		Deque<Integer> stack = new ArrayDeque<Integer>(); // no restrictions in capacity
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		System.out.println("Numbers in stack - After addition of 5 values");
		for (Integer val : stack) {
			System.out.println(val);
		}

		stack.pop();
		stack.pop();
		stack.pop();

		System.out.println("\nNumbers in stack - After removal of 3 values");
		for (Integer val : stack) {
			System.out.println(val);
		}

		System.out.println();
		System.out.println("Top of the stack using peek() - " + stack.peek());

		stack.pop();
		stack.pop();

		// Uncomment the below code and observe the output
		// System.out.println("Trying to remove the element from the top of the stack
		// using pop() when stack is empty - "+stack.pop()); // throws
		// NoSuchElementException since stack is empty

	}

}
