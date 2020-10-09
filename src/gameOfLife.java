import java.util.Arrays;

public class gameOfLife {
    public static void main(String[] args) {
        int board[][]={{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife t1 =new gameOfLife();
        t1.gameofLife(board);
    }
    public void gameofLife(int[][] board) {
        int neiboard[] = {-1,0,1};
        int row = board.length;
        int col = board[0].length;
        int copy[][] = new int[row][col];
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j ++){
                copy[i][j] = board[i][j];
            }
        }
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j ++){
                int live = 0;
                for(int ii = 0;ii < 3;ii ++){
                    for(int jj = 0;jj < 3;jj ++){
                        if(!(neiboard[ii] == 0 && neiboard[jj] == 0)){
                            int r = i + neiboard[ii];
                            int c = j + neiboard[jj];
                            if((r >= 0 && r < row) && (c >= 0 && c < col) && (copy[r][c] == 1)){
                                live +=1;
                            }
                        }
                    }
                }
                if((live < 2 || live > 3) && copy[i][j] == 1  ){
                    board[i][j] = 0;
                }else if(live == 3 && copy[i][j] == 0){
                    board[i][j] = 1;
                }
                }
            }
            System.out.println(Arrays.deepToString(board));
    }
}
