package JianzhiOffer;

/**
 * Created by nightchen on 2018/4/20.
 * ——数组中重复的数
 * 在一个长度为n+1的数组里的所有数字都在0到n的范围内。
 */
public class Problem3_2 {
    //解法1：哈希表 时间O(1)，空间O(n)
    //解法2：排序，查找相邻的数 时间O(nlogn)
    //解法3：二分查找原理
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers == null || numbers.length < 1){
            return false;
        }
        int start = 1;
        int end = length-1;
        while (end >= start){
            int mid = start + (end - start)>>1;//==(end + start)/2
            int count = count(numbers,length,start,mid);
            if(end == start){
                if(count > 1){
                    duplication[0] = start;
                    return true;
                }else {
                    break;
                }
            }

            if(count > (mid-start+1)){
                end = mid;
            }else {
                start = mid+1;
            }
        }
        return false;
    }
    public static int count(int numbers[],int length,int start,int end){
        if(numbers == null){
            return 0;
        }
        int count = 0;
        for(int i = 0;i < length;i++){
            if(numbers[i] >= start && numbers[i] <= end){
                count++;
            }
        }
        return count;
    }
}
