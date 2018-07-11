package JianzhiOffer;

/**
 * Created by nightchen on 2018/7/2.
 * 礼物的最大价值
 * 在一个 m*n 的棋盘中的每一个格都放一个礼物，每个礼物都有一定的价值（价值大于0）.
 * 你可以从棋盘的左上角开始拿各种里的礼物，并每次向左或者向下移动一格，直到到达棋盘的右下角。
 * 给定一个棋盘及上面个的礼物，请计算你最多能拿走多少价值的礼物？
 */
public class Problem47 {
    public static int maxValue(int[][] value){
        if(value.length == 0){
            return 0;
        }
        int row = value.length;
        int col = value[0].length;
        int[][] dp = new int[row][col];
        dp[0][0] = value[0][0];
        for(int i = 1;i < row;i++){
            dp[i][0] = dp[i-1][0]+value[i][0];
        }
        for(int j = 1;j < col;j++){
            dp[0][j] = dp[0][j-1]+value[0][j];
        }
        for(int i = 1;i < row;i++){
            for(int j =1;j < col;j++){
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1])+value[i][j];
            }
        }
        return dp[row-1][col-1];
    }

    public static void main(String[] args){
        //int[][] value = new int[][]{{1,10,3,8},{12,2,9,6},{5,7,4,11},{3,7,16,5}};
        int[][] value = new int[][]{{2,8,15,1,10,5,19,19},{3,5,6,6,2,8,2,12},{16,3,8,17,12,5,3,14},{13,3,2,17,19,16,8,7},{12,19,10,13,8,20,16,15},{4,12,3,14,14,5,2,12},{14,9,8,5,3,18,18,20},{4,2,10,19,17,16,11,3}};
        System.out.println(maxValue(value));
    }
}
