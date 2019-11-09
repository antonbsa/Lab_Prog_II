package SimulacaoLoja;

public class Queue {

	protected Node firstNode;
	protected Node lastNode;
	
	public Queue(){
		firstNode = null;
		lastNode  = null;
	}

	public boolean isEmpty() {
		return firstNode == null;
	}
	
	
	/**
	 * Retorna o tamanho da fila
	 */
	
	public int size(){
		
		Node current 	= firstNode;
		int cont 		= 0;
		
		while (current != null){
			cont = cont + 1;
			current = current.getNext();
		}
		
		return cont;
	}
	
	
	
	
	
	
	
	public Object front() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		return firstNode.getData();
	}
		
	public void enqueue (Object insertItem) {
		if (isEmpty()) {
			firstNode = lastNode = new Node(insertItem);
		} else {
			lastNode.setNext(new Node(insertItem));
			lastNode = lastNode.getNext();
		}
	}
	
	public Object dequeue() throws UnderflowException {
		if (isEmpty()) {
			throw new UnderflowException();
		}
		Object removedItem = firstNode.getData();
		if (firstNode == lastNode)
			firstNode = lastNode = null;
		else
			firstNode = firstNode.getNext();
		return removedItem;
	}
}
	
//	public void print() {
//		if (isEmpty()) {
//			System.out.println("Empty Queue");
//		} else {
//			Node current = firstNode;
//			while (current != null) {
//				System.out.print(current.getData().toString() + ", ");
//				current = current.getNext();
//			}
//			System.out.println("\n");
//		}
//	}
//
//	public static void main(String[] args) {
//		Queue queue = new Queue();  
//		queue.enqueue( "1" );
//		queue.enqueue( "2" );
//		queue.enqueue( "3" );
//		queue.enqueue( "4" );
//		queue.print();
//
//		Object removedEl = null;
//		try {
//			while (!queue.isEmpty()) {
//				removedEl = queue.dequeue(); // use dequeue method
//				System.out.println( removedEl.toString() + " dequeued" );
//			}
//		} catch (UnderflowException e) {
//			System.out.println(e);
//		}
//	}
//
//}
