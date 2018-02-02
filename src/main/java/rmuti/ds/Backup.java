package rmuti.ds;

import java.awt.Dimension;

import javax.swing.JFrame;

import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.algorithms.layout.TreeLayout;
import edu.uci.ics.jung.graph.DelegateForest;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.Forest;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.EdgeShape;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;

public class Backup {
	Graph<Node, String> graph = new DelegateForest(new DirectedSparseGraph());
	int counter = 0;

	private Node root;

	public Backup(Node root) {
		this.root = root;
	}

	private void draw(Node node) {
		if (node == null) {
			return;
		}

		if (node.left != null) {
			draw(node.left);
			draw(node.right);
			graph.addEdge("e" + (counter++), node, node.left);
		}
		if (node.right != null) {
			draw(node.left);
			draw(node.right);
			graph.addEdge("e" + (counter++), node, node.right);
		}

	}

	public void drawTree() {
		draw(root);

		Layout layout = new TreeLayout<>((Forest) graph);

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
