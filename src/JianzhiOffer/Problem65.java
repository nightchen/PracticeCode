package JianzhiOffer;

/**
 * Created by nightchen on 2018/7/15.
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */
public class Problem65 {
    /*
    public static int Add(int num1,int num2) {
        return Integer.sum(num1,num2);
    }
    */
    public static int Add(int num1,int num2) {
        int sum = 0;
        int carray = 0;
        while (num2 != 0){
            sum = num1^num2;
            carray = (num1 & num2)<<1;
            num1 = sum;
            num2 = carray;
        }
        return num1;
    }

    public static void main(String[] args){
        System.out.println(Add(10,20));
    }
}
