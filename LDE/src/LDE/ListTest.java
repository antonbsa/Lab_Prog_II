package LDE;

public class ListTest {

	public static void main( String args[] ) {
	      List list = new List();  // create the List container

	      

	      list.insertAtBack(new Integer(1));
	      list.insertAtBack(new Integer(2));
	      list.insertAtBack(new Integer(3));
	      list.insertAtBack(new Integer(4));
	      list.print();
	      list.troca_seg_pen();
	      list.print();

     
	      try { 
	        Object removedObject = list.removeFromFront();
	         System.out.println( removedObject.toString() + " removed" );
	         list.print();

	        

	      } 

	      
	      catch ( EmptyListException emptyListException ) {
	         emptyListException.printStackTrace();
	      }
	      
	     
	   }

}
