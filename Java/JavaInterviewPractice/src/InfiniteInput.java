import java.util.Scanner;
public class InfiniteInput {

	public static void main(String[] args) {
		InfiniteInput obj=new InfiniteInput();
		obj.getInput();
	}
	private void getInput(){
		Scanner sc=new Scanner(System.in);
		while(true){
			try{
				String s=sc.next();
				int i=sc.nextInt();
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}

}
