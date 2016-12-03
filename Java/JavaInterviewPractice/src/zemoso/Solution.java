package zemoso;


public class Solution extends Point2D{
	public static void main(String []args){
		/*Solution obj=new Solution();
		Point2D A[]=new Point2D[100];
		A[0].x = 0;  A[0].y = 0;
				A[1].x = 1;  A[1].y = 1;
				A[2].x = 2;  A[2].y = 2;
				A[3].x = 3;  A[3].y = 3;
				A[4].x = 3;  A[4].y = 2;
				A[5].x = 4 ; A[5].y = 2;
				A[6].x = 5 ; A[6].y = 1;
		System.out.println(obj.solution(A));*/
		
	}
	
	 public int solution(Point2D[] A) {
		 int n=10,collinearCount;
		 int[][]matrix=new int[n][n];
		 //populate
		 for(int i=0;i<n;i++){
			 for(int j=0;j<n;j++){
				 if(i==j)
					 matrix[i][j]=0;
				 else{
					 matrix[i][j]=getDist(A[i], A[j]);
				 }
			 }
		 }
		 collinearCount=0;
		 for(int i=0;i<n;i++){
			 for(int j=0;j<n;j++){
				 
			 }
		 }
		 return 0;
	    }
	 private boolean areCollinear(){
		// if()
		 return false;
	 }
	 
	 private int getDist(Point2D a,Point2D b){
		 int xd=a.x-b.x;
		 int yd=a.y-b.y;
		 int dist=(int) Math.sqrt(xd*xd+yd*yd );
		 return dist;
	 }

}
class Point2D {
	public Point2D(){};
	  public int x;
	  public int y;
	}