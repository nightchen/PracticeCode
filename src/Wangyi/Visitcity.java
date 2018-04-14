package Wangyi;

import java.util.Scanner;

/**
 * Created by nightchen on 2018/4/1.
 */
public class Visitcity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] parent = new int[n-1];
        for(int i =0;i < n-1;i++){
            parent[i] = sc.nextInt();
        }
    }
}
