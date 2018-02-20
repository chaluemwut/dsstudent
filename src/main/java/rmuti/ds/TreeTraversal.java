package rmuti.ds;

public class TreeTraversal {
	
	public void preOrder(Node r, Visitor v) {
		if (r == null) {
			return;
		}
		v.visit(r.getValue());
		preOrder(r.getLeft(), v);
		preOrder(r.getRight(), v);
	}

	public void inOrder(Node r, Visitor v) {
		if (r == null) {
			return;
		}
		inOrder(r.getLeft(), v);
		v.visit(r.getValue());
		inOrder(r.getRight(), v);
	}

	public void postOrder(Node r, Visitor v) {
		if (r == null) {
			return;
		}
		postOrder(r.getLeft(), v);
		postOrder(r.getRight(), v);
		v.visit(r.getValue());
	}
	
}
