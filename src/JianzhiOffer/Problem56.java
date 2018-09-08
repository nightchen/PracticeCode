package JianzhiOffer;

/**
 * Created by nightchen on 2018/7/12.
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */
public class Problem56 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array == null || array.length <= 1){
            num1[0] = num2[0] = 0;
            return;
        }
        int sum = 0;
        for(int i = 0;i < array.length;i++){
            sum ^= array[i];
        }
        int index = 0;
        for(;index < 32;index++){
            if((sum&(1 << index)) != 0){
                break;
            }
        }
        int number = (1 << index);
        for(int i = 0;i < array.length;i++){
            if((array[i] & number) != 0){
                num1[0] ^= array[i];
            }else {
                num2[0] ^= array[i];
            }
        }
    }
}
