package JianzhiOffer;

import java.util.Scanner;

/**
 * Created by nightchen on 2018/4/26.
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class problem15 {
    //直接调用java的bitCount，方便快捷
    public static int NumberOf1one(int n) {
        return Integer.bitCount(n);

    }
    //转化为二进制字符串
    public static int NumberOf1two(int n) {
        String str = Integer.toBinaryString(n);
        int len = 0;
        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) == '1'){
                len++;
            }
        }
        return len;
    }
    //位运算
    public static int NumberOf1three(int n) {
        int count = 0;
        while (n > 0){
            count++;
            n = (n-1)&n;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(NumberOf1one(n));
            System.out.println(NumberOf1two(n));
            System.out.println(NumberOf1three(n));
        }
    }
}
