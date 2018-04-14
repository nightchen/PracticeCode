package JinRiTouTiao;

import java.util.Scanner;

/**
 * Created by nightchen on 2018/3/27.
 */
public class Problem3 {
    public static void main(String[] args){
        String[][] number = new String[][]{
                {"66666", "....6", "66666", "66666", "6...6", "66666", "66666", "66666", "66666", "66666"},
                {"6...6", "....6", "....6", "....6", "6...6", "6....", "6....", "....6", "6...6", "6...6"},
                {"6...6", "....6", "66666", "66666", "66666", "66666", "66666", "....6", "66666", "66666"},
                {"6...6", "....6", "6....", "....6", "....6", "....6", "6...6", "....6", "6...6", "....6"},
                {"66666", "....6", "66666", "66666", "....6", "66666", "66666", "....6", "66666", "66666"}
        };
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0;i < n;i++){
            String str = sc.nextLine();
            long total = caculate(str);
            printString(number,total);
        }


    }
    public static void printString(String[][] strs,long num){
        String str = num+"";
        char[] s = str.toCharArray();
        for (int i = 0;i < 5;i++){
            for (int j = 0;j < s.length;j++){
                System.out.print(strs[i][Integer.parseInt(String.valueOf(s[j]))]);
                System.out.print(j<s.length-1?"..":"\n");
            }
        }

    }

    public static long caculate(String str){
        long cur = 0l;
        long sum = 0l;
        long symbol = 1;
        for (int i = 0;i < str.length();i++){
            char c = str.charAt(i);
            if (Character.isDigit(c)){
                cur = cur*10 + c - '0';
            }else if (c == '+'){
                sum = sum + symbol*cur;
                cur = 0;
                symbol = 1;
            }else if(c == '-'){
                sum = sum + symbol*cur;
                cur = 0;
                symbol = -1;
            }else {
                symbol = symbol*cur;
                cur = 0;
            }
        }
        return sum+cur*symbol;
    }
}
