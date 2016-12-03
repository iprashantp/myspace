package BST;

public class Test {
	

	public static void main(String[] args) {
		BSTNode root=new BSTNode(50);
		BSTNode.insert(27, root);
		BSTNode.insert(12, root);
		BSTNode.insert(31, root);
		BSTNode.insert(30, root);
		BSTNode.insert(45, root);
		BSTNode.insert(40, root);
		BSTNode.insert(70, root);
		BSTNode.insert(68, root);
		BSTNode.insert(75, root);
		BSTNode.insert(69, root);
		root=BSTNode.delete(root, 31);
	}
}
