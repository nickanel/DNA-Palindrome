/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikanel
 */
public class ArrayQueue implements Queue {

	/**
	 * the array to store items
	 */
	private char[] theArray;

	/**
	 * stores the number of items currently inserted
	 */
	private int currentSize;

	/**
	 * position of the queue head
	 */
	private int front;

	/**
	 * position of the queue rear
	 */
	private int back;

	private static final int DEFAULT_CAPACITY = 10;

	/**
	 * Construct the queue.
	 */
	public ArrayQueue() {
		theArray = new char[DEFAULT_CAPACITY];
		currentSize = 0;
		front = 0;
		back = -1;
	}

	/**
	 * Test if the queue is logically empty.
	 * 
	 * @return true if empty, false otherwise.
	 */
    @Override
	public boolean isEmpty() {
		return currentSize == 0;
	}

	/**
	 * Return and remove the least recently inserted item from the queue.
	 * 
	 * @return the least recently inserted item in the queue.
	 * @throws EmtpyQueueException
	 *             if the queue is empty.
	 */
    @Override
	public char dequeue() throws EmtpyQueueException {
		if (isEmpty()) {
                throw new EmtpyQueueException("ArrayQueue dequeue error");
            }
		char returnValue = theArray[front];
		front = increment(front);
		currentSize--;
		return returnValue;
	}

	/**
	 * Insert a new item into the queue.
	 * 
	 * @param x
	 *            the item to insert.
	 */
    @Override
	public void enqueue(char x) {
		if (currentSize == theArray.length) {
                doubleQueue();
            }
		back = increment(back);
		theArray[back] = x;
		currentSize++;
	}

	/**
	 * Internal method to increment with wraparound.
	 * 
	 * @param x
	 *            any index in theArray's range.
	 * @return x+1, or 0 if x is at the end of theArray.
	 */
	private int increment(int x) {
		if (++x == theArray.length) {
                x = 0;
            }
		return x;
	}

	/**
	 * Internal method to expand theArray.
	 */
	private void doubleQueue() {
		char[] newArray;
		newArray = new char[theArray.length * 2];
		// copy elements that are logically in the Queue
		for (int i = 0; i < currentSize; i++, front = increment(front)) {
                newArray[i] = theArray[front];
            }
		theArray = newArray;
		front = 0;
		back = currentSize - 1;
	}

	public void print() {
		if (isEmpty()) {
			System.out.printf("Empty queue\n");
			return;
		} // end if

		System.out.printf("The queue is: ");
		for (int i = front; i <= back; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println("\n");
	}
}
