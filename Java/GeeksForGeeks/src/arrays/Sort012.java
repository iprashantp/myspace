package arrays;

public class Sort012 {
    public static void main(String[] args) {
        Sort012 obj = new Sort012();
        int[]arr = {2, 0, 2, 0, 0, 1, 2, 2, 2, 1, 1, 0, 1, 1, 1, 2, 0, 1, 2, 1, 0, 1, 2, 0, 0, 0, 2, 0, 1, 0, 0, 0, 1, 2, 1, 1, 1, 2, 1, 2, 1};
        arr = new int[]{2, 2, 2, 1, 0, 1, 0, 2, 1, 1};
        arr = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        obj.sort012arr(arr, arr.length);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    private void sort012arr(int arr[], int n){
        int start=0, end=n-1;
        while(arr[start]==0) start++;
        while(arr[end]==2) end--;
        int mid = start;
        int temp = 0;
        //for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
        while(mid<=end) {
            //while(arr[start]==0) start++;
            //while(arr[end]==2) end--;
            //if(mid<start)
                //mid = start;

            if(arr[mid] == 1){
                mid++;
            }else if(arr[mid] == 0) {
                temp = arr[start];
                arr[start] = arr[mid];
                arr[mid] = temp;
                start++;
            }else {
                temp = arr[end];
                arr[end] = arr[mid];
                arr[mid] = temp;
                end--;
            }
//            for(int i=0;i<n;i++)
//                System.out.print(arr[i]+" ");
//            System.out.println();
        }
    }
}
/*
41
2 0 2 0 0 1 2 2 2 1 1 0 1 1 1 2 0 1 2 1 0 1 2 0 0 0 2 0 1 0 0 0 1 2 1 1 1 2 1 2 1
 */
