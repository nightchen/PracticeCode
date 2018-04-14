package Wangyi;
import java.util.Scanner;
/**
 * Created by nightchen on 2018/3/29.
 */
public class Resvernumber {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = 0;
            int temp = n;
            while(temp > 0){
                m = m*10 + temp%10;
                temp = temp/10;
            }
            System.out.println(n+"**"+m);
        }

}
