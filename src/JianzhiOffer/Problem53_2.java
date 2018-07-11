package JianzhiOffer;

/**
 * Created by nightchen on 2018/7/10.
 * 0~n-1中缺失的数字
 */
public class Problem53_2 {
    public static int theMissNumber(int[] array){
        if(array.length ==0){return -1;}
        int start = 0;
        int end = array.length-1;
        while (start <= end){
            int mid = (start+end)>>1;
            if(array[mid] != mid){
                if(mid == 0 || array[mid-1] == mid-1){
                    return mid;
                }
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        if(start == array.length-1){
            return array.length-1;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(theMissNumber(array));
    }
}
