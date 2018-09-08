package JianzhiOffer;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by nightchen on 2018/7/13.
 * 队列的最大值
 */
public class Problem59_2 {
    public static class QueueWithMax<T extends Comparable> {
        private Deque<InternalData<T>> queueData;
        private Deque<InternalData<T>> queueMax;
        private int currentIndex;
        public QueueWithMax() {
            this.queueData = new ArrayDeque<>();
            this.queueMax = new ArrayDeque<>();
            this.currentIndex = 0;
        }
        public T max(){
            if(queueMax.isEmpty())
                return null;
            return queueMax.getFirst().value;
        }
        public void pushBack(T value){
            while (!queueMax.isEmpty()&&value.compareTo(queueMax.getLast().value)>=0)
                queueMax.removeLast();
            InternalData<T> addData = new InternalData<>(value,currentIndex);
            queueMax.addLast(addData);
            queueData.addLast(addData);
            currentIndex++;
        }
        public T popFront(){
            if(queueData.isEmpty())
                return null;
            InternalData<T> delData = queueData.removeFirst();
            if(delData.index==queueMax.getFirst().index)
                queueMax.removeFirst();
            return delData.value;
        }
        private static class InternalData<M extends Comparable> {
            public M value;
            public int index;
            public InternalData(M value,int index){
                this.value = value;
                this.index = index;
            }

            @Override
            public String toString() {
                return "("+value+","+index+")";
            }
        }

        @Override
        public String toString() {
            StringBuilder sb= new StringBuilder();
            sb.append(queueData.toString());
            sb.append("\n");
            sb.append(queueMax.toString());
            return sb.toString();
        }
    }
    public static void main(String[] args) {
        QueueWithMax<Integer> queue = new QueueWithMax<>();
        queue.pushBack(1);
        queue.pushBack(2);
        queue.pushBack(3);
        queue.pushBack(5);
        queue.pushBack(1);
        System.out.println(queue);
        System.out.println("开始出队后，调用max");
        System.out.println("最大值："+queue.max());
        System.out.println("弹出值："+queue.popFront());
        System.out.println("最大值："+queue.max());
        System.out.println("弹出值："+queue.popFront());
        System.out.println("最大值："+queue.max());
        System.out.println("弹出值："+queue.popFront());
        System.out.println("最大值："+queue.max());
        System.out.println("弹出值："+queue.popFront());
        System.out.println("最大值："+queue.max());


    }

}
