import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;


public class Main {
	public static void main (String[]args){
		char []arr = new char[32];
		System.out.print("decimal: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Character,Integer> a=new HashMap<Character,Integer>();
		int[]str = null;
		Arrays.sort(str);
		int decimal,index=0;
		try {
			decimal = reader.read();
			while(decimal>0){
				if(decimal%2==0)
					arr[index]='0';
				else
					arr[index]='1';
				
				decimal = decimal>>1;
				index++;
			}
		} catch (IOException e) {
			System.out.println("integer please");
		}
		for(;index>=0;--index)
			System.out.print(arr[index]);
	}

}
