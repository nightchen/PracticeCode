package JianzhiOffer;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by nightchen on 2018/6/30.
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 */
public class Problem41 {
    int count = 0;
    Queue<Integer> max = new PriorityQueue<>();
    Queue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());
    public void Insert(Integer num) {
        if(count%2==0){
            max.offer(num);
            min.offer(max.poll());
        }else {
            min.offer(num);
            max.offer(min.poll());
        }
        count++;
    }
    public Double GetMedian() {
        if(count%2==0){
            return new Double(max.peek()+min.peek())/2;
        }else {
            return new Double(min.peek());
        }
    }
}
