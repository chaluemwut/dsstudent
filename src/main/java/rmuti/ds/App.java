package rmuti.ds;

import java.util.ArrayList;

import cern.colt.Arrays;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		Node i = new Node("i", null, null);
		Node h = new Node("h", null, null);
		
		Node f = new Node("f", null, null);
		Node g = new Node("g", null, null);

		Node b = new Node("b", h, i);
		Node c = new Node("c", f, g);

		Node root = new Node("a", b, c);
		
		final ArrayList lstNode = new ArrayList();
		Visitor v = new Visitor() {

			@Override
			public void visit(Object e) {
				lstNode.add(e);
			}
		};
		
		TreeTraversal traversal = new TreeTraversal();
		traversal.preOrder(root, v);
		System.out.println(lstNode);
		
		
//		TreeDraw drawTree = new TreeDraw(root);
//		drawTree.binaryTreeDraw();
		
	}
}
