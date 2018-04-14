package Wangyi;

import java.util.Scanner;

/**
 * Created by nightchen on 2018/4/13.
 * [编程题]安置路灯
 */
public class Ludeng{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i < n;i++){
            int length = sc.nextInt();
            String str = sc.next();
            int count = 0;
            int index = 0;
            while(index < length){
                if(str.charAt(index) == 'X'){
                    index++;
                    continue;
                }
                count++;
                index+=3;
            }
            System.out.println(count);
        }
    }
}