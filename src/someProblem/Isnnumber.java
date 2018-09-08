package someProblem;

import java.math.BigInteger;

/**
 * Created by nightchen on 2018/8/21.
 */
public class Isnnumber {
    public static void main(String[] args){
        String str = "helloworld";
        str.substring(3);
        str.concat("xyz");
        System.out.println(str);
        BigInteger a = new BigInteger("16464684");
        BigInteger b = new BigInteger("16464684");

    }

    public static boolean function(int i){
        return (i > 0) && ((i & (i-1)) == 0);
    }
}
