package Mod14.segundo;

public class AvlNode {
	
	protected int height;
	protected Verbete Key;
    protected AvlNode left, right;

    public AvlNode ( Verbete v ) {
        this( v, null, null );
    }

    public AvlNode ( Verbete v, AvlNode lt, AvlNode rt ) {
        Key  = v;
    	left = lt;
        right = rt;
        height   = 0;
    }    
}
