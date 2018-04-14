package Wangyi;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by nightchen on 2018/4/12.
 */
public class FindJob {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] di = new int[n][2];
        for (int i = 0;i < n;i++){
            di[i][0] = sc.nextInt();
            di[i][1] = sc.nextInt();
        }
        Arrays.sort(di,((o1, o2) -> o1[0]-o2[0]));
        for (int i = 1;i <n;i++){
            di[i][1] = Math.max(di[i][1],di[i-1][1]);
        }
        int[] people = new int[m];
        for (int i = 0;i < m;i++){
            people[i] = sc.nextInt();
        }
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (int i = 0;i < n;i++){
            map.put(di[i][0],di[i][1]);
        }
        for (int i = 0;i < m;i++){
            Integer index = map.floorKey(people[i]);
            if (index != null){
                System.out.println(map.get(index));
            }else {
                System.out.println("0");
            }
        }
    }

}
