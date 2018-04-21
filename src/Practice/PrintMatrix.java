package Practice;

/**
 * Created by nightchen on 2018/4/12.
 * 顺时针打印矩阵
 */
public class PrintMatrix {
    public static void main(String[] args){
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        printByPoint(matrix);
    }

    public static void printByPoint(int[][] matrix){
        int tr = 0;
        int tc = 0;
        int dr = matrix.length - 1;
        int dc = matrix[0].length-1;
        while(tc <= dc && tr <= dr){
            printEdge(matrix,tr++,tc++,dr--,dc--);
        }
    }

    public static void printEdge(int[][] matrix,int tr,int tc,int dr,int dc){
        if (tr ==dr){
            for (int i = tc;i <= dc;i++){
                System.out.print(matrix[i][dr]+" ");
            }
        }else if (tc == dc){
            for (int i = tr;i <= dr;i++){
                System.out.print(matrix[tc][i]+" ");
            }
        }else {
            int curc = tc;
            int curr = tr;
            while (curc != dc){
                System.out.print(matrix[tr][curc]+" ");
                curc++;
            }
            while (curr != dr) {
                System.out.print(matrix[curr][dc] + " ");
                curr++;
            }
            while (curc != tc) {
                System.out.print(matrix[dr][curc] + " ");
                curc--;
            }
            while (curr != tr) {
                System.out.print(matrix[curr][tc] + " ");
                curr--;
            }
        }
    }
}
