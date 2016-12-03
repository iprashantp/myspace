package Adobe;

public class FindMax1s {
	public static void main (String[]args){
		FindMax1s obj = new FindMax1s();
		int[][]arr={{0,0,1,0,0,1,1,0,0},
					{0,1,0,0,0,0,0,1,0},
					{1,1,1,0,0,0,0,1,0},
					{0,1,1,0,0,0,0,1,0},
					{0,1,0,1,1,1,0,1,0},
					{0,1,0,0,0,1,0,1,0},
					{0,1,1,1,1,1,1,1,1},
					{0,1,0,0,0,0,0,0,0},
					{0,0,0,0,0,0,0,0,0},
					};
		obj.findMax(arr);
	}
	private void findMax(int[][]arr){
		int max=Integer.MIN_VALUE;
		int newMax=Integer.MIN_VALUE;
		int row=0;
		for(int i=0;i<9;i++){
			newMax=countMax(arr[i]);
			if(newMax>max){
				max=newMax;
				row=i;
			}
		}
		System.out.println("max 1s are: "+max+" at row: "+row);
		return ;
	}
	private int countMax(int[] arr){
		int counter=0;
		for(int i=0;i<9;i++){
			if(arr[i]==1)
				counter++;
		}
		return counter;
	}

}
