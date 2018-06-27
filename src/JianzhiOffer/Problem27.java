package JianzhiOffer;

/**
 * Created by nightchen on 2018/6/15.
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class Problem27 {
    public void Mirror(TreeNode root) {
        if (root == null){
            return;
        }
        TreeNode l = root.left;
        root.left = root.right;
        root.right = l;
        if(root.left != null){
            Mirror(root.left);
        }
        if(root.right != null){
            Mirror(root.right);
        }
    }
}
