import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        solve(board, 0, n, result);

        return result;
    }
    private void solve(char[][] board, int row, int n,
                       List<List<String>> result) {
        if (row == n) {  //base case it is 
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                solution.add(new String(board[i])); //if base case happens means right answer so add in solutions
            }

            result.add(solution);  //adding solution to result as there can be multiple ho skta hai
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {  //main function to check if the column we want is safe or not kinda 
                board[row][col] = 'Q';  //if it is to fir queen place krdo

                solve(board, row + 1, n, result);  //fir explore krne nikal jao recursively that is 

                board[row][col] = '.';  //in some case agar wo shi nhi ha choice then remove the queen from there 
            }
        }
    }
    private boolean isSafe(char[][] board, int row, int col, int n) {

        for (int i = 0; i < row; i++) {   //checking above column for it to be safe or not 
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1;   //checking upper left diagonal for it to be safe or not kinda 
             i >= 0 && j >= 0;
             i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1;  //checking upper right diagonal
             i >= 0 && j < n;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
