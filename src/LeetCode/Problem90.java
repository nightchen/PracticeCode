package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nightchen on 2018/6/1.
 * 给定一个可能包含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 */
public class Problem90 {
    private List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(new ArrayList(), nums, 0, 0);
        return res;
    }

    private void dfs(List<Integer> list, int[] nums, int curLoc, int curValue) {
        //System.out.println(list);
        if (curLoc <= nums.length) {
            res.add(new ArrayList(list));
        }
        for (int i = curValue; i < nums.length; i++)  {
            //System.out.println("i:"+i);
            //if (i == curValue || nums[i] != nums[i-1]) {
                list.add(nums[i]);
                dfs(list, nums, curLoc + 1, i + 1);
                //System.out.println("second i:"+i+":"+list);
                list.remove(list.size()-1);
            //}
        }
    }
    public static void main(String[] args){
        int[] nums = new int[]{1,2,3};
        System.out.println(new Problem90().subsetsWithDup(nums));
    }
}
