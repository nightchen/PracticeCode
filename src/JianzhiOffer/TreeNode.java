package JianzhiOffer;

/**
 * Created by nightchen on 2018/4/21.
 * 二叉树节点
 */
public class TreeNode {
    public int val;
    TreeNode left;
    TreeNode right;
    TreeNode (int x){
        val = x;
    }

    @Override
    public String toString() {
        return this.val+"";
    }
}
