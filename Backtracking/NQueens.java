import java.util.*;

public class NQueens {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int board[][] = new int[n][n];
        if(!nQueen(board, n, 0))
            System.out.println("Solution doesnt exits");
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

    private static boolean nQueen(int[][] board, int n, int i) {
        if(i==n)
            return true;
        for(int j=0;j<n;j++){
            if(isSafe(board, n, i, j)){
                board[i][j] = 1;
                if(nQueen(board, n, i+1))
                    return true;
                board[i][j] = 0;
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] board, int n, int i, int j) {
        for(int k=0;k<i;k++){
            if(board[k][j]==1)
                return false;
        }
        for(int k=i, l=j;k>=0 && l>=0;k--,l--){
            if(board[k][l]==1)
                return false;
        }
        for(int k=i, l=j;k>=0 && l<n;k--,l++){
            if(board[k][l]==1)
                return false;
        }
        return true;
    }    
}
