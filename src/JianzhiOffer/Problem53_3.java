package JianzhiOffer;

/**
 * Created by nightchen on 2018/7/10.
 * 数组中数值和下标相等的元素
 */
public class Problem53_3 {
    public static int getNumberAsIndex(int[] array){
        if(array.length == 0){
            return -1;
        }
        int start = 0;
        int end = array.length-1;
        while (start <= end){
            int mid = (start+end)>>1;
            if(array[mid] == mid){
                return mid;
            }else if(array[mid] > mid){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] array = new int[]{-3,-1,1,3,5};
        System.out.println(getNumberAsIndex(array));
    }
}
