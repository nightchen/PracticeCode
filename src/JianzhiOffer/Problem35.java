package JianzhiOffer;

import java.util.HashMap;

/**
 * Created by nightchen on 2018/4/22.
 * 复杂链表的复制
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，
 * 一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，
 * 否则判题程序会直接返回空）
 */
public class Problem35 {
    public static class RandomListNode{
        public int label;
        public RandomListNode next = null;
        public RandomListNode random = null;
        public RandomListNode(int label) {
            this.label = label;
        }
    }
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null){
            return null;
        }
        HashMap<RandomListNode,RandomListNode> map = new HashMap<>();
        RandomListNode p = pHead;
        while(p != null){
            map.put(p,new RandomListNode(p.label));
            p = p.next;
        }

        p = pHead;
        while(p != null){
            map.get(p).next = map.get(p.next);
            map.get(p).random = map.get(p.random);
            p = p.next;
        }
        return map.get(pHead);
    }
}

