package LeetCode;

/**
 * Created by nightchen on 2018/6/1.
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。
 */
public class Problem5 {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n == 0){
            return "";
        }else if(n == 1){
            return s;
        }

        boolean[][] dp = new boolean[n][n];
        int begin = 0;
        int maxlen = 0;
        for(int i = 0;i < n;i++){
            dp[i][i] = true;
        }
        for(int i = 1;i < n-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
                begin = i;
                maxlen = 2;
            }
        }

        for(int len = 3;len <= n; len++){
            for(int i=0;i < n-len+1;i++){
                int j = i + len - 1;
                if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j] = true;
                    begin = i;
                    maxlen = len;
                }
            }
        }
        if(maxlen == 0){
            return String.valueOf(s.charAt(0));
        }
        return s.substring(begin,maxlen);
    }
    public static void main(String[] args){
        String s = "abcda";
        System.out.println(new Problem5().longestPalindrome(s));
    }
}
