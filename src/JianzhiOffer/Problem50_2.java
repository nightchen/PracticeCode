package JianzhiOffer;

/**
 * Created by nightchen on 2018/7/4.
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。
 * 例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 */
public class Problem50_2 {
    public int[] array = new int[256];
    StringBuilder sb = new StringBuilder();
    public void Insert(char ch){
            array[ch]++;
            sb.append(ch);
    }
    public char FirstAppearingOnce(){
        for(int i= 0;i < sb.length();i++){
            if(array[sb.charAt(i)] == 1){
                return sb.charAt(i);
            }
        }
        return '#';
    }
}
