package LeetCode;

/**
 * Created by nightchen on 2018/5/9.
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
public class Problem9 {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int result = 0;
        int temp = x;
        while (temp > 0){
            result =result*10 + temp % 10;
            temp = temp/10;
        }
        if(result == x){
            return true;
        }else {
            return false;
        }
    }
}
