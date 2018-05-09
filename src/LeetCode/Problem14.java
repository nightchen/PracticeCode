package LeetCode;



/**
 * Created by nightchen on 2018/5/2.
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class Problem14 {
    public static void main(String[] args){
        String[] strs = new String[]{"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null){
            return null;
        }else if(strs.length == 0){
            return "";
        }else {
             StringBuilder sb = new StringBuilder();
             int index = 0;
             while (index < strs[0].length()){
                 for(int i=0;i < strs.length-1;i++){
                     if(index >= strs[i].length() || index >= strs[i+1].length()){
                          return sb.toString();
                     }
                     if(strs[i].charAt(index) != strs[i+1].charAt(index)){
                         return sb.toString();
                     }
                 }
                 sb.append(strs[0].charAt(index));
                 index++;
             }
             return sb.toString();
        }
    }
}
