import java.io.PrintStream;
import java.util.NoSuchElementException;

public class CharStackImpl implements CharStack {
        private Node head;
        private class Node { 
		char item; Node next; 
		Node(char item, Node next) { 
			this.item = item; this.next = next; }
                            } 

        
    /**
	 * Checks if the Stack is empty
	 * @return true if the stack is empty
	 */
    @Override
	public boolean isEmpty(){
            
           return(head==null) ;
        
        }

	
    @Override
	public void push(char item){
            head=new Node(item, head);
            
        
        }

	
    @Override
	public char pop() throws NoSuchElementException{
            char v = head.item;
            Node t = head.next;
            head=t;
            return v;
        
        
        
        }

	/**
	 * Prints the contents of the stack, starting from the last item
	 * to the stream given as argument. For example, 
	 * to print to the standard output you need to pass System.out as
	 * an argument. E.g., 
	 * 
	 * printStack(System.out); 
	 */
   
    @Override
	public void printStack(PrintStream stream){
        if ( isEmpty() )
		{
			stream.printf( "Empty stack \n");
			return;
		}
            while(head!=null){
                stream.printf( "%s ", head.item );
                head=head.next;     
               
                   }
             stream.println( "\n" );
        
        
        }

	/**
	 * Computes the size of the stack 
	 * @return the number of items currently in the stack
	 */
    @Override
	public int size(){
            int size =0;
            while (head!= null){
                size=size++;
                head=head.next;
        
        }
            return size;
        
        
   }
        
}
