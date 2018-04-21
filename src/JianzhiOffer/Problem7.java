package JianzhiOffer;

import java.util.Arrays;

/**
 * Created by nightchen on 2018/4/21.
 * 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */
public class Problem7 {
    //递归
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0 || in.length == 0){
            return null;
        }else {
            TreeNode treeNode = new TreeNode(pre[0]);
            for(int i = 0;i < in.length;i++){
                 if(in[i] == pre[0]){
                     treeNode.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                     treeNode.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
                 }
            }
            return treeNode;
        }
    }
}
