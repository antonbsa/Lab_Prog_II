package ListasEncadeadas;

// class to represent one node in a list
class Node {
   private Object data;    
   private Node nextNode;
   private Node previousNode;

   public Node( Object object ) { 
      this( object, null ); 
   }
   // create Node that refers to Object and to next Node
   public Node( Object object, Node node ) {
      data = object;    
      nextNode = node;  
   }
   // return reference to data in node
   public Object getData()  { 
      return data; // return Object in this node
   }
   public void setData (Object element){
       data = element;
   }
   // return reference to next node in list
   public Node getNext() { 
      return nextNode; // get next node
   }
   public void setNext(Node o) 
   { 
      nextNode = o; 
   }
} // end class Node
