package LeetCode;

/**
 * Created by nightchen on 2018/4/27.
 * 盛最多水的容器
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 画 n 条垂直线，使得垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 */
public class Problem11 {
    public int maxArea(int[] height) {
        int maxwater = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int high = Math.min(height[i], height[j]);
            int water = (j - i) * high;
            maxwater = Math.max(maxwater, water);
            if(height[i] <= height[j]){
                i++;
            }else {
                j++;
            }
        }
        return maxwater;
    }
}
