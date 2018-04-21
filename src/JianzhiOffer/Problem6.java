package JianzhiOffer;

import java.util.ArrayList;

/**
 * Created by nightchen on 2018/4/21.
 * 从尾到头打印链表
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */
public class Problem6 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> alist = new ArrayList<>();
        while(listNode != null){
            alist.add(0,listNode.val);
            listNode = listNode.next;
        }
        return alist;
    }
    //另外还有使用栈的方法和递归法

//    java 递归超简洁版本
//    public class Solution {
//    ArrayList<Integer> arrayList=new ArrayList<Integer>();
//    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        if(listNode!=null){
//            this.printListFromTailToHead(listNode.next);
//            arrayList.add(listNode.val);
//        }
//        return arrayList;
//    }
//    }  
}
