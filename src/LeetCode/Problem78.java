package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nightchen on 2018/6/1.
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 */
public class Problem78 {

    //递归
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(nums.length == 0){
            return lists;
        }
        subset(nums,0,lists,list);
        return lists;
    }
    //递归
    public void subset(int[] nums,int index,List<List<Integer>> lists,List<Integer> list){
        if(index == nums.length){
            lists.add(list);
            return;
        }
        list.add(nums[index]);
        subset(nums,index+1,lists,new ArrayList<>(list));
        list.remove(list.size()-1);
        subset(nums,index+1,lists,new ArrayList<>(list));
    }
    //位运算
    public List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();

        if(nums.length == 0){
            return new ArrayList<>();
        }
        int n = (int)Math.pow(2,nums.length);

        for(int i = 0;i < n;i++){
            List<Integer> list = new ArrayList<>();
            for(int j = 0;j < nums.length;j++){
                if(((i >> j) & 1) == 1){
                    list.add(nums[j]);
                }
            }
            lists.add(list);
        }
        return lists;
    }

    public static void main(String[] args){
        int[] nums = new int[]{1,2,2};
        System.out.println(new Problem78().subsets2(nums));
    }
}
