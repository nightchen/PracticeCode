package LeetCode;

/**
 * Created by nightchen on 2018/5/4.
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 */
public class Problem29 {
    public int divide(int dividend, int divisor) {
        if(dividend == 0){
            return 0;
        }else if(dividend==-2147483648&&divisor==-2147483648){
            return 1;
        }
        boolean flag = true;
        if(dividend > 0 && divisor < 0 || dividend < 0 && divisor >0){
            flag = false;
        }
        long result = 0;
        long d1 = Math.abs((long)dividend);
        long d2 = Math.abs((long)divisor);

        while (d1 >= d2){
            long temp = d2;
            long cnt = 1;
            while (d1 >= temp){
                d1 = d1 - temp;
                result = result + cnt;
                cnt = cnt<<1;
                temp = temp<<1;
            }
        }
        result = flag == false?result*-1:result;
        if(result < -2147483648L || result >2147483647L){
            return 2147483647;
        }else {
            return (int)result;
        }
    }
}
