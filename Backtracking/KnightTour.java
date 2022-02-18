import java.util.*;

public class KnightTour {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int board[][] = new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                board[i][j] = -1;
        int moveX[] = {1, 2, 2, 1, -1, -2, -2, -1};
        int moveY[] = {2, 1, -1, -2, -2, -1, 1, 2};

        board[0][0] = 0;
        int pos = 1;

        if(!knightTourPossible(board, n, moveX, moveY, 0, 0, pos)){
            System.out.println("Solution does not exists");
        }
        else{
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }

    public static boolean knightTourPossible(int[][] board, int n, int[] moveX, int[] moveY, int currX, int currY, int pos){
        
        if(pos == n*n){
            return true;
        }
        for(int i=0;i<8;i++){
            int nextX = currX + moveX[i];
            int nextY = currY + moveY[i];
            if(isValid(board, n, nextX, nextY)){
                board[nextX][nextY] = pos;
                boolean x = knightTourPossible(board, n, moveX, moveY, nextX, nextY, pos+1);
                if(!x){
                    board[nextX][nextY] = -1;
                }
                else{
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isValid(int[][] board, int n, int currX, int currY){
        if(currX>=0 && currY>=0 && currX<n && currY<n && board[currX][currY] == -1){
            return true;
        }
        return false;
    }
}
