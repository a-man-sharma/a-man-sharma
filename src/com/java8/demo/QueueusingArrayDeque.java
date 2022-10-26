package com.java8.demo;

import java.util.ArrayDeque;

/*Problem Statement
Deque can be used as a queue to exhibit the FIFO (First-In-First-Out) behavior.

Elements are added at the rear of the deque and removed from the front.

The code given below contains the implementation of Queue data structure using the class ArrayDeque. 

Execute the code, make necessary changes as per the comments and observe the output to understand the methods of the ArrayDeque class used for implementing queue.
*/

import java.util.Deque;

public class QueueusingArrayDeque {

	public static void main(String[] args) {

		Deque<String> queue = new ArrayDeque<String>(); // no restrictions in capacity
		queue.add("Joe");
		queue.add("Jack");
		queue.add("Eva");
		queue.add("Mia");
		queue.add("Luke");

		System.out.println("People in queue - After addition of 5 people");
		for (String str : queue) {
			System.out.println(str);
		}

		queue.remove();
		queue.remove();
		queue.remove();

		System.out.println("\nPeople in queue - After removal of 3 people");
		for (String str : queue) {
			System.out.println(str);
		}

		System.out.println();
		System.out.println("Head of the queue using element() - " + queue.element());
		System.out.println("Head of the queue using peek() - " + queue.peek());
		queue.remove();
		queue.remove();

		// new person added to the empty queue using offer()
		queue.offer("Emma");

		// newly added person removed using poll()
		queue.poll();

		System.out.println();
		System.out.println("Removing the head of the queue using poll when queue is empty - " + queue.poll()); // returns
																												// null
																												// since
																												// queue
																												// is
																												// empty

		System.out.println("Head of the queue using peek() when queue is empty - " + queue.peek()); // returns null
																									// since queue is
																									// empty

		/*
		 * Uncomment the lines of code given below one at a time and observe the output
		 */
		// System.out.println("Head of the queue using element() when queue is empty -
		// "+queue.element()); // throws NoSuchElementException since queue is empty

		// System.out.println("Removing the head of the queue using remove() when queue
		// is empty");
		// queue.remove(); // throws NoSuchElementException since queue is empty

	}
}
