package JianzhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by nightchen on 2018/6/19.
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class Problem32 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        linkedList.addFirst(root);
        while (!linkedList.isEmpty()){
            TreeNode node = linkedList.pollLast();
            list.add(node.val);
            if(node.left != null){
                linkedList.addFirst(node.left);
            }
            if(node.right != null){
                linkedList.addFirst(node.right);
            }
        }
        return list;
    }
}
