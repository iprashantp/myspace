
public class Array2D {

	public static void main(String[] args) {
		Array2D obj = new Array2D();
		int node=4,edge=5;
		boolean matrix[][]=new boolean[node][node];
		obj.initialize(matrix,node);
		System.out.println(matrix[1][2]);
		
	}
	private void initialize(boolean[][]matrix,int node){
		for(int i=0;i<node;i++){
			for(int j=0;j<node;j++)
				matrix[i][j]=true;
		}
	}

}
