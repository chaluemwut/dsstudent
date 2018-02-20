package rmuti.ds;

public class BinaryTree {
	Node root;

	public BinaryTree(Node root) {
		this.root = root;
	}

	private int numNodes(Node node) {
		if (node == null)
			return 0;
		return 1 + numNodes(node.getLeft()) + numNodes(node.getRight());
	}

	public int numNodes() {
		return numNodes(root);
	}

	public void preOrder(Node r, Visitor v) {
		if (r == null)
			return;
		v.visit(r.getValue());
		preOrder(r.getLeft(), v);
		preOrder(r.getRight(), v);
	}

	public void inOrder(Node r, Visitor v) {
		if (r == null)
			return;		
		inOrder(r.getLeft(), v);
		v.visit(r.getValue());
		inOrder(r.getRight(), v);
	}

}
