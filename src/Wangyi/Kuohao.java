package Wangyi;

import java.util.Arrays;

/**
 * Created by nightchen on 2018/4/7.
 * [编程题]最长公共子括号序列
 *  网易2018校园招聘
 */
public class Kuohao {
    public static void main(String[] args){
        int[] a = {1,2,6,8,7,9,3,4,6};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a,5));

    }
}
