package JianzhiOffer;

/**
 * Created by nightchen on 2018/6/27.
 */
public class Array_util {
    public static <T> void swap(int i,int j,T[] array){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
