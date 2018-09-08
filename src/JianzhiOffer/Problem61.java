package JianzhiOffer;

import java.util.Arrays;

/**
 * Created by nightchen on 2018/7/14.
 * 扑克牌顺子
 */
public class Problem61 {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length < 5){
            return false;
        }
        Arrays.sort(numbers);
        int zero = 0;
        int gap = 0;
        for(int i = 0;i < numbers.length;i++){
            if(numbers[i] == 0){
                zero++;
            }
        }
        //除了0之外还有重复的，不是顺子
        for(int i = zero;i < numbers.length-1;i++){
            if(numbers[i+1] == numbers[i]){
                return false;
            }
        }

        //如果排序之后最后一个数字减去最小的一个数字小于4，可以是顺子，否则，0也不能替换掉缺少的数字，返回否。
        return numbers[numbers.length-1] - numbers[zero] < 5?true:false;

    }
}
