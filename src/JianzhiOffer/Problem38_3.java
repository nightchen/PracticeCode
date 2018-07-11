package JianzhiOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nightchen on 2018/6/28.
 * 打靶问题。一个射击运动员打靶，靶一共有10环，连开10 枪打中90环的可能性有多少？
 */
public class Problem38_3 {
    public static List<List<Integer>> lists = new ArrayList<>();
    public static int count = 0;
    public static List shutBa(int times,int sum){
        if(times <= 0 || sum <= 0){
            return lists;
        }
        List<Integer> list = new ArrayList<>();
        shut(times,sum);
        return lists;
    }
    public static void shut(int times,int sum){
        if(times < 0 || times*10 < sum){
            return;
        }
        if(times == 0 && sum == 0){
            count++;
            return;
        }
        for(int i = 0;i <= 10;i++){
            shut(times-1,sum-i);
        }
    }
    public static void main(String[] args){
        shut(10,90);
        System.out.println(count);
    }
}
