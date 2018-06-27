package JianzhiOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by nightchen on 2018/6/19.
 * 请实现一个函数按照之字形打印二叉树，
 * 即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，
 * 第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class Problem32_2 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if(pRoot == null){
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        queue.offer(pRoot);
        int curlevel = 1;
        int nextlevel = 0;
        int level = 1;
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            list.add(node.val);
            curlevel--;
            if(node.left != null){
                queue.offer(node.left);
                nextlevel++;
            }
            if(node.right != null){
                queue.offer(node.right);
                nextlevel++;
            }
            if(curlevel == 0){
                curlevel = nextlevel;
                nextlevel = 0;
                if(level%2 == 1){
                    lists.add(list);
                }else {
                    ArrayList<Integer> newlist = new ArrayList<>();
                    for(int i = list.size()-1;i >=0;i--){
                        newlist.add(list.get(i));
                    }
                    lists.add(newlist);
                }
                level++;
                list = new ArrayList<Integer>();
            }
        }
        return lists;
    }
}
