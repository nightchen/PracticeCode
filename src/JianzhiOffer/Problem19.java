package JianzhiOffer;

/**
 * Created by nightchen on 2018/5/18.
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，
 * 而'*'表示它前面的字符可以出现任意次（包含0次）。 在本题中，匹配是指字符串的所有字符匹配整个模式。
 * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 */
public class Problem19 {
    public static void main(String[] args){
        char[] s = new char[]{'a','a','a'};
        char[] p = new char[]{'a','a','*','a'};
        System.out.println(match(s,p));
    }
    public static boolean match(char[] str, char[] pattern){
        String strs = String.valueOf(str);
        String patterns = String.valueOf(pattern);
        return strs.matches(patterns);
    }
}
