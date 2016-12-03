package binarytree;

public class MaxDeapth {
	private static Node root;

	public static void main(String[] args) {
		root=new Node();
		Node node1=new Node(1);
		Node node2=new Node(2);
		Node node3=new Node(3);
		Node node4=new Node(4);
		Node node5=new Node(5);
		Node node6=new Node(6);
		Node node7=new Node(7);
		Node node8=new Node(8);
		Node node9=new Node(9);
		root.setLeft(node1);
		root.setRight(node2);
		node1.setLeft(node3);
		node1.setRight(node4);
		node2.setLeft(node5);
		node2.setRight(node6);
		node5.setLeft(node7);
		node5.setRight(node9);
		node7.setRight(node8);
		System.out.println("max deapth: "+maxDeapth(root));
	}
	private static int maxDeapth(Node node){
		int retVal=0;
		if(node!=null){
			retVal =1+ maxNode(maxDeapth(node.getLeft()),maxDeapth(node.getRight()));
		}
		return retVal;
	}
	private static int maxNode(int a,int b){
		
		if(a>b)
			return a;
		return b;
	}

}
