package LDE;
import java.lang.String;

public class ListaOrdenada extends List {
	/*
	public void listAscending() throws EmptyListException {
	    if ( isEmpty() ) // throw exception if List is empty
	    		throw new EmptyListException();
		
	    List listaAscending = new List();
	    Node current = firstNode;
	    
	  	int menor = (Integer) current.getData();
	  	Node nodeMenor = current;
	  	
	  	int menorAnterior = 0;
	  	Node nodeMenorAnterior = current;
	  	
	  	//Início da função
	  	
	  	current = current.getNext();
	  	while (current != null) {
	  		if((Integer) current.getData() < menor){
	  			menorAnterior = (Integer) current.getData();
	  			nodeMenorAnterior = current;
	  		}
	  		current = current.getNext();
	  		}
	  	
	  	listaAscending.insertAtBack(nodeMenorAnterior);
	  	
	  	for(int i = 0; menor != (Integer) lastNode.getData(); i++) {
	  		current = firstNode;
	  		menor = (Integer) current.getData();
	  		
	  		while (current != null) {
	  			if((Integer) current.getData() < menor && menor > menorAnterior) {
	  				listaAscending.insertAtBack(nodeMenor);
	  			}else if((Integer) current.getData() < menor){
	  				menor = (Integer) current.getData();
		  			nodeMenor = current;
	  			}
	  		}
	}
}
	*/
	
	public void insert(String s) {
		//Atribuição à um nodo para a String
		Node novo = firstNode;
		novo.setData(s);
		
		//Se for menor que o primeiro
		if(firstNode.toString().compareTo(s) > 0) {			
			firstNode.setPrevious(novo);
	        novo.setNext(firstNode);
	        firstNode = novo;
		}
		
		//Se for maior que o último
		if(lastNode.toString().compareTo(s) < 0) {
			lastNode.setNext(novo);
	        novo.setPrevious(lastNode);
	        lastNode = novo;
		}
		
		//Caso seja um valor intermediário
		
		Node current = firstNode;
		Node previous = firstNode;
		while(current.toString().compareTo(s) <= 0) {
			previous = current;
			current = current.getNext();
		}	
		
		//Fiquei com dúvida se havia necessidade de fazer essas 4 atribuições
		//Mas para evitar erros, fiz igual
		current.setPrevious(novo);
		novo.setNext(current);
		previous.setNext(novo);
		novo.setPrevious(previous);
	}			
	
	public void printAscending() {
		      if ( isEmpty() ) {
		         System.out.println( "List Empty!");
		         return;
		      }
		      
		      Node current = firstNode;

		      // while not at end of list, output current node's data
		      while ( current != null ) {
		         System.out.print( current.getData().toString() + " " );
		         current = current.getNext();
		      }

		      System.out.println( "\n" );
		   }
	
	public void printDescending() {
		if ( isEmpty() ) {
	         System.out.println( "List Empty!");
	         return;
	      }
	      
	      Node current = lastNode;

	      // while not at end of list, output current node's data
	      while ( current != null ) {
	         System.out.print(current.getData().toString() + " " );
	         current = current.getPrevious();
	      }

	      System.out.println( "\n" );
	   }
	
	/*
	public void printAscending2() {
		
	List listaAscending = new List();
	Node current = firstNode;
	Node previous = firstNode;
	int menor = (Integer) current.getData();
	
	current = current.getNext();
	while (current != null) {
		if((Integer) current.getData() < menor) {
			menor = (Integer) current.getData();
		}
		current = current.getNext();
		}
	
	listaAscending.insertAtBack(current);
	}
	*/
}