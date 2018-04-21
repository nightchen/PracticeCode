package JianzhiOffer;

/**
 * Created by nightchen on 2018/4/20.
 * 二维数组中的查找
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数
 */
public class Problem4 {
    //最简单的方法：顺序查找
    // 第二种方法：从数组左下角的元素开始查找，若元素比目标小，则右移，若元素比目标大，则左移。
    public boolean Find(int target, int [][] array) {
        int i = 0;
        int j = array[0].length-1;
        while (i < array.length && j >= 0) {
            if (array[i][j] == target) {
                return true;
            }else if (array[i][j] > target) {
                j--;
            }else{
                i++;
            }
        }

        return false;
    }
}
