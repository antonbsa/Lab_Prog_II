package Mod12_ArvoreBinaria;

public class BSTTest {

	public static void main(String[] args) {

			BST bst = new BST();
			
			bst.insert((Integer) 50);
			bst.insert((Integer) 20);
			bst.insert((Integer) 10);
			bst.insert((Integer) 30);
			bst.insert((Integer) 40);
			bst.insert((Integer) 76);
			bst.insert((Integer) 70);
			bst.insert((Integer) 65);
			bst.insert((Integer) 72);
			bst.insert((Integer) 79);
			/*bst.print();
			System.out.println("\nApós deletado: \n");
			bst.delete(5);
			*/
			bst.delete(50);
			bst.print();
			System.out.println("\nok");
			
	}

}
