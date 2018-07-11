package JianzhiOffer;

import java.util.Arrays;

/**
 * Created by nightchen on 2018/6/27.
 *
 */
public class Problem39_2 {
    public static int MoreThanHalfNum_Solution(int [] array) {
        if(array.length == 0){
            return 0;
        }
        int mid = array.length>>1;
        int start = 0;
        int end = array.length-1;
        int index = Partition(array,start,end);
        while (index != mid){
            if(index > mid){
                end = index-1;
                index = Partition(array,start,end);
            }else {
                start = index+1;
                index = Partition(array,start,end);
            }
        }
        return check(array[mid],array)?array[mid]:0;
    }

    public static int Partition(int[] array,int start,int end){
        int base = start;
        int index = base+1;
        for(int i = index;i <= end;i++){
             if(array[i] < array[base]){
                  swap(i,index,array);
                  index++;
             }
        }
        swap(base,index-1,array);
        System.out.println(Arrays.toString(array));
        return index-1;
    }
    public static boolean check(int n,int[] array){
        int count = 0;
        for(int i = 0;i < array.length;i++){
            if(array[i] == n){
                count++;
            }
        }
        return count*2 > array.length?true:false;
    }

    public static void swap(int i,int j,int[] array){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args){
        int[] array = new int[]{3,1,2,5,4,0};
        System.out.println(Partition(array,0,5));
    }
}
