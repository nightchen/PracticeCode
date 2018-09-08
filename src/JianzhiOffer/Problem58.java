package JianzhiOffer;

import java.util.Scanner;

/**
 * Created by nightchen on 2018/7/13.
 * 例如，“student. a am I”。正确的句子应该是“I am a student.”。
 */
public class Problem58 {
    public static String ReverseSentence(String str) {
        if(str == null || str.length() == 0){
            return null;
        }
        if(str.trim().equals("")){
            return str;
        }
        String[] strs = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = strs.length-1;i >=0;i--){
            sb.append(strs[i]);
            if(i != 0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            System.out.println(ReverseSentence(sc.nextLine()));
        }
    }
}
