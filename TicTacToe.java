import java.util.Random;

public class TicTacToe {

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        Random rand = new Random();

        int xCount = 0;
        int oCount = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (xCount == 5) {
                    board[i][j] = 'O';
                    oCount++;
                } else if (oCount == 4) {
                    board[i][j] = 'X';
                    xCount++;
                } else {
                    if (rand.nextBoolean()) {
                        board[i][j] = 'X';
                        xCount++;
                    } else {
                        board[i][j] = 'O';
                        oCount++;
                    }
                }
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        char winner = checkWinner(board);

        if (winner == 'X') {
            System.out.println("X wins!");
        } else if (winner == 'O') {
            System.out.println("O wins!");
        } else {
            System.out.println("Draw (Cat's game)");
        }
    }

    public static char checkWinner(char[][] board) {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0];
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return board[0][i];
            }
        }

        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0];
        }

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2];
        }

        return ' ';
    }
}
