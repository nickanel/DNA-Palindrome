/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikanel
 */
public class EmtpyQueueException extends RuntimeException {
	public EmtpyQueueException(String mesg) {
		super(mesg);
	}
	
	public EmtpyQueueException(Throwable t) {
		super(t);
	}
	
	public EmtpyQueueException(String mesg, Throwable t) {
		super(mesg, t);
	}
}
