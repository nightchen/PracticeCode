package JianzhiOffer;

/**
 * Created by nightchen on 2018/7/2.
 */
public class Problem46 {
    public int translate(int n){
        if(n < 0){
            return 0;
        }
        if(n < 10){
            return 1;
        }
        String str = String.valueOf(n);
        int[] dp = new int[str.length()];
        dp[0] = 1;
        int m = Integer.valueOf(str.substring(0,2));
        dp[1] = m <= 25?2:1;
        for(int i = 2;i < str.length();i++){
            dp[i] = dp[i-1]+dp[i-2]*canTrans(i-1,i,str);
        }
        return dp[dp.length-1];
    }

    public int canTrans(int i,int j,String str){
        int m = Integer.valueOf(str.substring(i,j+1));
        return (m <=25 && m >=9)?1:0;
    }

    public static void main(String[] args){
        Problem46 p = new Problem46();
        System.out.println(p.translate(1234));
    }
}
