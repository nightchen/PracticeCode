package JianzhiOffer;

/**
 * Created by nightchen on 2018/5/18.
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
 * 重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class Problem18_2 {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode preHead = new ListNode(0);
        preHead.next = pHead;
        ListNode preNode = preHead;
        ListNode curNode = pHead;
        while(curNode != null && curNode.next != null){
            ListNode nextNode = curNode.next;
            if(nextNode.val == curNode.val){
                while(nextNode != null && nextNode.val == curNode.val){
                    nextNode = nextNode.next;
                }
                preNode.next = nextNode;
                curNode = nextNode;
            }else{
                preNode = preNode.next;
                curNode = curNode.next;
            }
        }
        return preHead.next;
    }
}
