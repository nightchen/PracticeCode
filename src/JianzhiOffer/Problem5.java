package JianzhiOffer;

/**
 * Created by nightchen on 2018/4/21.
 * 替换空格
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy
 */
public class Problem5 {
    public String replaceSpace(StringBuffer str) {
        StringBuffer string = new StringBuffer();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ' '){
                string.append("%20");
            }else{
                string.append(str.charAt(i));
            }
        }
        return string.toString();

    }
}
