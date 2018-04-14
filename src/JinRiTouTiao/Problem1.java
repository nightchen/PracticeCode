package JinRiTouTiao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by nightchen on 2018/3/25.
 */
public class Problem1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] sums = new int[m];
        for (int i = 0;i < m;i++){
            sums[i] = sc.nextInt();
        }
        Arrays.sort(sums);
        System.out.println(numberOfk(sums,k));
    }
    public static int numberOfk(int[] sums,int k){
        Map<Integer,Integer> keyValue = new HashMap<>();
        for (int i = 0;i < sums.length-1;i++){
            for (int j = 1;j < sums.length;j++){
                if (sums[j] - sums[i] > k){
                    break;
                }else if (sums[j] - sums[i] == k){
                    keyValue.put(sums[j],sums[i]);
                }
            }
        }
        return keyValue.size();
    }
}
