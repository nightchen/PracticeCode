package JianzhiOffer;



/**
 * Created by nightchen on 2018/7/2.
 * 数字以012345678910111213141516171819的格式序列化到一个字符系列中。在这个序列中
 * 第五位是5，第十三为是1，第十九位是4，求任意第n位对应的数字。
 */
public class Problem44 {
    public int theNthNumber(int n){
        if(n < 0){
            return -1;
        }
        int digit = 1;
        while (true){
            int number = numberOfDigit(digit);
            if(n < number*digit){
                int i = n/digit+(int)Math.pow(10,digit-1);
                int j = n%digit;
                return digitAtIndex(i,j);
            }else {
                n -= number*digit;
                digit++;
            }
        }
    }

    public int numberOfDigit(int n){
        if(n == 1){
            return 10;
        }
        double m = 9*Math.pow(10,n-1);
        return (int)m;
    }

    public int digitAtIndex(int n,int index){
        return Integer.valueOf(String.valueOf(n).charAt(index)+"");
    }

    public static void main(String[] args){
        Problem44 p = new Problem44();
        System.out.println(p.theNthNumber(19));
    }
}
