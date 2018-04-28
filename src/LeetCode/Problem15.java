package LeetCode;

import java.util.*;

/**
 * Created by nightchen on 2018/4/27.
 * 三数之和
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
 * 使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。
 */
public class Problem15 {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null){
            return null;
        }
        if(nums.length < 3){
            return new ArrayList<>();
        }
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0;i < nums.length-2;i++){
            int j = i+1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    set.add(list);
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (k > j && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                } else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
