package JianzhiOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nightchen on 2018/5/28.
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 */
public class Problem48 {
    public static int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        Map<Character,Integer> map = new HashMap<>();
        int max = 0;
        int leftindex = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            leftindex = Math.max(leftindex,map.containsKey(c)?map.get(c)+1:0);
            max = Math.max(max,i-leftindex+1);
            map.put(c,i);
        }
        return max;
    }

    public static int lengthOfLongestSubstring2(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        Map<Character,Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                if(map.get(c)+1 > left){
                    left = map.get(c)+1;
                }
            }
            max = Math.max(max,i-left+1);
            map.put(c,i);
        }
        return max;
    }
    public static int lengthOfLongestSubstring3(String s){
        if(s == null || s.length() == 0){
            return 0;
        }
        int max = 0;
        int left = 0;
        int[] position = new int[26];
        for(int i = 0;i < position.length;i++){
            position[i] = -1;
        }
        for(int i = 0;i < s.length();i++){
            char c = s.charAt(i);
            if(position[c-'a'] >= 0){
                left = Math.max(left,position[c-'a']+1);
            }
            max = Math.max(max,i - left +1);
            position[c-'a'] = i;
        }
        return max;
    }


    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring3("abcabcbb"));
    }
}
