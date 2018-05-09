package LeetCode;

/**
 * Created by nightchen on 2018/5/3.
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 */
public class Problem26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }else {
            int index = 0;
            int j = 0;
            while (j < nums.length){
                if(nums[j] > nums[index]){
                    index++;
                    if(j == index){
                        j++;
                    }else {
                        int temp = nums[j];
                        nums[j] = nums[index];
                        nums[index] = temp;
                        j++;
                    }
                    j++;
                }
            }
            return index+1;
        }
    }
}
