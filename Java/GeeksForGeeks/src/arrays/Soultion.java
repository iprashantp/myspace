package arrays;

import java.io.*;
import java.util.*;
public class Soultion {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Reader.initialize(System.in);
        int n= Reader.nextInt();
        int[]arr=new int[n];
        
        for(int i=0;i<n;i++){
            arr[i]=Reader.nextInt();
        }
        int prevdiff=arr[1]-arr[0];
        int diff=prevdiff;
        for(int i=2;i<n;i++){
            diff=arr[i]-arr[i-1];
            if(diff<prevdiff){
                System.out.println(arr[i-1]-diff);
                break;
            }
            else if(diff>prevdiff){
                System.out.println(arr[i]-prevdiff);
                break;
            }
            prevdiff=diff;
        }
        
    }
}
