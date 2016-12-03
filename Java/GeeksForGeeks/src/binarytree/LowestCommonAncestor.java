package binarytree;

public class LowestCommonAncestor {
	private static LowestCommonAncestor obj = new LowestCommonAncestor();

	public static void main(String[] args) {
		
		Node root = new Node(1);
		root.setLeft(new Node(2));
		root.setRight(new Node(3));
		root.getLeft().setLeft(new Node(4));
		root.getLeft().setRight(new Node(5));
		root.getRight().setLeft(new Node(6));
		root.getRight().setRight(new Node(7));
		//System.out.println(obj.pathLCA(root,6,7));
		obj.pathLCA(root,6,7);
	}
	private Node LCA(Node root, int a, int b){
		if(root==null) return null;
		
		if(root.getData()==a||root.getData()==b)
			return root;
		
		Node left=LCA(root.getLeft(),a,b);
		Node right=LCA(root.getRight(),a,b);
		
		if(left!=null && right!=null)
			return root;
		if(left==null) return right;
		return left;
	}
	private int pathLCA(Node root,int a, int b){
		if(root==null) return -1;
		int []path1=new int[100];
		int []path2=new int[100];
		if(obj.findPath(root,path1,a,0)==false ||obj.findPath(root,path2,b,0)==false)
			return -1;
		int i=0;
		for(i=0;path1[i]==path2[i];i++)
			System.out.println(path1[i]);
			
		return path1[i-1];
	}
	private boolean findPath(Node root,int[]path,int value,int index){
		if(root==null)
			return false;
		path[index]=root.getData();
		if(root.getData()==value) return true;
		if(root.getLeft()!=null && findPath(root.getLeft(), path, value, index+1)==true
				||
				root.getRight()!=null && findPath(root.getRight(), path, value, index+1)==true)
			return true;
		path[index]=-1;
		return false;
	}

}
