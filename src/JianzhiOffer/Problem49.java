package JianzhiOffer;

/**
 * Created by nightchen on 2018/7/4.
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class Problem49 {
    public static int GetUglyNumber_Solution(int index) {
        if(index <= 0){
            return 0;
        }
        int[] number = new int[index+1];
        number[0] = 1;
        number[1] = 1;
        int next = 2;

        int num2 = 1;
        int num3 = 1;
        int num5 = 1;
        while (next <= index){
            int min = Math.min(number[num2]*2,Math.min(number[num3]*3,number[num5]*5));
            number[next] = min;
            if (number[num2]*2 == min){
                num2++;
            }
            if (number[num3]*3 == min){
                num3++;
            }
            if (number[num5]*5 == min){
                num5++;
            }
            next++;
        }
        return number[index];
    }
    public static void main(String[] args){
        System.out.println(GetUglyNumber_Solution(10));
    }
}
