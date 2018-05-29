package JianzhiOffer;

/**
 * Created by nightchen on 2018/5/18.
 * 打印从1到最大的n位数
 */
public class Problem17 {
    public static void main(String[] args){
        Print1ToMaxn(1);
    }
    public static void Print1ToMaxn(int n){
        if(n <= 0){
            return;
        }
        int[] numbers = new int[n+1];
        while (!IncreaceIsOver(numbers)){
            printNumbers(numbers);
        }
    }

    public static boolean IncreaceIsOver(int[] numbers){
        boolean isOverflow = false;
        int carry = 0;
        int length = numbers.length;
        for(int i = length-1;i >= 0;i--){
            int sum = numbers[i]+carry;
            if(i == length-1){
                sum++;
            }
            if(sum >= 10){
                if(i == 1){
                   isOverflow = true;
                }
                else {
                    sum = sum - 10;
                    carry = 1;
                    numbers[i] = sum;
                }
            }else {
                numbers[i] = sum;
                break;
            }
        }
        return isOverflow;
    }

    public static void printNumbers(int[] numbers){
        int length = numbers.length;
        int index = 0;
        for(int i = 0;i < length;i++){
            if(numbers[i] == 0){
                index++;
            }else {
                break;
            }
        }
        if(index != length){
            for(int j = index;j < length;j++){
                System.out.print(numbers[j]);
            }
            System.out.println();
        }

    }
}
