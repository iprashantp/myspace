package binarytree;

public class Node {
	private Node left;
	private int data;
	private Node right;

	public Node() {
		this.setLeft(null);
		this.setData(0);
		this.setRight(null);
	}

	public Node(int data) {
		this.setLeft(null);
		this.setData(data);
		this.setRight(null);
	}

	public Node(Node node) {
		this.setLeft(node.getLeft());
		this.setData(node.getData());
		this.setRight(node.getRight());
	}

	public Node getLeft() {
		return this.left;
	}

	public Node getRight() {
		return this.right;
	}

	public int getData() {
		return this.data;
	}

	public void setLeft(Node node) {
		this.left = node;
	}

	public void setRight(Node node) {
		this.right = node;
	}

	public void setData(int data) {
		this.data = data;
	}

	public static void printPreorder(Node node) {
		if (node == null)
			return;
		System.out.print(node.getData()+"->");
		printPreorder(node.getLeft());
		printPreorder(node.getRight());

		return;
	}
	public static void printInorder(Node node) {
		if (node == null)
			return;
		printInorder(node.getLeft());
		System.out.print(node.getData()+"->");
		printInorder(node.getRight());

		return;
	}
	public static void printPostorder(Node node) {
		if (node == null)
			return;
		printPostorder(node.getLeft());
		printPostorder(node.getRight());
		System.out.print(node.getData()+"->");

		return;
	}
}
