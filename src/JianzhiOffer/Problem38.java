package JianzhiOffer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by nightchen on 2018/6/27.
 */
public class Problem38 {
    public static ArrayList<String> lists = new ArrayList<>();
    public static ArrayList<String> Permutation(String str) {
        if(str.length() == 0){
            return lists;
        }
        permuta(str.toCharArray(),0);
        return lists;
    }
    public static void permuta(char[] chars,int begin){
        if(begin == chars.length-1){
            lists.add(Arrays.toString(chars));
        }else {
            for(int i = begin;i < chars.length;i++){
                swap(begin,i,chars);
                permuta(chars,begin+1);
                swap(begin,i,chars);
            }
        }

    }

    public static void swap(int i,int j,char[] chars){
        if(i != j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }

    }

    public static void main(String[] args){
        String str = "abc";
        System.out.println(Permutation(str));
    }
}
