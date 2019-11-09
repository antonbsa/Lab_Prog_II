package TrabMod13_Arvores;

	public class BSTTest { 
		public static void main(String[] args) { 
			
			BST a = new BST();
			int indexMenu = 0;
			System.out.println("Bem-vindo!\n");
			
			//Repetição para voltar ao início após concluir a opção selecionada
		while(indexMenu != 1) {
			int index = Teclado.leInt(":::::::::: MENU :::::::::::"
					+ 				  "\nDigite a opção desejada:\n\n"
					+ 				  "1 - Inserir valor;\n"
					+ 				  "2 - Buscar valor;\n"
					+ 				  "3 - Percursos;\n"
					+ 				  "4 - Número de nodos folha;\n"
					+ 				  "5 - Altura;\n"
					+ 				  "6 - Número total de nodos;\n"
					+ 				  "7 - Verificar se a árvore está cheia;\n"
					+ 				  "8 - Sair.");
			if(index < 1 || index > 8) {
				System.out.println("\n---- Valor fora de parâmetro! ----"
						+ 		   "\nPor favor, digite um valor dentro do intervalor requerido.\n");
			} else
			//Switch principal
			switch(index) {
			case 1:
				System.out.println("_____________________________________");
				int valorInsert = Teclado.leInt("\nDigite o valor à ser inserido: ");
				if(a.insert(valorInsert) == true) {
					System.out.println("\n---- Valor Inserido! ----");
				} else
					System.out.println("\n---- Valor NÃO Inserido! O mesmo já contém na árvore. ----");
				System.out.println("_____________________________________\n");
				break;
				
			case 2:
				System.out.println("_____________________________________");
				int valorSearch = Teclado.leInt("\nDigite o valor à ser pesquisado na árvore: ");
				
				if(a.search(valorSearch) != null) {
					System.out.println("\nValor "+ valorSearch + " encontrado!\n");
				} else 
					System.out.println("\nValor não foi encontado.\n");
				System.out.println("_____________________________________\n");
				break;
				
			case 3:
				System.out.println("_____________________________________");
				int indexCase3 = Teclado.leInt("\nEscolha qual percurso deseja efetuar:\n\n"
						+ 					   "1 - Em ordem;\n"
						+ 					   "2 - Pré-Ordem;\n"
						+ 					   "3 - Pós-Ordem.");
					//Switch interno Case 3
					switch(indexCase3) {
					case 1:
						System.out.print("\nÁrvore Em ordem: ");
						a.inorder();
						System.out.print(".\n");
						System.out.println("_____________________________________\n");
						break;
					case 2:
						System.out.print("\nÁrvore em Pré-ordem: ");
						a.preorder();
						System.out.println(".\n");
						System.out.println("_____________________________________\n");
						break;
					case 3:
						System.out.print("\nÁrvore em Pós-ordem: ");
						a.postorder();
						System.out.println(".\n");
						System.out.println("_____________________________________\n");
						break;
					}
				break;
				
			case 4:
				System.out.println("_____________________________________");
				System.out.println("\nNúmero de nodos folha: "+a.countLeafNodes()+".");
				System.out.println("_____________________________________\n");
				break;
				
			case 5:
				System.out.println("_____________________________________");
				System.out.println("\nAltura atual da árvore: "+a.height()+".");
				System.out.println("_____________________________________\n");
				break;
				
			case 6:
				System.out.println("_____________________________________");
				System.out.println("\nEsta árvore contém "+a.countNodes()+" nodos totais.");
				System.out.println("_____________________________________\n");
				break;
				
			case 7:
				System.out.println("_____________________________________");
				
				if(a.isFull() == false) {
					System.out.println("\nA árvore NÃO está cheia!");
				} else {
					System.out.println("\nA árvore está cheia!");}
				
				System.out.println("_____________________________________\n");
				break;
				
			case 8:
				System.out.println("\nAté mais!");
				indexMenu = 1;
				break;
				
			}
				
				
		}
  
 }
}
