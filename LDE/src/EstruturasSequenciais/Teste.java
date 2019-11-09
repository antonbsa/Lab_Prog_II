package EstruturasSequenciais;

public class Teste {

	public static void main(String[] args) throws OverflowException, UnderflowException {
		
		Stack s = new Stack(3);
		
		
		s.push((Integer) 1);
		s.push((Integer) 2);
		s.push((Integer) 3);
				
		s.reverse();
		
		System.out.println(s.toString());
	}

}
