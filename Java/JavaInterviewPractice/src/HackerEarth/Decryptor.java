package HackerEarth;

public class Decryptor {

	public static void main(String[] args) {
		int[]a={111,113,117,119,127};
		int[]b={19,25,29,31,37};
		int[]c={24357,46357,64573,84735,84357};
		int i,j,k,count=0;
		for(i=0;i<a.length;i++){
			for(j=0;j<b.length;j++){
				for(k=0;k<c.length;k++){
					System.out.println(a[i]+""+b[j]+""+c[k]);
					if(++count==100) return;
				}
			}
		}
	}

}
