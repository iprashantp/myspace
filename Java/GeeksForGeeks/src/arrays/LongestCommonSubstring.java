package arrays;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        LongestCommonSubstring obj = new LongestCommonSubstring();
        String longestStr = obj.longestCommonSubstring("abcdaf3ghi","z3bcdf3ghi");
        System.out.println(longestStr);
    }
    private String longestCommonSubstring(String str1, String str2){
        int arr[][] = new int[str1.length()][str2.length()];
        int maxLen = 0;
        int maxInd = 1;
        for(int i=1;i<str1.length();i++){
            for(int j=1;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    arr[i][j]=arr[i-1][j-1]+1;
                    if(maxLen<arr[i][j]){
                        maxLen=arr[i][j];
                        maxInd=i;
                    }
                }
            }
        }

        return str1.substring(maxInd-maxLen+1,maxInd+1);
    }
}
