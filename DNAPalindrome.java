
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikanel
 */
public class DNAPalindrome {public static void main(String[ ] args)
   {
	Scanner input = new Scanner(System.in);     
        System.out.println("Give DNA Sequence:");
	 sequence= new String();      
      
      while (sequence.length()!=0);
      {
	 System.out.println(" ");
         sequence = input.nextLine( );
	if (Watson_Crick(sequence)){
            System.out.println("The DNA Sequence is  Watson-Crick" );}
        else{
            System.out.println("The DNA Sequence is not Watson-Crick");}
      }
      
   }

    private static String sequence;
    public static boolean Watson_Crick(String sequence_2)
    {
        
        CharDoubleEndedQueueImpl db= new  CharDoubleEndedQueueImpl();      
        char Nucleon;
        int flag=0;
        
        for  ( int i = 0; i < sequence_2.length( ); i++)
      {
	 Nucleon = sequence_2.charAt(i);
         if (Character.isLetter(Nucleon))
         {
            db.addFirst(Nucleon);
            if (Nucleon=='A'){
                db.removeFirst();
                db.addFirst('T');}
            else if (Nucleon=='T'){
                db.removeFirst();
                db.addFirst('A');                         
             }    
            if (Nucleon=='C'){
                db.removeFirst();
                db.addFirst('G');}
            else if (Nucleon=='G'){
                db.removeFirst();
                db.addFirst('C');                         
             }  
           }
         
      }
        for  ( int i = 0; i < sequence_2.length( ); i++){
            db.addLast(db.removeFirst());
            
            
        }
     
      
        while (!db.isEmpty())
      {
         if (!(((db.removeFirst() =='A') && (db.removeLast()=='T')||(db.removeFirst() =='T') && (db.removeLast()=='A'))||
            ((db.removeFirst() =='G') && (db.removeLast()=='C')||(db.removeFirst() =='C') && (db.removeLast()=='G')))){
            flag++;
         }
      }
        
        return (flag==0);
   
}
}
