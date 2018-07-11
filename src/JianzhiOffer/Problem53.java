package JianzhiOffer;

/**
 * Created by nightchen on 2018/7/10.
 * 数字在排序的数组中出现的次数
 * 统计一个数字在排序的数组中出现的次数，例如，输入排序数组{1,2,3,3,3,3,4,5}和数字3，输出4
 */
public class Problem53 {
    //顺序查找时间复杂度为O(n)
    //先二分查找，在顺序查找时间复杂度也是O(n)

    //使用二分查找找到第一个数字n的下标和最后一个数字n的下标
    public static int countOfn(int[] array,int n){
        if(array.length == 0){
            return 0;
        }
        int start = getFirst(array,n,0,array.length-1);
        int end = getLast(array,n,0,array.length-1);
        return end - start + 1;
    }

    public static int getFirst(int[] array,int n,int start,int end){
        int mid = start + ((end-start)>>1);
        if(array[mid] == n){
            if((mid > 0 && array[mid-1] < n) || mid == 0){
                return mid;
            }else {
                end = mid-1;
            }
        }else if(array[mid] < n){
            start = mid+1;
        }else {
            end = mid-1;
        }
        return getFirst(array,n,start,end);
    }
    public static int getLast(int[] array,int n,int start,int end){
        int mid = start + ((end-start)>>1);
        if(array[mid] == n){
            if(mid == array.length-1 || (mid < array.length-1 && array[mid+1] > n)){
                return mid;
            }else {
                start = mid+1;
            }
        }else if(array[mid] < n){
            start = mid+1;
        }else {
            end = mid-1;
        }
        return getLast(array,n,start,end);
    }

    public static void main(String[] args){
        int[] array = new int[]{1,2,3,3,3,3,3,3};
        System.out.println(countOfn(array,3));
    }
}
