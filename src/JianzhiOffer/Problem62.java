package JianzhiOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nightchen on 2018/7/14.
 * 圆圈中最后剩下的数(约瑟夫环)
 */
public class Problem62 {
    public static int LastRemaining_Solution(int n, int m) {
        if(n <=0 || m <= 0){
            return -1;
        }
        List<Integer> list = new ArrayList<>();
        for(int i  = 0;i < n;i++){
            list.add(i);
        }
        int index = 0;
        while (list.size()!=1){
            index = (index+m -1)% list.size();
            list.remove(index);
        }
        return list.get(0);
    }

    public static void main(String[] args){
        System.out.println(LastRemaining_Solution(5,3));
    }
}
