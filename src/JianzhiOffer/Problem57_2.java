package JianzhiOffer;

import java.util.ArrayList;

/**
 * Created by nightchen on 2018/7/12.
 * 和为S的连续正数序列
 * 比如 输入15 输出应该是：1,2,3,4,5 和 4,5,6 和 7,8
 */
public class Problem57_2 {
    public static ArrayList<ArrayList<Integer>> FindNumbersOfSum(int sum) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if(sum <= 2){
            return lists;
        }
        int pre = 1;
        int last = 2;
        int count = pre+last;
        while (pre < (sum+1)/2){
            if(count == sum){
                addToLists(pre,last,lists);
            }
            while (count > sum && pre < last){
                count-=pre;
                pre++;
                if(count == sum){
                    addToLists(pre,last,lists);
                }
            }
            last++;
            count = count+last;
        }
        return lists;
    }

    public static void addToLists(int begin,int end,ArrayList<ArrayList<Integer>> lists){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i= begin;i <= end;i++ ){
            list.add(i);
        }
        lists.add(list);
    }

    public static void main(String[] args){
        System.out.println(FindNumbersOfSum(15));
    }
}
