// N - Queens all ways problem
//TC = O
public class N_queen_prblm {

    // print board function
    public static void Printboard(char board[][]) {
        System.out.println("_______ chess board _______");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    // condition for placing queeen so that no queens attack each other
    public static boolean isSafae(char board[][], int row, int col) {
        // vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;

    }

    // function for nQueens
    public static void nQueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            Printboard(board);
            return;
        }

        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafae(board, row, j) == true) {
                board[row][j] = 'Q';
                nQueens(board, row + 1); // function call
                board[row][j] = 'X';// backtracking steps

            }
        }

    }

    public static void main(String[] args) {
        int n = 5;
        char board[][] = new char[n][n];
        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board, 0);
    }

}
