package JianzhiOffer;

/**
 * Created by nightchen on 2018/5/18.
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Problem16 {
    public static void main(String[] args){
        System.out.println(Power(2.0,2));
    }
    public static double Power(double base, int exponent) {
        if(exponent == 0){
            return 1;
        }else if(base == 0.0){
            return 0;
        }else if(exponent == 1){
            return base;
        }else if(exponent == -1){
            return 1/base;
        }else {
            double result = 1.0;
            for(int i = 0;i < Math.abs(exponent);i++){
                result = result * base;
            }
            if(exponent < 0){
                return 1/result;
            }else {
                return result;
            }
        }
    }
}
