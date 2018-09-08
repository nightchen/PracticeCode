package JianzhiOffer;

/**
 * Created by nightchen on 2018/7/13.
 * 左旋转字符串
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
 */
public class Problem58_2 {
    public static String LeftRotateString(String str,int n) {
        if(str == null || str.length() == 0 || n <= 0 ){
            return str;
        }
        n = n%str.length();
        StringBuilder sb = new StringBuilder();
        for(int i = n;i < str.length();i++){
            sb.append(str.charAt(i));
        }
        for(int i = 0;i < n;i++){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = "abcdefghijklmn";
        System.out.println(LeftRotateString(str,5));

    }
}
