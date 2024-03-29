package ListasEncadeadas;

public class ListTest {

   public static void main( String args[] ) {
      List list = new List();  // create the List container

      // objects to store in list
      Boolean bool = Boolean.TRUE;
      Character character = new Character( '$' );
      Integer integer = new Integer( 34567 );
      String string = "hello";

      // insert references to objects in list
      list.insertAtFront( bool );
      //list.print();
      list.insertAtFront( character );
      //list.print();
      list.insertAtBack( integer );
      //list.print();
      list.insertAtBack( string );
      //list.print();

      // remove objects from list; print after each removal
      try { 
         Object removedObject = list.removeFromFront();
         System.out.println( removedObject.toString() + " removed" );
         list.print();

         removedObject = list.removeFromFront();
         System.out.println( removedObject.toString() + " removed" );
         list.print();

         removedObject = list.removeFromBack();
         System.out.println( removedObject.toString() + " removed" );
         list.print();

         removedObject = list.removeFromBack();
         System.out.println( removedObject.toString() + " removed" );
         
         list.print();


      } // end try block 
 

      // catch exception if remove is attempted on an empty List 
      catch ( EmptyListException emptyListException ) {
         emptyListException.printStackTrace();
      }
    
      

   }

} // end class ListTest
