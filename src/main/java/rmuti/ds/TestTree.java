package rmuti.ds;

import java.awt.Dimension;
import java.util.Stack;


import javax.swing.JFrame;

import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.algorithms.layout.TreeLayout;
import edu.uci.ics.jung.graph.DelegateForest;
import edu.uci.ics.jung.graph.DelegateTree;
import edu.uci.ics.jung.graph.DirectedOrderedSparseMultigraph;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.Forest;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.OrderedKAryTree;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.EdgeShape;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;

public class TestTree {
	int counter = 0;
	DelegateTree<Node, String> tree = new DelegateTree<>(new DirectedOrderedSparseMultigraph());
	Node root = null;
	
	public TestTree(Node root) {
		tree.setRoot(root);
		this.root = root;
	}
	
//	private void draw(Node node) {
//		if (node == null) {
//			return;
//		}
//
//		if (node.left != null) {
//			draw(node.left);			
//			draw(node.right);
////			tree.addChild("e" + (counter++), node, node.left);
//			System.out.println(node.getValue().toString()+" : "+node.left.getValue().toString());
//			
//		}
//		if (node.right != null) {
//			System.out.println(node.getValue().toString()+" : "+node.right.getValue().toString());
//			draw(node.left);
//			draw(node.right);
////			tree.addChild("e" + (counter++), node, node.right);			
//		}
//
//	}
//	
//	private void draw2(Node node) {
//		tree.addChild("e1", root, node.left);
//		tree.addChild("e2", root, node.right);
//	}
//	
//	private void draw3(Node parent, Node child) {
//		tree.addChild("e" + (counter++), parent, child);
//	}
//	
//	Stack<DataStack> s = new Stack<>();
//
//	class DataStack {
//		Node node;
//		Node child;
//		
//		@Override
//		public String toString() {
//			return "[node = "+node.getValue()+" : child = "+child.getValue()+"]";
//		}
//	}
//	
//	private void draw3(Node node) {	
//		if(node.left == null || node.right == null) {
//			return;
//		}
//		
//		
//		
//		draw3(node.left);
//		DataStack dataStack1 = new DataStack();
//		dataStack1.node = node;
//		dataStack1.child = node.left;
//		s.push(dataStack1);		
////		System.out.println(node.getValue()+" : "+node.left.getValue());
////		draw3(node, node.left);
//		
//		draw3(node.right);
//		DataStack dataStack2 = new DataStack();
//		dataStack2.node = node;
//		dataStack2.child = node.right;
//		s.push(dataStack2);
////		System.out.println(node.getValue()+" : "+node.right.getValue());
////		draw3(node, node.right);
//		
//	}
//	
//	private void draw4(Node node) {	
//		if(node == null) {
//			return;
//		}
//		
//		
//		if(node.left != null) {	
//			draw4(node.left);
//			System.out.println(node.getValue()+" : "+node.left.getValue());
//			DataStack dataStack1 = new DataStack();
//			dataStack1.node = node;
//			dataStack1.child = node.left;
//			s.push(dataStack1);				
//		}
//		
//		if(node.right != null) {
//			draw4(node.right);
//			System.out.println(node.getValue()+" : "+node.right.getValue());
//			DataStack dataStack2 = new DataStack();
//			dataStack2.node = node;
//			dataStack2.child = node.right;
//			s.push(dataStack2);			
//		}
//		
//		if(node.left == null && node.right != null) {
//			System.out.println(node.getValue()+" : null");
//			DataStack dataStack = new DataStack();
//			dataStack.node = node;
//			dataStack.child = null;
//			s.push(dataStack);
//		}
//		
//	}
//	
//	
//	private void addNode(Node parent, Node child) {
//		System.out.println(parent+" : "+child);
//		tree.addChild("e" + (counter++), parent, child);
//	}
//	
//	public void draw5(Node root) {
//		if(root == null) {
//			return;
//		}
//		
//		if(root.left != null) {
//			addNode(root, root.left);
//		}
//		if(root.right != null) {
//			addNode(root, root.right);
//		}
//		draw5(root.left);
//		draw5(root.right);
//
//	}
//	
//	public void drawTree() {		
//		draw5(root);
//		System.out.println("**********");
//		
//		Layout layout = new TreeLayout<>(tree);
//		BasicVisualizationServer vs = new BasicVisualizationServer(layout, new Dimension(200, 200));
//		vs.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
//		vs.getRenderContext().setEdgeShapeTransformer(new EdgeShape.Line<>());
//
//		JFrame frame = new JFrame();
//		frame.getContentPane().add(vs);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.pack();
//		frame.setVisible(true);		
//	}
//	
//	public static void main(String[] args) {
//		Node cr = new Node("cr", null, null);
//		
//		Node c = new Node("c", null, cr);
//		
//		Node br = new Node("br", null, null);
//		Node bl = new Node("bl", null, null);
//		Node b = new Node("b", bl, null);
//		Node root = new Node("a", b, c);
//		
//		TestTree testTree = new TestTree(root);
//		testTree.drawTree();
//	
////		manulGen();
//	}
//
//	private static void manulGen() {
//		Node e = new Node("e", null, null);
//		Node d = new Node("d", null, null);
//		Node c = new Node("c", null, null);
//		Node b = new Node("b", null, null);		
//		Node a = new Node("a", null, null);
//		
//		DelegateTree<Node, String> tree = new DelegateTree<>(new DirectedOrderedSparseMultigraph());
////		DelegateTree<Node, String> tree = new DelegateTree<>();
//		
//		tree.setRoot(a);
//		
//		tree.addChild("e1", a, b);		
//		tree.addChild("e3", b, d);
//		tree.addChild("e4", b, e);
//		tree.addChild("e10", a, c);
//		
//		Layout layout = new TreeLayout<>(tree);
//		
//		BasicVisualizationServer vs = new BasicVisualizationServer(layout, new Dimension(200, 200));
//		vs.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
//		vs.getRenderContext().setEdgeShapeTransformer(new EdgeShape.Line<>());
//
//		JFrame frame = new JFrame();
//		frame.getContentPane().add(vs);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.pack();
//		frame.setVisible(true);
//	}

}
