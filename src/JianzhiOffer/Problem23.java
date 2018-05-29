package JianzhiOffer;

/**
 * Created by nightchen on 2018/5/28.
 * 链表中环的入口结点
 * 一个链表中包含环，请找出该链表的环的入口结点。
 */
public class Problem23 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead.next == null || pHead == null){
            return null;
        }
        ListNode loop = isLoop(pHead);
        if(loop == null){
            return null;
        }
        int looplength = LoopCount(loop);
        ListNode pre = pHead;
        ListNode las = pHead;
        for(int i = 0;i < looplength;i++){
            pre = pre.next;
        }
        while (pre != las){
            pre = pre.next;
            las = las.next;
        }
        return pre;
    }

    public ListNode isLoop(ListNode pHead){
        ListNode pslow = pHead.next;
        if(pslow == null){
            return null;
        }
        ListNode pfast = pHead.next.next;
        while (pslow != null && pfast != null){
            if(pslow == pfast){
                return pslow;
            }
            pslow = pslow.next;
            pfast = pfast.next;
            if(pfast != null){
                pfast = pfast.next;
            }
        }
        return null;
    }

    public int LoopCount(ListNode p){
        ListNode cur = p;
        int count = 0;
        while (cur != p){
            cur = cur.next;
            count++;
        }
        return count;
    }
}
