package JianzhiOffer;

import java.util.ArrayList;

/**
 * Created by nightchen on 2018/6/27.
 * 输入一个字符串,按字典序打印出该字符串中字符的所有组合。
 * 例如输入字符串abc,则打印出由字符a,b,c所能组合出来的所有字符串a,b,c,ab,ac,bc,abc。
 */
public class Problem38_2 {
    public static ArrayList<String> lists = new ArrayList<>();
    public static ArrayList<String> Combination(String str) {
        if(str == null || str.length() == 0){
            return lists;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 1;i <= str.length();i++){
            combine(str,0,i,sb);
        }
        return lists;
    }

    public static void combine(String str,int index,int n,StringBuilder sb){
            if(n == 0){
                lists.add(sb.toString());
                return;
            }
            if(index == str.length()){
                return;
            }
            sb.append(str.charAt(index));
            combine(str,index+1,n-1,sb);
            sb.deleteCharAt(sb.length()-1);
            combine(str,index+1,n,sb);

    }

    public static void main(String[] args){
        String str = "abc";
        System.out.println(Combination(str));
    }
}
