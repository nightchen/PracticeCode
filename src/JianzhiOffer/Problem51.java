package JianzhiOffer;
/**
 * Created by nightchen on 2018/7/6.
 * 数组中的逆序对
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
 * 输入一个数组,求出这个数组中的逆序对的总数P。
 * 使用归并排序的思想
 * 注：当数组元素重复时，归并法产生的数据有毛病：
 */

import java.util.Arrays;


public class Problem51 {
    public static int niXuDui(int[] array){
        if(array.length < 2){
            return 0;
        }
        return mergeSort(array,0,array.length-1);
    }

    public static int mergeSort(int[] array,int left,int right){
        if(left == right){
            return 0;
        }
        int mid = left + ((right-left)>>1);
        return mergeSort(array,left,mid)+mergeSort(array,mid+1,right)+merge(array,left,mid,right);
    }

    public static int merge(int[] array,int left,int mid,int right){
        //System.out.println("left:"+left+"right:"+right);
        int[] help = new int[right-left+1];
        int p1 = left;
        int p2 = mid+1;
        int i = 0;
        int result = 0;
        while (p1 <= mid && p2 <= right){
            result+=array[p1] > array[p2]?(mid-p1+1):0;
            help[i++] = array[p1] <= array[p2]?array[p1++]:array[p2++];
        }
        while (p1 <= mid){
            help[i++] = array[p1++];
        }
        while (p2 <= right){
            help[i++] = array[p2++];
        }
        System.arraycopy(help,0,array,left,help.length);
        return result;
    }


    //下面是求逆序对的死办法，双循环
    public static int nixudui(int[] array){
        if(array.length < 2){
            return 0;
        }
        int count = 0;
        for(int i = 0;i < array.length-1;i++){
            for(int j = i+1;j < array.length;j++){
                count += array[i] > array[j]?1:0;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] array = new int[]{5,6,4,8,7,9,3,2,5,6,8,4,1,5};
        System.out.println(Arrays.toString(array));
        System.out.println("双循环求的："+nixudui(array));
        System.out.println("归并法求的："+niXuDui(array));

        System.out.println(Arrays.toString(array));
    }
}
