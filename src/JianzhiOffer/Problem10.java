package JianzhiOffer;

/**
 * Created by nightchen on 2018/4/22.
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。n<=39
 */
public class Problem10 {
    //递归
    public int Fibonacci1(int n) {
        if (n < 2){
            return n;
        }else {
            return Fibonacci1(n-1)+Fibonacci1(n-2);
        }
    }

    //循环迭代
    public int Fibonacci2(int n) {
        if (n < 2){
            return n;
        }else {
            int a = 0;
            int b = 1;
            int c = 0;
            for(int i= 2;i <=n;i++){
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
    //以空间换时间
    public int Fibonacci3(int n) {
        if (n < 2){
            return n;
        }else {
            int[] fib = new int[n+1];
            fib[0] = 0;
            fib[1] = 1;
            for(int i= 2;i <= n;i++){
                fib[i] = fib[i-1] + fib[i-2];
            }
            return fib[n];
        }
    }
    public static void main(String[] args){
        Problem10 p = new Problem10();
        System.out.println(p.Fibonacci1(10));
        System.out.println(p.Fibonacci2(10));
        System.out.println(p.Fibonacci3(10));
    }
}
