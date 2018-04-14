package Wangyi;

import java.util.Scanner;

/**
 * Created by nightchen on 2018/4/13.
 * [编程题]牛牛的背包问题
 */
public class Bag {
    private static int count = 0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] num = new int[n];
        long sums = 0;
        for(int i = 0;i < n;i++){
            num[i] = sc.nextInt();
            sums = sums + num[i];
        }
        if (sums <= w){
            System.out.println((int)Math.pow(2,n));
        }else {
            dfs(0,0,n,num,w);
            System.out.println(count+1);
        }
    }
    public static void dfs(long sums,int cur,int len,int[] num,int w){
        if (cur < len){
            if (sums > w){
                return;
            }
            dfs(sums,cur+1,len,num,w);
            if (sums+num[cur] <= w){
                count++;
                dfs(sums+num[cur], cur+1, len, num, w);
            }
        }
    }
}
