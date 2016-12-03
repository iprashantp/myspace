package arrays;
import java.io.*;
import java.util.*;
public class Solution {
    public static int main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[10];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        return(((n+1)*(arr[0]+arr[n-1]))/2)-sum;
    }
}