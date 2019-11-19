package Mod15_GeneralTree;


public class GeneralTree {
    private Object key;
    private int degree;
    private List list; 

    public Object getKey ()
	{ return key; }
	
	public GeneralTree (Object key) {
		this.key = key;
		degree = 0;
		list = new List ();
    }

    public GeneralTree getSubtree (int i) {
		if (i < 0 || i >= degree)
		    throw new IndexOutOfBoundsException ();
		Node ptr = list.getFirst ();
		for (int j = 0; j < i; ++j)
		    ptr = ptr.getNext ();
		return (GeneralTree) ptr.getData ();
    }

    public void attachSubtree (GeneralTree t) {
		list.insertAtBack (t);
		++degree;
    }

    public GeneralTree detachSubtree (GeneralTree t) throws UnderflowException {
		list.remove (t);
		--degree;
		return t;
    }
    
    public int countNodes(GeneralTree t) {
    	int c = t.degree + 1;
    	return countNodes(t, c);
    }
    
    
    protected int countNodes(GeneralTree t, int c) {
    	Node current = (Node) t.list.getFirst();
    		
	    	while(current != null) {
	    		c = c + countNodes((GeneralTree)current.getData(),((GeneralTree)current.getData()).degree);
	    		current = current.getNext();
    } return c;
    
//    public int contaFilhosNodo(GeneralTree t){
//    	int contador = t.degree;
//    	return this.countNodes(t, contador);
//    	}
//    
//    protected int countNodes(GeneralTree t, int c){
//    	Node current = t.list.getFirst();
//    	while(current!= null){
//    	c = c + this.countNodes((GeneralTree) current.getData(),((GeneralTree) current.getData()).degree);
//    	current = current.getNext();
//    	}
//    	return c;
//    	}
    
    
}
}






