package rmuti.ds;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Paint;

import javax.swing.JFrame;

import org.apache.commons.collections15.Transformer;

import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.algorithms.layout.TreeLayout;
import edu.uci.ics.jung.graph.DelegateTree;
import edu.uci.ics.jung.graph.DirectedOrderedSparseMultigraph;
import edu.uci.ics.jung.graph.Forest;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.EdgeShape;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;

public class TreeDraw {
	private int counter = 0;
	private int width = 400;
	private int height = 400;

	private DelegateTree<Node, String> tree = new DelegateTree<>(new DirectedOrderedSparseMultigraph());

	private Node root = null;

	public TreeDraw(Node root) {
		tree.setRoot(root);
		this.root = root;
	}

	private void addNode(Node parent, Node child) {
		tree.addChild("e" + (counter++), parent, child);
	}

	private void draw(Node node) {
//		if (node == null) {
//			return;
//		}
//
//		if (node.left != null) {
//			addNode(node, node.left);
//		}
//		if (node.right != null) {
//			addNode(node, node.right);
//		}
//		draw(node.left);
//		draw(node.right);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void binaryTreeDraw() {
		draw(root);

		Layout layout = new TreeLayout<>((Forest) tree);

		BasicVisualizationServer vs = new BasicVisualizationServer(layout, new Dimension(getWidth(), getHeight()));
		vs.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
		vs.getRenderContext().setEdgeShapeTransformer(new EdgeShape.Line<>());

//		Transformer<Node, Paint> p = new Transformer<Node, Paint>() {
//
//			@Override
//			public Paint transform(Node node) { // s represents the edge
//
//				if ("a".equals(node.getValue())) { // your condition
//					return Color.RED;
//				} else {
//					return Color.DARK_GRAY;
//				}
//			}
//		};		
//		vs.getRenderContext().setVertexFillPaintTransformer(p);

		JFrame frame = new JFrame();
		frame.getContentPane().add(vs);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
