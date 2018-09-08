package someProblem;

/**
 * Created by nightchen on 2018/8/20.
 */
public class Money {
    public static void main(String[] args){
        int target = 1000;

        int disabc = Integer.MAX_VALUE;

        for(int i = 0;i <= target/30;i++){
            for(int j = 0;j <= target/50;j++){
                for(int k = 0;k <= target/100;k++){
                    int temp = target - i*30 - j*50 - k*100;
                    if(temp >= 0 && temp < disabc){
                        disabc = temp;
                    }
                }
            }
        }

        System.out.println(disabc);

    }
}
