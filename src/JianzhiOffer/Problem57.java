package JianzhiOffer;

import java.util.ArrayList;

/**
 * Created by nightchen on 2018/7/12.
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，
 * 使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 * 对应每个测试案例，输出两个数，小的先输出。
 */
public class Problem57 {
    public static ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        if(array == null || array.length <= 1){
            return list;
        }
        int pre = 0;
        int last = array.length-1;
        while (pre < last){
            if(array[pre] + array[last] == sum){
                list.add(array[pre]);
                list.add(array[last]);
                return list;
            }else if(array[pre] + array[last] < sum){
                pre++;
            }else {
                last--;
            }
        }
        return list;
    }
    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28};
        System.out.println(FindNumbersWithSum(array,24));
    }
}
