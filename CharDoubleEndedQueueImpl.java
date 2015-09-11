
import java.io.PrintStream;
import java.util.NoSuchElementException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class CharDoubleEndedQueueImpl implements CharDoubleEndedQueue {
    
        public CharDoubleEndedQueueImpl(){
            head=tail=pre_tail=null;
               }     
           
         private Node head;
	 private Node tail;
         private Node pre_tail;
         private class Node { 
         char item; Node next;Node prev;
         
         Node(char item) { 
             this.item = item; 
             this.next=null;
             this.prev=null;}
         
                            } 

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void addFirst(char item) {
        Node t= new Node (item);
        if ( isEmpty() ) 
                {t=head = tail = pre_tail;}
        else { 
		 t.next = head;
		 head = t;
             }
    }

    @Override
    public char removeFirst() throws NoSuchElementException{
       if ( isEmpty() ) {
                throw new NoSuchElementException( );
            }
       char ex =head.item;
       if ( head == tail ){
            head = tail = pre_tail=null;}
       else{
            head = head.next;
            }
               
       return ex;
    }

    @Override
    public void addLast(char item) {
        Node t= new Node (item);
         if ( isEmpty() ) 
                {t=head = tail = pre_tail;}
        else { 
		tail.next=t;
                tail.prev=pre_tail;
                pre_tail=tail;
		tail=t;
                
             }
      
    }

    @Override
    public char removeLast()throws NoSuchElementException { // na tin ksanadw
        if ( isEmpty() ) {               
                throw new NoSuchElementException( );
            }
       char ex =tail.item;
       if ( head == tail ){
            head = tail = pre_tail=null;}
       else{
           tail=pre_tail;
           tail.prev=pre_tail;
            
            }
               
       return ex;
    }

    @Override
    public char getFirst()throws NoSuchElementException {
        if ( isEmpty() ) {
                throw new NoSuchElementException();
            }
        else{
                char first= head.item;
                return first;
        
        }
        
    }

    @Override
    public char getLast() {
        if ( isEmpty() ) {
                throw new NoSuchElementException();
            }
        else{
            char last=tail.item;
            return last;
        
        }
    }

    @Override
    public void printQueue(PrintStream stream) {
        
		if ( isEmpty() )
		{
			stream.printf( "Empty List" );
			return;
		} 
                Node temp=head;
                while (temp!= null )
		{
			stream.printf( "%s ", temp.item );
			temp = temp.next;
		} // end while

		stream.println( "\n" );
    
    }

    @Override
    public int size() {
        int counter=0;
        Node temp=head;
        while (temp!=null){
            counter=counter++;
            temp=temp.next;
        
                    }
       return counter;
    }
    
}
