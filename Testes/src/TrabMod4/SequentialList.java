package TrabMod4;

public class SequentialList {

	protected Object list[];
	protected int 	 last = -1;
	
	public SequentialList(int size) {
		list = new Object [size];
	}
	
	public Object get (int index) {
		if(index<0 || index>last) return null;
		else return list[index];
	}
	
	public Boolean add(Object o) {
		if (isFull ()) return false;
		last++;
		list[last] = o;
		return true;
	}
	
	public Boolean addPos (Object o, int pos) {
		if(isFull()) return false;
			for(int i = last+1;i>pos; i--) {
				list[i]=list[i-1];
			}
			last++;
			list[pos]=o;
			return true;	
			}
	
	public Object remove(int index) {
		if(isEmpty()) return null;
		else if (index<0 || index>last) {
			System.out.println("Índice não existende!");
			return null;
		}
		Object o = list [index];
		int numeroElements = last - index;
		if(numeroElements > 0) {
			System.arraycopy(list, index + 1, list, index, numeroElements);
		}
		list[last] = null;
		last--;
		return o;
	}
	
	public Boolean isFull() {
		if(last == list.length-1) return true;
			else return false;
	}
	
	public Boolean isEmpty() {
		if(last==-1) return true;
		else return false;
	}
	
	public int getSize() {
		return last+1;
	}
	
	public void print() {
		for(int i = 0; i<= last; i++) {
			System.out.println(list[i]);
		}
	}
		
		
	public SequentialList merge(SequentialList list) {
		SequentialList newList = new SequentialList(this.getSize() + list.getSize());
		
		for(int i = 0; i <= this.last; i++) {
			newList.add(this.get(i));
		}
		for(int i = 0; i <= list.last; i++) {
			newList.add(list.get(i));
		}
		
		return newList;
	}
	
	public SequentialList copyList() {
		SequentialList newList = new SequentialList(this.getSize());
		for(int i = 0; i <= this.getSize(); i++) 
		{	
			newList.add(this.get(i));
		}
		
		return newList;
	}
	
}