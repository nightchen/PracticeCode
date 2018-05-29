package JianzhiOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nightchen on 2018/5/28.
 */
public class Problem48 {
    public int lengthOfLongestSubstring(String s) {
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
}
