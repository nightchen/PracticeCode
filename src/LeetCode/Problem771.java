package LeetCode;

/**
 * Created by nightchen on 2018/6/2.
 */
public class Problem771 {
    public static int rotatedDigits(int N) {
        if(N <= 1){
            return 0;
        }
        int count = 0;
        for(int i = 2;i <=N;i++){
            if(isGoodNum(i)){
                System.out.println(i);
                count++;
            }
        }
        return count;
    }

    public static boolean isGoodNum(int n){
        String s = n+"";
        if(s.contains("3")||s.contains("4")||s.contains("7")){
            return false;
        }
        char[] chars = s.toCharArray();
        for (int i = 0;i < chars.length;i++) {
            if(chars[i] == '5'){
                chars[i] = '2';
            }else if(chars[i] == '2'){
                chars[i] = '5';
            }else if(chars[i] == '6'){
                chars[i] = '9';
            }else if(chars[i] == '9'){
                chars[i] = '6';
            }
        }
        return !s.equals(new String(chars));

    }
    public static void main(String[] args){
        System.out.println(rotatedDigits(10));
    }
}
