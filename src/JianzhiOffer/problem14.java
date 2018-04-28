package JianzhiOffer;

/**
 * Created by nightchen on 2018/4/26.
 */
public class problem14 {
    public static int maxProductAfterCutting(int length){
        if(length < 2){
            return 0;
        }else if(length == 2){
            return 1;
        }else if(length == 3){
            return 2;
        }
        int[] f = new int[length+1];
        f[0] = 0;
        f[1] = 1;
        f[2] = 2;
        f[3] = 3;
        int max = 0;
        for(int i = 4;i <= length;i++){
            max = 0;
            for(int j = 1;j <= i/2;j++){
                int len = f[j] * f[i-j];
                if(max < len){
                    max = len;
                }
                f[i] = max;
            }
        }
        max = f[length];
        return max;
    }

    public static void main(String[] args){
        System.out.println(maxProductAfterCutting(8));
    }
}
