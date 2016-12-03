import java.util.Scanner;


public class MissingTermAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int diff=0,prevDiff=0;
		int prev=s.nextInt();
		int number=0;
		while(n-->1){
			number=s.nextInt();
			diff=number-prev;
			if(diff!=prevDiff && diff!=0 && prevDiff!=0){
				System.out.println(number-prevDiff);
				break;
			}
			/*else if(diff<prevDiff){
				System.out.println(number-prevDiff);
				break;
			}*/
			prev=number;
			prevDiff=diff;
		}

	}

}
