package JianzhiOffer;

/**
 * Created by nightchen on 2018/4/26.
 * 机器人的运动范围
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，
 * 右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
 * 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 */
public class Problem13 {
    public int movingCount(int threshold, int rows, int cols) {
        if(threshold < 0 || rows <= 0 || cols <= 0){
             return 0;
        }
        int[][] visited = new int[rows][cols];
        for(int i = 0;i < rows;i++){
            for(int j = 0;j < cols;j++){
                visited[i][j] = 0;
            }
        }
        return movingCount(threshold,rows,cols,0,0,visited);
    }
    public int movingCount(int threshold,int row,int col,int i,int j,int[][] visited){
        if(i < 0 || i >= row || j < 0 || j >= col || visited[i][j] == 1 || !canVisit(threshold,i,j)){
            return 0;
        }
        visited[i][j] = 1;
        return    movingCount(threshold,row,col,i+1,j,visited)
                + movingCount(threshold,row,col,i-1,j,visited)
                + movingCount(threshold,row,col,i,j+1,visited)
                + movingCount(threshold,row,col,i,j-1,visited)+1;
    }

    public boolean canVisit(int threshold,int i,int j){
        int x = 0;
        int y = 0;
        while(i > 0){
            x = x + i%10;
            i = i/10;
        }
        while(j > 0){
            y = y + j%10;
            j = j/10;
        }
        if(x + y > threshold){
            return false;
        }else {
            return true;
        }
    }
}
