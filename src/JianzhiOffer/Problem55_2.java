package JianzhiOffer;

/**
 * Created by nightchen on 2018/7/11.
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class Problem55_2 {
    boolean flag = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        TreeDepth(root);
        return flag;
    }

    public int TreeDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = TreeDepth(root.left);
        int right = TreeDepth(root.right);
        if(Math.abs(left - right) > 1){
            flag = false;
        }

        return right>left ?right+1:left+1;
    }
}
