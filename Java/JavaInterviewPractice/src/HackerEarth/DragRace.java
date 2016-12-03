package HackerEarth;
import java.util.Scanner;
import java.util.HashMap;

public class DragRace {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int tc=(int)(Math.pow(2, n)-1);
		HashMap<String,Integer>hm=new HashMap<String,Integer>();
		while(tc-->0){
			String a=inp.next();
			if(!hm.containsKey(a))
				hm.put(a, 0);
			String b=inp.next();
			hm.put(b, 1);
		}
		for(String winner:hm.keySet()){
			if(hm.get(winner)==0){
				System.out.println(winner);
				break;
			}
				
		}
	}

}
