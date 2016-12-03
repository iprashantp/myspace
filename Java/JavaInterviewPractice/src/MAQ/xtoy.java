package MAQ;

public class xtoy {

	public static void main(String[] args) {
		xtoy obj =new xtoy();
		obj.printx2y(4,11);
	}
	private void printx2y(int x,int y){
		if(x<=y){
			System.out.println(x);
			printx2y(x+1,y);
		}
	}

}
