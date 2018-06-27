package LeetCode;

/**
 * Created by nightchen on 2018/6/1.
 * 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被计为是不同的子串。
 * 注：和第五题一样的套路，动态规划求出所有从i到j是否是回文串，如果是，dp[i][j] = true,数量加一。
 */
public class Problem647 {
    public int countSubstrings(String s) {
        int n = s.length();
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        boolean[][] dp = new boolean[n][n];
        int count = 0;
        for(int i = 0;i < n;i++){
            dp[i][i] = true;
            count++;
        }
        for(int i = 0;i < n-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                dp[i][i+1] = true;
                count++;
            }
        }
        for(int len = 3;len <=n;len++){
            for(int i = 0;i < n-len+1;i++){
                int j = i+len-1;
                if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j] = true;
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        String s = "abc";
        System.out.println(new Problem647().countSubstrings(s));
    }
}
