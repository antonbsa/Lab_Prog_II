package AVL_Mod14;

/**
 * Classe que representa o nodo de uma arvore AVL
 */
    public class AvlNode {
    	
    	//Atributo utilizado para armazenar a altura do nodo na arvore
    	protected int height;   
    	
    	//Chave do nodo
    	protected int key;
    	
    	//Referencia ao filho esquerdo e ao filho direito do nodo
        protected AvlNode left, right;

        public AvlNode ( int theElement ) {
            this( theElement, null, null );
        }

        public AvlNode ( int theElement, AvlNode lt, AvlNode rt ) {
            key = theElement;
            left = lt;
            right = rt;
            height   = 0;
        }
    }
