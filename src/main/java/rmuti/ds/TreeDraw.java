package rmuti.ds;

import java.awt.Dimension;

import javax.swing.JFrame;

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
		if (node == null) {
			return;
		}

		if (node.left != null) {
			addNode(node, node.left);
		}
		if (node.right != null) {
			addNode(node, node.right);
		}
		draw(node.left);
		draw(node.right);
	}
	
	public void draw() {
		draw(root);
		
		Layout layout = new TreeLayout<>((Forest) tree);

		BasicVisualizationServer vs = new BasicVisualizationServer(layout, new Dimension(200, 200));
		vs.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
		vs.getRenderContext().setEdgeShapeTransformer(new EdgeShape.Line<>());

		JFrame frame = new JFrame();
		frame.getContentPane().add(vs);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);		
	}
	

}
