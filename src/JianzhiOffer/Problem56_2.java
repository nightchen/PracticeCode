package JianzhiOffer;

import java.util.Arrays;

/**
 * Created by nightchen on 2018/7/12.
 * 数组中只出现一次的数字
 * 在一个数组中出了一个数字只出现一次之外，其他数字都出现了三次，找到那个只出现一次的数字
 */
public class Problem56_2 {
    public static int FindNumsAppearOnce(int [] array) {
        if(array == null || array.length <= 1){
            return 0;
        }
        int[] bitsum = new int[32];
        for(int i = 0;i < array.length;i++){
            int bitmask = 1;
            for(int j = 31;j >= 0;j--){
                int bit = array[i] & bitmask;
                if(bit != 0){
                    bitsum[j] = bitsum[j]+1;
                }
                bitmask = bitmask << 1;
            }
        }
        System.out.println(Arrays.toString(bitsum));
        int result = 0;
        for(int i = 0;i < 32;i++){
            result = result << 1;
            result += bitsum[i]%3;
        }
        return result;
    }

    public static void main(String[] args){
        int[] array = new int[]{1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9,10};
        System.out.println(FindNumsAppearOnce(array));
    }
}
