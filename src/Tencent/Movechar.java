package Tencent;

import java.util.Scanner;

/**
 * Created by nightchen on 2018/4/14.
 * [编程题] 算法基础-字符移位
 */
public class Movechar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            char[] sch = s.toCharArray();
            int k = 0;
            for(int i = 0;i < sch.length;i++){
                if(sch[i]>='a' && sch[i]<= 'z'){
                    char temp = sch[i];
                    for(int j = i;j > k;j--){
                        sch[j] = sch[j-1];
                    }
                    sch[k] = temp;
                    k++;
                }
            }

            System.out.println(String.valueOf(sch));
        }
    }
}
