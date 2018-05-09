package LeetCode;

/**
 * Created by nightchen on 2018/5/3.
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class Problem27 {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }
        int index = nums.length - 1;
        while (nums[index] == val){
            index--;
        }
        if(index == 0){
            return 0;
        }
        int j = index-1;
        while (j >= 0){
            if(nums[j] == val){
                int temp = nums[index];
                nums[index] = nums[j];
                nums[j] = temp;
                index--;
                j--;
            }else {
                j--;
            }
        }
        return index+1;
    }
}
