package LeetCode;

import JianzhiOffer.ListNode;

/**
 * Created by nightchen on 2018/5/3.
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 */
public class Problem24 {
    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }else if (head.next == null){
            return head;
        }else {
            ListNode pre = null;
            ListNode p1 = head;
            ListNode p2 = head.next;
            ListNode last = p2.next;
            ListNode phead = p2;
            while (p1 != null && p2 != null){
                pre.next = p2;
                p2.next = p1;
                p1.next = last;
                if(last != null && last.next != null){
                    pre = p1;
                    p1 = last;
                    p2 = p1.next;
                    last = p2.next;
                }else {
                    break;
                }
            }
            return phead;
        }
    }
}
