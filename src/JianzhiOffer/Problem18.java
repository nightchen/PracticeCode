package JianzhiOffer;

/**
 * Created by nightchen on 2018/5/18.
 * 删除链表中的节点
 */
public class Problem18 {
    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        ListNode l7 = new ListNode(7);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;

        printListNode(deleteNode(l1,l7));

    }
    public static void printListNode(ListNode head){
        if(head == null){
            System.out.println("null");
        }else {
            while (head != null){
                System.out.print(head.val +"--->");
                head = head.next;
            }
        }
    }
    public static ListNode deleteNode(ListNode head,ListNode delete){
        if(head == null || delete == null){
            return null;
        }
        //要删除的节点在中间
        if(delete.next != null){
            delete.val = delete.next.val;
            delete.next = delete.next.next;
            return head;
        }
        //链表只有一个节点，删除这个节点
        else if(head == delete){
            head = null;
            return head;
        }
        //链表有多个节点，删除尾节点
        else {
            ListNode p = head;
            while (p.next != delete){
                p = p.next;
            }
            p.next = null;
            return head;
        }
    }
}
