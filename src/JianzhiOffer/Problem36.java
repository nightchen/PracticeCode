package JianzhiOffer;

/**
 * Created by nightchen on 2018/6/20.
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Problem36 {
    TreeNode head = null;
    TreeNode realhead = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        convert(pRootOfTree);
        return realhead;
    }

    public void convert(TreeNode pRoot){
        if(pRoot == null){
            return;
        }
        convert(pRoot.left);
        if(head == null){
            head = pRoot;
            realhead = pRoot;
        }else {
            head.right = pRoot;
            pRoot.left = head;
            head = pRoot;
        }
        convert(pRoot.right);
    }
}
