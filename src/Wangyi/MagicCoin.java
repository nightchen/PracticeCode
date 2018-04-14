package Wangyi;

import java.util.Scanner;

/**
 * Created by nightchen on 2018/3/29.
 */
public class MagicCoin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        StringBuilder sb = new StringBuilder();
        while (n > 0){
            if (n%2 == 1){
                sb.append("1");
                n = (n-1)/2;
            }else {
                sb.append("2");
                n = (n-2)/2;
            }
        }
        System.out.println(sb.reverse());
    }
}
