package LeetCode;

import JianzhiOffer.ListNode;

/**
 * Created by nightchen on 2018/9/3.
 * 反转链表
 */
public class Problem206 {
    public  static ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }else if(head.next == null){
            return head;
        }

        ListNode pre = head;
        ListNode cur = head.next;
        ListNode las = head.next.next;
        pre.next = null;
        while(las != null){
            cur.next = pre;
            pre = cur;
            cur = las;
            las = las.next;
        }
        cur.next = pre;
        return cur;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;l2.next = l3;l3.next = l4;l4.next = l5;
        ListNode ll = reverseList(l1);
        while (ll != null){
            System.out.print(ll.val);
            ll = ll.next;
        }
    }
}
