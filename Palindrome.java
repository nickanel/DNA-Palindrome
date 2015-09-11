/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikanel
 */
import java.io.*;

public class Palindrome
{
    @SuppressWarnings("empty-statement")
	public static void main(String[] args) throws IOException
	{
		
                ArrayQueue q=new ArrayQueue();
                CharStackImpl s=new CharStackImpl();
		System.out.println("Give your word :");
		
		char letter=(char)System.in.read();;
                
		while(letter != '\n' && letter !='\r' )
		{
			q.enqueue(letter);
			s.push(letter);
			letter = (char)System.in.read(); 
		}
		boolean palindromos = true;
		
		while( !q.isEmpty() )
		{
			if( q.dequeue() != s.pop() )
			{
				palindromos = false;
				break;
			}
		}
		if( palindromos ) {
                System.out.println("The word is palindrome or you pressed enter ");
            }
		else {
                System.out.println("The word is not palindrome");
            }
	}
} // end class Palindrome
        
    
           
    
