package JianzhiOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by nightchen on 2018/6/19.
 * 输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 */
public class Problem34 {
    public  static ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if(root == null || root.val > target){
            return lists;
        }
        Stack<Integer> s = new Stack<Integer>();
        path(root,target,s);
        return lists;
    }
    public static void path(TreeNode root, int target,Stack<Integer> stack){
        if(root == null){
            return ;
        }
        if (root.left == null && root.right == null){
            if(root.val == target){
                ArrayList<Integer> list = new ArrayList<>();
                for(int i:stack){
                    list.add(i);
                }
                list.add(root.val);
                lists.add(list);
            }
        }else {
            stack.push(root.val);
            path(root.left,target-root.val,stack);
            path(root.right,target-root.val,stack);
            stack.pop();
        }
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(10);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(12);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(7);
        root.left = node1;
        root.right = node2;
        node1.left=node3;
        node1.right = node4;
        System.out.println(FindPath(root,22));

    }
}
