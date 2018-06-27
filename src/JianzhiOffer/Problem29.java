package JianzhiOffer;

import java.util.ArrayList;

/**
 * Created by nightchen on 2018/6/15.
 */
public class Problem29 {
    public static ArrayList<Integer> numbers = new ArrayList<>();
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        if(matrix.length == 0){
            return numbers;
        }
        int i = matrix.length;
        int j = matrix[0].length;
        print(matrix,0,0,i-1,j-1);
        return numbers;
    }
    public static void print(int[][] matrix,int lefti,int leftj,int righti,int rightj){
        if(lefti > righti || leftj > rightj){
            return;
        }
        if(lefti == righti){
            for(int i = leftj;i<= rightj;i++){
                numbers.add(matrix[lefti][i]);
            }
            return;
        }
        if(leftj == rightj){
            for(int i = lefti;i<= righti;i++){
                numbers.add(matrix[i][leftj]);
            }
            return;
        }
        for(int i = leftj;i<rightj;i++){
            numbers.add(matrix[lefti][i]);
        }
        for(int i = lefti;i < righti;i++){
            numbers.add(matrix[i][rightj]);
        }
        for(int i = rightj;i > leftj;i--){
            numbers.add(matrix[righti][i]);
        }
        for(int i = righti;i > lefti;i--){
            numbers.add(matrix[i][leftj]);
        }
        print(matrix,lefti+1,leftj+1,righti-1,rightj-1);
    }
    public static void main(String[] args){
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        System.out.println(printMatrix(matrix));
    }
}
