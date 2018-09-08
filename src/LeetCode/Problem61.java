package LeetCode;

import JianzhiOffer.ListNode;

/**
 * Created by nightchen on 2018/8/21.
 */
public class Problem61 {
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
        int len = length(head);

        int dis = len - k%len;;
        System.out.println(dis);
        if(dis == 0){
            return head;
        }else{
            ListNode p = head;
            ListNode pre = null;
            while(dis > 0){
                pre = p;
                p = p.next;
                dis--;
            }
            System.out.println(pre.val);
            pre.next = null;
            ListNode phead = p;
            while(p.next != null){
                p = p.next;
            }
            p.next = head;
            return phead;
        }
    }

    public static int length(ListNode head){
        int l = 0;
        while(head != null){
            l++;
            head = head.next;
        }
        return l;
    }
    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;l2.next = l3;l3.next = l4;
        l4.next = l5;
        System.out.println(length(l1));
        ListNode ll = rotateRight(l1,2);
        while (ll != null){
            System.out.print(ll.val);
            ll = ll.next;
        }
    }
}
