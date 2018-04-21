package JianzhiOffer;

/**
 * Created by nightchen on 2018/4/21.
 * 二叉树的下一个结点
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class Problem8 {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if(pNode == null){
            return null;
        }
        if(pNode.right != null){
            TreeLinkNode treeLinkNode = pNode.right;
            while (treeLinkNode.left != null){
                treeLinkNode = treeLinkNode.left;
            }
            return treeLinkNode;
        }else if(pNode.next != null){
            TreeLinkNode parent = pNode.next;
            TreeLinkNode pnow = pNode;
            while (parent != null && pnow == parent.right){
                pnow = parent;
                parent = parent.next;
            }
            return parent;
        }
        return null;
    }
}
