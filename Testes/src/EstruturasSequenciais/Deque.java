package EstruturasSequenciais;

public class Deque extends Queue {

	public Deque(int size) {
		super(size);
	}

	public void insertAtFront(Object o) throws OverflowException {
		if (isFull())
			throw new OverflowException();
		//??????????
	}

	public void insertAtBack(Object o) throws OverflowException {
		//?????????
	}

	//public Object removeFromFront() throws UnderflowException {
		//???????????
	//}

	/*public Object removeFromBack() throws UnderflowException {
		if (isEmpty())
			throw new UnderflowException();
		else
			//???????????
	}*/
/*
	public static void main(String args[]) {
		Deque d = new Deque(5);
		try {
			d.insertFromBack("1");
			d.insertFromFront("2");
			d.insertFromBack("3");
		} catch (OverflowException e) {
			System.out.println(e.toString());
		}

		try {
			System.out.println(d.removeFromFront());
			System.out.println(d.removeFromBack());
			
		} catch (UnderflowException e) {
			System.out.println(e.toString());
		}
		

	}*/
}
