package LeetCode;

import JianzhiOffer.ListNode;

/**
 * Created by nightchen on 2018/5/3.
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class Problem21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null){
            return null;
        }else if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode head = null;
        if(p1.val <= p2.val){
            head = p1;
            p1 = p1.next;
        }else {
            head = p2;
            p2 = p2.next;
        }
        ListNode p = head;
        while (p1 != null && p2 != null){
            if(p1.val <= p2.val){
                p.next = p1;
                p1 = p1.next;
                p = p.next;
            }else {
                p.next = p2;
                p2 = p2.next;
                p = p.next;
            }
        }
        while (p1 != null){
            p.next = p1;
            p = p.next;
            p1 = p1.next;
        }
        while (p2 != null){
            p.next = p2;
            p = p.next;
            p2 = p2.next;
        }
        return head;
    }
}
