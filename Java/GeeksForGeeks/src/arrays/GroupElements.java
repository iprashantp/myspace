package arrays;

public class GroupElements {


	public static void main(String[] args) {
		int array[] = { 4, 6, 9, 2, 3, 4, 9, 6, 10, 4 };
		array = GetGroupedElements(array);
	}

	private static int[] GetGroupedElements(int[] array) {
		BSTree bstree = new BSTree();
		int length = array.length;
		for (int i = 0; i < length; i++) {
			bstree.PopulateTree(array[i]);
		}
		bstree.PrintResult();

		return array;
	}

}
class BSTNode{
	int value;
	int count;
	BSTNode left;
	BSTNode right;
	BSTNode(){
		value=count=0;
		left=right=null;
	}
	BSTNode(int value){
		this.value=value;
		count=1;
		left=right=null;
	}
}

class BSTree {
	private BSTNode root;

	public BSTree() {
		root=null;
	}
	public void PrintResult(){
		PrintResult(root);
		//search if present then print and delete it
		System.out.println();
	}
	public void PrintResult(BSTNode root){
		if(root!=null){
			int count= root.count;
			while(count-->0){
				System.out.print(root.value+",");
			}
			PrintResult(root.left);
			PrintResult(root.right);
		}
	}
	public void PopulateTree(int value){
		root=PopulateTree(root,value);
	}
	public void Delete(int value){
		
	}

	public BSTNode PopulateTree(BSTNode node,int value){
		if(node==null){
			node = new BSTNode(value);
		}
		else if(node.value>value){
			node.left=PopulateTree(node.left,value);
		}
		else if(node.value==value){
			node.count++;
		}
		else{
			node.right=PopulateTree(node.right,value);
		}
		return node;
	}
}
