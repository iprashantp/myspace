package binarytree;

public class PrintAllPaths {
	private static Node root;

	public static void main(String[] args) {
		root = new Node();
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		Node node9 = new Node(9);

		root.setLeft(node1);
		root.setRight(node2);
		node1.setLeft(node3);
		node1.setRight(node4);
		node2.setLeft(node5);
		node2.setRight(node6);
		node5.setLeft(node7);
		node5.setRight(node9);
		node7.setRight(node8);
		printPath(root);

	}

	private static void printPath(Node node) {
		int pathArr[] = new int[1000];
		printPathRec(node, pathArr, 0);
	}

	private static void printPathRec(Node node, int[] pathArr, int currentIndex) {
		if (node == null)
			return;
		pathArr[currentIndex] = node.getData();
		if (node.getLeft() == null && node.getRight() == null)
			printArr(pathArr, currentIndex);
		else {
			printPathRec(node.getLeft(), pathArr, currentIndex + 1);
			printPathRec(node.getRight(), pathArr, currentIndex + 1);
		}
	}

	private static void printArr(int[] pathArr, int lastIndex) {
		for (int i = 0; i <= lastIndex; i++) {
			System.out.print(pathArr[i] + " ");
		}
		System.out.println();
	}

}
