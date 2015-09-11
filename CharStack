/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikanel
 */

import java.io.PrintStream;
import java.util.NoSuchElementException;

/**
 * Defines the methods for a Stack that handles char items
 */
public interface CharStack {
	/**
	 * Checks if the Stack is empty
	 * @return true if the stack is empty
	 */
	public boolean isEmpty();

	/**
	 * Pushes a char item to the stack
	 */
	public void push(char item);

	/**
	 * @return the item that was previously on top of the queue
	 * @throws a NoSuchElementException if the queue is empty
	 */
	public char pop() throws NoSuchElementException;

	/**
	 * Prints the contents of the stack, starting from the last item
	 * to the stream given as argument. For example, 
	 * to print to the standard output you need to pass System.out as
	 * an argument. E.g., 
	 * 
	 * printStack(System.out); 
	 */
	public void printStack(PrintStream stream);

	/**
	 * Computes the size of the stack 
	 * @return the number of items currently in the stack
	 */
	public int size();

}
