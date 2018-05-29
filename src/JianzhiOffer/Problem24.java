package JianzhiOffer;

/**
 * Created by nightchen on 2018/5/28.
 * 反转链表
 * 输入一个链表，反转链表后，输出链表的所有元素。
 */
public class Problem24 {
    public ListNode ReverseList(ListNode head) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        ListNode pnode = head;
        ListNode pre = null;
        ListNode rev = null;
        while (pnode != null){
            ListNode pnext = pnode.next;
            if(pnext == null){
                rev = pnode;
            }
            pnode.next = pre;
            pre = pnode;
            pnode = pnext;
        }
        return rev;
    }
}
