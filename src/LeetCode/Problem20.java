package LeetCode;

import java.util.Stack;

/**
 * Created by nightchen on 2018/5/3.
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 */
public class Problem20 {
    public boolean isValid(String s) {
        if(s == null || s.length() == 0){
            return false;
        }else {
            Stack<Character> stack = new Stack<>();
            for(int i = 0;i < s.length();i++){
                if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)==']'){
                    stack.push(s.charAt(i));
                }else if(s.charAt(i)==')' || s.charAt(i)==']' || s.charAt(i)=='}'){
                    if(stack.isEmpty()){
                        return false;
                    }
                    if(s.charAt(i)==')' && stack.peek() == '('){
                         stack.pop();
                    }else if(s.charAt(i)==']' && stack.peek() == '['){
                        stack.pop();
                    }else if(s.charAt(i)=='}' && stack.peek() == '{'){
                        stack.pop();
                    }
                }
            }
            return stack.isEmpty();
        }
    }
}
