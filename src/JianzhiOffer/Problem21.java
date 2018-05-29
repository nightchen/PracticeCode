package JianzhiOffer;

/**
 * Created by nightchen on 2018/5/21.
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于位于数组的后半部分，
 */
public class Problem21 {
    public void reOrderArray(int [] array) {
        if (array == null  || array.length == 0){
            return;
        }
        int i = 0;
        int j = array.length-1;
        while (i < j){
            while (i < j && !isEven(array[i])){
                i++;
            }
            while (i < j && isEven(array[j])){
                j--;
            }
            if(i < j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }
    public boolean isEven(int number){
        return number%2 == 0;
    }
}
