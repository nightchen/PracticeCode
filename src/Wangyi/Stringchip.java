package Wangyi;

import java.util.Scanner;

/**
 * Created by nightchen on 2018/4/1.
 */
public class Stringchip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 1;
        for(int i = 0;i <str.length()-1;i++){
            if (str.charAt(i)!= str.charAt(i+1)){
                count++;
            }
        }
        double avglen = (double)str.length()/count;
        System.out.format("%-4.2f\n",avglen);
    }
}
