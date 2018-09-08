package JianzhiOffer;

/**
 * Created by nightchen on 2018/7/11.
 * 二叉搜索树的第k个结点
 * 给定一颗二叉搜索树，请找出其中的第k小的结点。
 * 例如， 5 3 7 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4。
 */
public class Problem54 {
    public static int kth = 0;
    public static TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot != null){
            System.out.println("当前节点："+pRoot.val);
            TreeNode knode = KthNode(pRoot.left,k);
            System.out.println("返回节点："+knode);
            if(knode != null){
                return knode;
            }
            kth++;
            System.out.println(kth);
            if(kth == k){
                return pRoot;
            }
            knode = KthNode(pRoot.right,k);
            if(knode != null){
                return knode;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        TreeNode n5 = new TreeNode(5);
        TreeNode n3 = new TreeNode(3);
        TreeNode n7 = new TreeNode(7);
        TreeNode n2 = new TreeNode(2);
        TreeNode n4 = new TreeNode(4);
        TreeNode n6 = new TreeNode(6);
        TreeNode n8 = new TreeNode(8);
        TreeNode n1 = new TreeNode(1);
        n5.left = n3;
        n5.right = n7;
        n3.left = n2;
        n3.right = n4;
        n7.left = n6;
        n7.right = n8;
        n2.left = n1;
        System.out.println(KthNode(n5, 3).val);
    }

}
