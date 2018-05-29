package JianzhiOffer;

/**
 * Created by nightchen on 2018/5/28.
 * 链表中倒数第k个结点
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Problem22 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(k <= 0 || head == null){
            return null;
        }
        ListNode cur = head;
        while (k > 0){
            cur = cur.next;
            if(cur == null){
                return null;
            }
            k--;
        }
        ListNode pre = head;
        while (cur != null){
            cur = cur.next;
            pre = pre.next;
        }
        return pre;
    }
}
