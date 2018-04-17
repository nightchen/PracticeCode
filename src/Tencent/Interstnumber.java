package Tencent;

import java.util.*;

/**
 * Created by nightchen on 2018/4/14.
 * [编程题] 有趣的数字
 */
public class Interstnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            Arrays.sort(nums);
            if(nums[0] == nums[n-1]){
                int tmp = (n*(n-1))/2;
                System.out.println(tmp+" "+tmp);
                continue;
            }
            Map<Integer,Integer> map = new TreeMap<>();
            for(int i = 0; i < n; i++){
                if (map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);
                }else {
                    map.put(nums[i],1);
                }
            }
            int minres = 0;
            if(map.size() == n){
                int min = Math.abs(nums[1]-nums[0]);
                for(int i = 2;i < n;i++){
                    int tmp = Math.abs(nums[i]-nums[i-1]);
                    if(tmp == min){
                        minres++;
                    }else if(tmp < min){
                        min = tmp;
                        minres = 1;
                    }
                }
            }else {
                for(Integer key : map.keySet()){
                    int val = map.get(key);
                    if(val > 1){
                        minres += (val * (val-1))/2;
                    }
                }
            }
            int maxres = 0;
            //List<Integer> keyset = new ArrayList<Integer>(map.keySet());
            //int val1 = map.get(keyset.get(0));
            //int val2 = map.get(keyset.get(keyset.size()-1));
            int val1 = map.get(nums[0]);
            int val2 = map.get(nums[n-1]);
            maxres = val1 * val2;
            System.out.println(minres + " " + maxres);
        }
    }
}
