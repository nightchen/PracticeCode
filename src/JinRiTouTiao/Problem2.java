package JinRiTouTiao;

import java.util.Scanner;

/**
 * Created by nightchen on 2018/3/26.
 */
public class Problem2 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] mins = new int[]{1000};
        find(1,1,n,0,mins);
        System.out.println(mins[0]);
    }
    public static void find(int m,int s,int target,int deep,int[] mins){
        if (deep > 10000||deep > mins[0]||s>target||deep >target){
            return;
        }
        if (s == target){
            mins[0] = Math.min(mins[0],deep);
            return;
        }
        find(s,2*s,target,deep+1,mins);
        find(m,s+m,target,deep+1,mins);
    }
}
