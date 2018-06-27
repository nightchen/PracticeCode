package LeetCode;

/**
 * Created by nightchen on 2018/6/1.
 * 给定一个字符串s，找到其中最长的回文子序列。可以假设s的最大长度为1000。
 */
public class Problem516 {
    public int longestPalindromeSubseq(String s) {
        if(s.length() == 0){
            return 0;
        }else if(s.length() == 1){
            return 1;
        }
        String str = new StringBuilder(s).reverse().toString();
        int n = s.length();
        int[][] dp = new int[n+1][n+1];
        for(int i = 0; i< n;i++){
            dp[i][0] = 0;
        }
        for(int j = 1; j < n;j++){
            dp[0][j] = 0;
        }

        for(int i = 1;i < n+1;i++){
            for(int j = 1; j <n+1;j++){
                if(s.charAt(i-1) == str.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[n][n];
    }

    public static void main(String[] args){
        String s = "bbbab";
        System.out.println(new Problem516().longestPalindromeSubseq(s));
    }
}
