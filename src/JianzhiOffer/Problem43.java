package JianzhiOffer;

/**
 * Created by nightchen on 2018/6/30.
 * 输入一个整数n，求1-n这n个整数的十进制表示中1出现的个数。
 */
public class Problem43 {
    public int NumberOf1Between1AndN_Solution(int n) {
        if(n <= 0){
            return 0;
        }
        int count = 0;
        for(int i =1;i<= n;i*=10){
            int a = n/i;
            int b = n%i;
            int c = a%10==1?1:0;
            count=count+(a+8)/10*i+c;
        }
        return count;
    }
}
