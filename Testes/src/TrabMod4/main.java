package TrabMod4;

public class main {

	public static void main(String args[]) {
		SequentialList listaOriginal = 	new SequentialList(6);
		SequentialList listaToMerge = 	new SequentialList(5);
		
		listaOriginal.add(1);
		listaOriginal.add(2);
		listaOriginal.add(3);
		
		System.out.println("Lista Original: ");
		listaOriginal.print();
		
		listaToMerge.add("a");
		listaToMerge.add("b");
		listaToMerge.add("c");
		
		SequentialList listaMerge = listaOriginal.merge(listaToMerge);
		System.out.println("Lista após o merge: ");
		listaMerge.print();
		
		SequentialList listaCopiaOfMerge = listaMerge.copyList();
		System.out.println("Lista após copiar: ");
		listaCopiaOfMerge.print();

	}

}
