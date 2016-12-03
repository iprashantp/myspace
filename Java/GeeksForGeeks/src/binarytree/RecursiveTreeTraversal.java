package binarytree;

import stack.ArrayStack;

public class RecursiveTreeTraversal {
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
		preorderIterative(root);
		inorderIterative(root);
	}
	private static void inorderIterative(Node node){
		if(node==null)
			return;
		ArrayStack stack=new ArrayStack(1000);
		while(true){
			while(node!=null){
				stack.push(node);
				node=node.getLeft();
			}
			if(stack.isStackEmpty()==Boolean.TRUE)
				break;
			node=(Node)stack.pop();
			System.out.print(node.getData()+"->");
			node=node.getRight();
		}
	}

	private static void preorderIterative(Node treeNode) {
		if (treeNode == null)
			return;
		ArrayStack stack = new ArrayStack(1000);
		while (true) {
			while (treeNode != null) {
				System.out.print(treeNode.getData() + "->");
				stack.push(treeNode);
				treeNode = treeNode.getLeft();
			}
			if (stack.isStackEmpty() == Boolean.TRUE)
				break;
			treeNode = (Node) stack.pop();
			treeNode = treeNode.getRight();
		}
	}

}
