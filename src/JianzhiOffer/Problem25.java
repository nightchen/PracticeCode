package JianzhiOffer;

/**
 * Created by nightchen on 2018/5/28.
 * 合并两个排序的链表
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Problem25 {
    //递归
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val <= list2.val){
            list1.next = Merge(list1.next, list2);
            return list1;
        }else{
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }

    //遍历
    public ListNode Merge2(ListNode list1,ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode pre = new ListNode(0);
        ListNode h = pre;
        while(list1 != null || list2 != null){
            if(list1 == null){
                pre.next = list2;
                list2 = list2.next;
                pre = pre.next;
            }else if(list2 == null){
                pre.next = list1;
                list1 = list1.next;
                pre = pre.next;
            }else if(list1.val <= list2.val){
                pre.next = list1;
                list1 = list1.next;
                pre = pre.next;
            }else {
                pre.next = list2;
                list2 = list2.next;
                pre = pre.next;
            }
        }
        return h.next;
    }
}
