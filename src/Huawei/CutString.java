package Huawei;

import java.util.Scanner;

/**
 * Created by nightchen on 2018/4/19.
 * 在GBK编码下，请编写一个截取字符串的函数， 输入为一个字符串和字节数，
 * 输出为按字节截取的字符串。 但是要保证汉字不被截半个，同时忽略字符串中的数字后输出最终结果。

 */
public class CutString {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < str.length();i++){
            //去掉数字
            if(str.charAt(i)<=48 || str.charAt(i)>=57){
                 sb.append(str.charAt(i));
            }
        }
        System.out.println(cutString(sb.toString(),len));
    }
    public static String cutString(String str,int len)throws Exception{
        if(str.length() == 0 || len < 1){
            return "";
        }
        byte[] bt = str.getBytes("GBK");
        int count = 0;
        if(len < bt.length){
            for (int i = 0;i < len;i++){
                if(bt[i] < 0){
                    count++;
                }
            }
            String res = count%2==0?new String(bt,0,len,"GBK"):new String(bt,0,len-1,"GBK");
            return res;
        }else {
            return str;
        }

    }
}
