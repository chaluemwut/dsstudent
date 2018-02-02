package rmuti.ds;

/**
 * Hello world!
 *
 */
public class App {
	
    public static void main( String[] args ) {
		Node d = new Node("d", null, null);
		Node e = new Node("e", null, null);
		
		Node f = new Node("f", null, null);
		Node g = new Node("g", null, null);
		
		Node b = new Node("b", null, null);
		Node c = new Node("c", f, g);
		
		Node root = new Node("a", b, c);
				
    		TreeDraw drawTree = new TreeDraw(root);
    		drawTree.draw();
    }
}
