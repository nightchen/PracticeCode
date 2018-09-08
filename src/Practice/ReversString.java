package Practice;

import java.util.Arrays;

/**
 * Created by nightchen on 2018/8/14.
 * 翻转单词顺序列
 */
public class ReversString {
    public static int[] resultArray(int[] a){
        if(a == null || a.length == 0){
            return null;
        }
        int[] b = new int[a.length];
        for(int i = a.length-1;i>=0;i--){
            b[i] = a[a.length-1-i];
        }
        if(comparearray(a,b) == 1){
            return Subtraction(a,b);
        }else if(comparearray(a,b) == -1){
            return Subtraction(b,a);
        }else {
            return new int[]{0};
        }
    }

    public static int comparearray(int[] a,int[] b){
        int len = a.length;
        for(int i = 0;i < len;i++){
            if(a[i] > b[i]){
                return 1;
            }else if(a[i] < b[i]){
                return -1;
            }
        }
        return 0;
    }

    public static int[] Subtraction(int[] a,int[] b){
        for(int i = a.length-1;i>=0;i--){
            if(a[i]<b[i] && i!=0){
                a[i] = a[i]+10-b[i];
                a[i-1]--;
            }else {
                a[i] = a[i]-b[i];
            }
        }
        //处理数组前缀0
        int index= 0;
        while (a[index]==0){
            index++;
        }
        int[] res = new int[a.length-index];
        for(int i = 0;i < res.length;i++){
            res[i] = a[index++];
        }
        return res;
    }

    public static void main(String[] args){
        int[] a = new int[]{1,2,3,5,4,3,2,1};
        System.out.println(Arrays.toString(resultArray(a)));
    }
}
