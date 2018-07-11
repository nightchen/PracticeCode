package JianzhiOffer;

/**
 * Created by nightchen on 2018/6/27.
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。
 * 如果不存在则输出0。
 */
public class Problem39 {
    public static int MoreThanHalfNum_Solution(int [] array) {
        if(array.length == 0){
            return 0;
        }
        int num = array[0];
        int count = 1;
        for(int i = 1;i< array.length;i++){
            if(array[i] == num){
                count++;
            }else {
                count--;
            }
            if(count == 0){
                num = array[i];
                count = 1;
            }
        }

        return check(num,array)?num:0;
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

    public static void main(String[] args){
        int[] array = new int[]{1,2,3,2,4,2,5,2,6,2,2};
        System.out.println(MoreThanHalfNum_Solution(array));
    }
}
