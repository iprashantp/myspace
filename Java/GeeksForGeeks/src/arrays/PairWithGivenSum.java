package arrays;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
/**
 * 
 * @author prashant
 http://www.geeksforgeeks.org/given-a-sorted-and-rotated-array-find-if-there-is-a-pair-with-a-given-sum/ */
public class PairWithGivenSum {
	public static void main(String[] args) throws IOException {
		Reader.initialize(System.in);
		int array[]={11, 15, 26, 38, 6, 8, 9, 10};
		int given_Sum=Reader.nextInt();
		//Method1(given_Sum);
		Method2(array,given_Sum);
		
	}
	private static void Method2(int[]array,int given_Sum) throws IOException{
		int size=array.length;
		int least,highest;
		int i;
		int sum=0;
		boolean pair=false;
		//find pivot
		for(i=0;i<size-1;i++){
			if(array[i]>array[i+1]){
				break;
			}
		}
		highest=i;
		least=(i+1)%size;
		
		while(highest!=least){
			sum=array[highest]+array[least];
			if(sum==given_Sum){
				pair=true;
				break;
			}
			else if(sum<given_Sum){
				least=(least+1)%size;
			}
			else{
				highest = (size+highest-1)%size;
			}
		}
		System.out.println(pair);
		return;
	}
	private static void Method1(int given_Sum) throws IOException{
		int arr_Size=Reader.nextInt();
		Map<Integer,Boolean> map= new HashMap<Integer,Boolean>();
		for(int i=0;i<arr_Size;i++){
			map.put(Reader.nextInt(), true);
		}
		if(FindPair(map,given_Sum))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}
	private static boolean FindPair(Map<Integer,Boolean> map, int given_Sum){
		int key;
		for(Entry<Integer, Boolean> entry: map.entrySet()){
			key=entry.getKey();
			if(key<=given_Sum && map.get(given_Sum-key)){
				return true;
			}
		}
		return false;
	}

}
