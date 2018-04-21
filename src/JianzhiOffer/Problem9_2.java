package JianzhiOffer;

import java.util.LinkedList;

/**
 * Created by nightchen on 2018/4/21.
 * 用两个队列来实现一个栈，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class Problem9_2 {
    LinkedList<Integer> list1 = new LinkedList<>();
    LinkedList<Integer> list2 = new LinkedList<>();
    public void push(int node) {
        list1.add(node);
    }
    public int pop() {
        if(list1.isEmpty()){
            System.out.println("the queue is empty!");
        }
        while (list1.size()>1){
            list2.add(list1.poll());
        }
        int temp = list1.poll();
        LinkedList<Integer> templist = list1;
        list1 = list2;
        list2 = templist;
        return temp;
    }

    public static void main(String[] args){
        Problem9_2 queue = new Problem9_2();
        queue.push(9);
        queue.push(8);
        queue.push(7);
        System.out.println(queue.pop());

    }
}
