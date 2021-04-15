package arrays;

public class ZigZagArrayTraversal {
    public static void main(String[] args) {
        ZigZagArrayTraversal obj = new ZigZagArrayTraversal();
        int[][] arr = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20},
                {21, 22, 23, 24}
        };
        obj.zigzagTraverse(arr);
        arr = new int[][]{
                {1},
                {5},
                {9},
                {13},
                {17},
                {21}
        };
        obj.zigzagTraverse(arr);
        arr = new int[][]{
                {21, 22, 23, 24, 25, 26}
        };
        obj.zigzagTraverse(arr);

        arr = new int[][]{
                {21, 22, 23, 24, 25, 26},
                {2, 3, 4, 5, 6, 7}
        };
        obj.zigzagTraverse(arr);
    }

    private void zigzagTraverse(int[][] arr) {
        int i = -1;//start up with index -1, will pick next diagonal at index 0
        int j = 0;
        int M = arr.length;
        int N = arr[0].length;

        while (j < N) {
            //picking up next diagonal row to iterate
            if (i < M - 1) {
                i++;
                j = 0;
            } else if (i == M - 1) {
                j++;
            }
            int a = i;
            int b = j;
            //starting with diagonal row to print
            while (a >= 0 && b < N) {
                System.out.print(arr[a--][b++]);
                if (b < N && a >= 0)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
