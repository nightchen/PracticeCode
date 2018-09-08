package LeetCode;

import JianzhiOffer.ListNode;

/**
 * Created by nightchen on 2018/8/20.
 */
public class Problem142 {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode l = isLoop(head);
        if(l == null){
            return null;
        }

        int length = 1;
        ListNode ll = l.next;
        while (ll != l){
            ll = ll.next;
            length++;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (length > 0){
            fast = fast.next;
            length--;
        }

        while (fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

    public static ListNode isLoop(ListNode head){
        ListNode p1 = head.next;
        ListNode p2 = head.next;
        if(p2 == null){
            return null;
        }
        p2 = p2.next;
        while (p1 != null && p2 != null){
            if(p1 == p2){
                return p1;
            }
            p1 = p1.next;
            p2 = p2.next;
            if(p2.next != null){
                p2 = p2.next;
            }

        }
        return null;
    }
}
