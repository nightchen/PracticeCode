package JianzhiOffer;

import java.util.Arrays;

/**
 * Created by nightchen on 2018/6/19.
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class Problem33 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0){
            return false;
        }
        int root = sequence[sequence.length-1];
        int i = 0;
        for(;i < sequence.length-1;i++){
            if(sequence[i] > root){
                break;
            }
        }
        int j = i;
        for(;j< sequence.length-1;j++){
            if(sequence[j] < root){
                return false;
            }
        }
        boolean left = true;
        if(i > 0){
            left = VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,i));
        }
        boolean right = true;
        if(i < sequence.length-1){
            right = VerifySquenceOfBST(Arrays.copyOfRange(sequence,i,sequence.length-1));
        }
        return left&&right;
    }
}
