package JianzhiOffer;

/**
 * Created by nightchen on 2018/7/4.
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,
 * 并返回它的位置, 如果没有则返回 -1.
 */
public class Problem50 {
    public int FirstNotRepeatingChar(String str) {
        if(str.length() == 0){
            return -1;
        }
        int[] chars = new int[256];
        for(int i = 0;i < str.length();i++){
            char c = str.charAt(i);
            chars[c]= chars[c]==-1?1:chars[c]++;
        }
        for(int i = 0;i < str.length();i++){
            if(chars[str.charAt(i)] == 1){
                return str.charAt(i);
            }
        }
        return -1;
    }
}
