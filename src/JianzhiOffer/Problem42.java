package JianzhiOffer;

/**
 * Created by nightchen on 2018/5/31.
 * 连续子数组的最大和
 * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
 * 你会不会被他忽悠住？(子向量的长度至少是1)
 */
public class Problem42 {
    //方法1
    public int maxSubArray1(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }

        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0;i < nums.length;i++){
            if(cursum <= 0){
                cursum = nums[i];
            }else{
                cursum = cursum + nums[i];
            }
            if(cursum > maxsum){
                maxsum = cursum;
            }
        }

        return maxsum;
    }

    //方法2：动态规划
    public int maxSubArray2(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for(int i = 1;i < nums.length;i++){
            if(res[i-1] <= 0){
                res[i] = nums[i];
            }else{
                res[i] = res[i-1]+nums[i];
            }
        }
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0;i < res.length;i++){
            if(res[i] > maxsum){
                maxsum = res[i];
            }
        }
        return maxsum;
    }

}
