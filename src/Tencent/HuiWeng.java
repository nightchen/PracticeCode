package Tencent;

import java.util.Scanner;

/**
 * Created by nightchen on 2018/4/14.
 * [编程题] 构造回文
 */
public class HuiWeng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            System.out.println(solution(str));
        }
    }

    public static int solution(String str){
        String reStr = new StringBuffer(str).reverse().toString();
        int len = str.length();
        int[][] arr = new int[len+1][len+1];
        for(int i = 0;i<len+1;i++){

            arr[0][i] = arr[i][0] = 0;

        }
        for(int i = 1;i<len+1;i++){
            for(int j = 1;j<len+1;j++){
                if(str.charAt(i-1)==reStr.charAt(j-1))
                    arr[i][j] = arr[i-1][j-1]+1;
                else
                    arr[i][j] = Math.max(arr[i][j-1],arr[i-1][j]);
            }
        }
        return len-arr[len][len];
    }

}
