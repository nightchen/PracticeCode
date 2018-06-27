package JianzhiOffer;

/**
 * Created by nightchen on 2018/5/31.
 * 股票最大利润
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 */
public class Problem63 {
    public int maxProfit(int[] prices) {
        if(prices.length <=1){
            return 0;
        }
        int min = prices[0];
        int maxpro = prices[1] - prices[0];
        for(int i = 2;i < prices.length;i++){
            if(prices[i-1] < min){
                min = prices[i-1];
            }
            if(prices[i] - min > maxpro){
                maxpro = prices[i]-min;
            }
        }
        return maxpro;
    }
}
