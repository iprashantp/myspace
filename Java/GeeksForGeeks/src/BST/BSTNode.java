package BST;

public class BSTNode {
	int data;
	BSTNode left;
	BSTNode right;

	BSTNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	BSTNode(BSTNode node) {
		this.data = node.data;
		this.left = node.left;
		this.right = node.right;
	}

	public static BSTNode insert(int data, BSTNode root) {

		if (root == null)
			return new BSTNode(data);

		else if (data < root.data)
			root.left = insert(data, root.left);

		else if (data > root.data)
			root.right = insert(data, root.right);

		return root;
	}

	public static BSTNode delete(BSTNode node, int data) {
		if (node == null)
			return null;

		else if (data < node.data)
			node.left=delete(node.left, data);
		else if (data > node.data)
			node.right=delete(node.right, data);

		else if (data == node.data) {
			
			if((node.left == null && node.right == null)) return null;
			
			else if (node.left != null && node.right != null) {
				BSTNode temp = null;
				BSTNode parent=node;
				temp=node.right;
				while(temp.left!=null){
					parent=temp;
					temp=temp.left;
				}
				node.data=temp.data;
				parent.left=delete(temp,temp.data);
			 }
			else if (node.left != null) return node.left;
			
			else if (node.right != null) return node.right;
		}
		return node;
	}
}
