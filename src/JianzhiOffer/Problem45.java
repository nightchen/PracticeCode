package JianzhiOffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by nightchen on 2018/7/2.
 */
public class Problem45 {
    public String PrintMinNumber(int [] numbers) {
        if(numbers.length == 0){
            return "";
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < numbers.length;i++){
            list.add(numbers[i]);
        }

        Collections.sort(list,(Integer o1,Integer o2)->{
            String str1 = o1+""+o2;
            String str2 = o2+""+o1;
            return str1.compareTo(str2);
        });
        StringBuilder sb = new StringBuilder();
        for (Integer i:list) {
            sb.append(i);
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Problem45 p= new Problem45();
        int[] array = new int[]{3,32,321};
        System.out.println(p.PrintMinNumber(array));
    }
}
