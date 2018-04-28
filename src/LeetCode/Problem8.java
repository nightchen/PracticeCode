package LeetCode;

/**
 * Created by nightchen on 2018/4/23.
 * 字符串转整数 (atoi)
 */
public class Problem8 {
    public int myAtoi(String str) {
        if(str == null || str.length() == 0 || str.trim().length() == 0){
            return 0;
        }
        String s = str.trim();
        char[] strc = s.toCharArray();
        int flag = 1;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if(strc[i] == '-'){
            flag = -1;
            i++;
        }else if(strc[i] == '+'){
            flag = 1;
            i++;
        }
        while(i < strc.length){
            if(strc[i] == '0'){
                i++;
            }else{
                break;
            }
        }
        while(i < strc.length){
            if(strc[i] >= '0' && strc[i] <= '9'){
                sb.append(strc[i]);
                i++;
            }else {
                break;
            }
        }
        if (sb.length() == 0){
            return 0;
        }else if(sb.toString().length() > 10 && flag == -1){
            return -2147483648;
        }else if(sb.toString().length() > 10 && flag == 1){
            return 2147483647;
        }else if(Long.parseLong(sb.toString())*flag <-2147483648L){
            return -2147483648;
        }else if(Long.parseLong(sb.toString())*flag >2147483647){
            return 2147483647;
        }else {
            return (int)Long.parseLong(sb.toString())*flag;
        }
    }
}
