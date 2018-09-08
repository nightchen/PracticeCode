package JianzhiOffer;

/**
 * Created by nightchen on 2018/7/15.
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，
 * 要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
 */
public class Problem67 {
    public static int StrToInt(String str) {
        if(str == null || str.length() == 0 || str.equals("")){
            return 0;
        }

        boolean negetive = true;
        int index= 0;
        if(str.charAt(0) == '-'){
            negetive = false;
            index++;
        }else if(str.charAt(0) == '+'){
            negetive = true;
            index++;
        }

        int sum = 0;
        for(int i = index;i < str.length();i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <='9'){
                sum = sum*10 + (str.charAt(i)-'0');
            }else {
                return 0;
            }
        }
        return negetive?sum:sum*-1;
    }
    public static void main(String[] args){
        System.out.println(StrToInt("+4686"));
    }
}
