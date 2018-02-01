package rmuti.ds;

public class Node {
	private Object element;
	Node left, right;

	public Node(Object e, Node l, Node r) {
		element = e;
		left = l;
		right = r;
	}

	@Override
	public String toString() {
		return element.toString();
	}
}
