
import java.io.PrintStream;

/**
 * Defines the methods for a Double-ended Queue that handles characters
 */
public interface CharDoubleEndedQueue {
	/**
	 * return true if the queue is empty
	 */
	public boolean isEmpty();

	/**
	 * insert a character at the front of the queue
	 */
	public void addFirst(char item);

	/**
	 * remove and return a character from the front of the queue
	 */
	public char removeFirst();

	/**
	 * insert a character at the end of the queue
	 */
	public void addLast(char item);

	/**
	 * remove and return a character from the end of the queue
	 */
	public char removeLast();
	
	/**
	 * return the first item in the queue
	 */
	public char getFirst();

	/**
	 * return the last item in the queue
	 */
	public char getLast();
	
	
	/**
	 * print the elements of the queue, starting from the front, 
     	 * to the print stream given as argument. For example, to 
         * print the elements to the
	 * standard output, pass System.out as parameter. E.g.,
	 * printQueue(System.out);
	 */
	public void printQueue(PrintStream stream);

	/**
	 * return the size of the queue, 0 if empty
	 */
	public int size();
}
