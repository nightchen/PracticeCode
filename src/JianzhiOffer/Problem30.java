package JianzhiOffer;

import java.util.Stack;

/**
 * Created by nightchen on 2018/6/16.
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class Problem30 {
    Stack<Integer> data = new Stack<>();
    Stack<Integer> min = new Stack<>();
    Integer mintemp = null;
    public void push(int node) {
        data.push(node);
        if(mintemp == null){
            mintemp = node;
            min.push(node);
        }else {
            if(node < mintemp){
                mintemp = node;
                min.push(node);
            }
        }
    }

    public void pop() {
        int x = data.pop();
        int y = min.pop();
        if(x != y){
            min.push(y);
        }else {
            mintemp = min.peek();
        }
    }

    public int top() {
        return data.peek();
    }

    public int min() {
        return min.peek();
    }
    public static void main(String[] args){
        Problem30 p = new Problem30();
        p.push(3);
        p.push(4);
        p.push(2);
        p.push(1);
        System.out.println(p.min());
        p.pop();
        p.pop();
        System.out.println(p.min());
        p.push(2);
        System.out.println(p.min());
        System.out.println(p.data);
        System.out.println(p.min);

    }
}
