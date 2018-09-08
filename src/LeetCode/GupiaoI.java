package LeetCode;

import java.util.ArrayList;

/**
 * Created by nightchen on 2018/7/18.
 */
public class GupiaoI {
    //此方法过190个测试用例，特殊情况时出错
    public static int maxProfit1(int[] prices) {
        if(prices.length <= 1){
            return 0;
        }

        int left = 0;
        int right = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;i < prices.length;i++){
            if(prices[i] >= prices[i-1]){
                right++;
                if(i == prices.length-1){
                    int d = prices[right] - prices[left];
                    list.add(d);
                }
            }else {
                int d = prices[right] - prices[left];
                list.add(d);
                left = i;
                right = i;
            }
        }
        list.sort((o1,o2)->o2-o1);
        int max = 0;
        if(list.size() <= 2){
            for(Integer i : list){
                max += i;
            }
        }else {
            max = list.get(0)+list.get(1);
        }
        return max;
    }
    /**
     * left[i] 表示0 - i 这段数组的最大收益
     * right[i] 表示i - A.length-1 这段数组的最大收益
     * 在求两个数组的和时候只需要线性的时间复杂度
     */

    public int maxProfit2(int[] A) {
        // write your code here
        if(A == null || A.length == 0)
            return 0;
        if(A.length == 1)
            return 0;
        int sum=0;
        int[] left = new int[A.length];
        int[] right = new int[A.length];
        int min = A[0];
        //  left[i] 表示在 0 - i 中能够 卖出的最大收益，当是 0的时候表示不买也不卖
        for(int i =1;i< A.length;i++){
            if(min<= A[i]){
                left[i] = Math.max(left[i-1], A[i] - min);
            }else{
                left[i] = left[i-1];
                min = A[i];
            }

        }
        int max = A[A.length - 1];
        // right[i] 表示在 i - A.length-1 中能够卖出的最大收益
        for( int i = A.length -2;i>=0;i--){
            if(max >= A[i]){
                right[i] = Math.max(right[i+1],max - A[i]);
            }else{
                right[i] = right[i+1];
                max = A[i];
            }
        }
        max = Integer.MIN_VALUE;
        for(int i = 0;i< A.length;i++){
            max = Math.max(max,left[i] + right[i]);
        }
        return max;
    }

    public static void main(String[] args){
        int[] prices = new int[]{3,3,5,0,0,3,1,4};
        System.out.println(maxProfit1(prices));
    }
}
