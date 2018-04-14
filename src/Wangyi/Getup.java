package Wangyi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nightchen on 2018/4/12.
 */
public class Getup {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] time = new int[n][3];
        for(int i = 0;i < n;i++){
            time[i][0] = sc.nextInt();
            time[i][1] = sc.nextInt();
            time[i][2] = time[i][0]*60 + time[i][1];
        }
        Arrays.sort(time,(o1, o2) -> o1[2]-o2[2]);
        int cost = sc.nextInt();
        int starthour = sc.nextInt();
        int startmin = sc.nextInt();
        int starttime = starthour*60+startmin-cost;
        int index = 0;
        int i = 1;
        while (time[i][2] <= starttime){
            index = time[i][2] > time[index][2]?i:index;
            i++;
        }
        System.out.println(time[index][0]+" "+time[index][1]);

    }
}
