package JianzhiOffer;

/**
 * Created by nightchen on 2018/7/9.
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class Problem52 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null){
            return null;
        }
        int length1 = 0;
        int length2 = 0;
        ListNode head1 = pHead1;
        ListNode head2 = pHead2;
        while (head1 != null){
            length1++;
            head1 = head1.next;
        }
        while (head2 != null){
            length2++;
            head2 = head2.next;
        }
        head1 = pHead1;
        head2 = pHead2;
        if(length1 > length2){
            int dis = length1-length2;
            while (dis > 0){
                head1= head1.next;
                dis--;
            }
        }else if(length1 < length2){
            int dis = length2-length1;
            while (dis > 0){
                head2= head2.next;
            }
        }
        while (head1 != head2 ){
            head1 = head1.next;
            head2 = head2.next;
        }
        return head1;
    }
}
