package JianzhiOffer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by nightchen on 2018/6/27.
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
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
