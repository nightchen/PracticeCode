package LeetCode;

import JianzhiOffer.ListNode;

/**
 * Created by nightchen on 2018/5/2.
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 */
public class Problem19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }else {
            int i = n;
            ListNode frist = head;
            while (i > 0){
                frist = frist.next;
                i--;
            }
            ListNode last = head;
            while (frist.next != null){
                frist = frist.next;
                last = last.next;
            }
            last.next = last.next.next;
            return head;
        }
    }
}
