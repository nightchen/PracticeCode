package JianzhiOffer;

import java.util.*;

/**
 * Created by nightchen on 2018/6/30.
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class Problem40 {
    //排序，时间复杂度O(nlogn)
    public ArrayList<Integer> GetLeastNumbers_Solution1(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input.length < k){
            return list;
        }
        Arrays.sort(input);
        for(int i=0;i < k;i++){
            list.add(input[i]);
        }
        return list;
    }

    //PriorityQueue O(nlogk) 使用PriorityQueue当作Heap，每次返回最大的值。Time complexity is O(nlogk)
    public static ArrayList<Integer> GetLeastNumbers_Solution2(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(input.length <= k || k <= 0){
            return list;
        }
        Queue<Integer> queue = new PriorityQueue<>(k, ((o1, o2) -> o2-o1));
        for(int i = 0;i < input.length;i++){
            if(queue.size() < k){
                queue.offer(input[i]);
            }else {
                if (input[i] < queue.peek()){
                    queue.remove();
                    queue.offer(input[i]);
                }
            }
        }

        while (!queue.isEmpty()){
            list.add(queue.remove());
        }
        return list;
    }
    public static void main(String[] args){
        int[] input = new int[]{4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers_Solution2(input,4));
    }
}
