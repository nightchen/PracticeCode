package Wangyi;

import java.util.Scanner;

/**
 * Created by nightchen on 2018/4/12.
 * 牛牛去犇犇老师家补课，出门的时候面向北方，但是现在他迷路了。
 * 虽然他手里有一张地图，但是他需要知道自己面向哪个方向，请你帮帮他。
 */
public class LostWay {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] direct = {"N","E","S","W"};
        int left = 0;
        int right = 0;
        for(int i = 0;i < n;i++){
            if (s.charAt(i) == 'L'){
                left++;
            }else {
                right++;
            }
        }
        if (right >= left){
            int count = right - left;
            System.out.println(direct[count%4]);
        }else {
            int count = left - right;
            System.out.println(direct[4-count%4]);
        }

    }
}
