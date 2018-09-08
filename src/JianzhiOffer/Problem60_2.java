package JianzhiOffer;

/**
 * Created by nightchen on 2018/7/14.
 * 解法二：基于循环，时间性能好
 * 递归一般是自顶向下的分析求解，而基于循环的方法则是自底向上。
 * 基于循环的一般需要更少的空间和更少的时间，性能较好，但是一般代码比较难懂。
 */
public class Problem60_2 {
    private static final int g_maxValue = 6;
    public static void PrintProbability(int number){
        if(number<1) return;
        int maxSum = number*g_maxValue;
        double total = Math.pow(g_maxValue,number);

        int[][] pProbabilities = new int[2][maxSum+1];
        int flag = 0;
        for(int i = 1;i <= g_maxValue;i++){
            pProbabilities[flag][i] = 1;
        }

        for(int k = 2;k <= number;k++){
            for(int i = 0;i < k;i++){
                pProbabilities[1-flag][i] = 0;
            }
            for(int i = k;i <= g_maxValue*k;i++){
                pProbabilities[1-flag][i] = 0;
                for(int j =1;j <= i && j <= g_maxValue;j++){
                    pProbabilities[1-flag][i]+=pProbabilities[flag][i-j];
                }
            }
            flag=1-flag;
        }
        for(int i = number;i <= maxSum;i++){
            double ratio = pProbabilities[flag][i]/total;
            System.out.println("i: "+i+" ratio: "+ratio);
        }
    }
    public static void main(String[] args){
        PrintProbability(2);
    }
}
