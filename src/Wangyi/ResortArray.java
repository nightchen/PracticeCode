package Wangyi;
import java.util.Scanner;
/**
 * Created by nightchen on 2018/4/1.
 */
public class ResortArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for(int i =0;i < t;i++){
                int n = sc.nextInt();
                int[] arr = new int[n];
                int numfour = 0;
                int numtwo = 0;
                for(int j = 0;j < n;j++){
                    arr[j] = sc.nextInt();
                    if(arr[j]%4 == 0){
                        numfour++;
                    }else if(arr[j]%2 == 0){
                        numtwo++;
                    }
                }
                numtwo = Math.max(numtwo-1,0);
                System.out.println((numtwo+2*numfour) >= n-1?"Yes":"No");
            }

        }
}
