package HackerEarth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


class TestClass {
   public static void main(String args[] ) throws Exception {
       /*
        * Read input from stdin and provide input before running
		*/
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String line = br.readLine();
       int N = Integer.parseInt(line);
       String[] a;
       N=(int)(Math.pow(2, N)-1);
       HashMap<String,Integer>hm=new HashMap<String,Integer>();
       while(N-->0) {
       	a=br.readLine().split(" ");
       	if(!hm.containsKey(a[0]))
       		hm.put(a[0],0);
       	
       	hm.put(a[1],1);
       }
       for(String winner:hm.keySet()){
       	if(hm.get(winner)==0){
       		System.out.println(winner);
       		break;
       	}
       }
   }
}