/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikanel
 */
public interface Queue {
		
	/**
	* Insert a new item into the queue.
	* @param x the item to insert.
	*/	
	public void enqueue( char x );
	
	/**
	* Return and remove the least recently inserted item
	* from the queue.
	* @return the least recently inserted item in the queue.
	* @throws EmtpyQueueException if the queue is empty.
	*/
	public char dequeue( ) throws EmtpyQueueException;
	
	/**
	* Test if the queue is logically empty.
	* @return true if empty, false otherwise.
	*/	
	public boolean isEmpty( );
    
}
