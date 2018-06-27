package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by nightchen on 2018/5/29.
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 */
public class Problem17 {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if(!isDigit(digits)){
            return res;
        }
        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");map.put('3',"def");
        map.put('4',"ghi");map.put('5',"jkl");
        map.put('6',"mn0");map.put('7',"pqrs");
        map.put('8',"tuv");map.put('9',"wxyz");

        char[] ch = new char[digits.length()];
        addString(digits,0,ch,res,map);
        return res;
    }

    public boolean isDigit(String digits){
        if(digits == null || digits.length() == 0){
            return false;
        }
        for(int i = 0;i < digits.length();i++){
            if(digits.charAt(i) <= '1' || digits.charAt(i) > '9'){
                return false;
            }
        }
        return true;
    }

    public void addString(String digits,int index,char[] ch,List<String> res,Map<Character,String> map){
        if(index == digits.length()){
            res.add(new String(ch));
            return;
        }
        char c = digits.charAt(index);
        for(int i = 0; i < map.get(c).length();i++){
            ch[index] = map.get(c).charAt(i);
            addString(digits,index+1,ch,res,map);
        }
    }

    public static void main(String args[]){
        String s = "2568";
        System.out.println(new Problem17().letterCombinations(s));
    }
}
