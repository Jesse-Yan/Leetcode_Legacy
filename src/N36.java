import java.util.HashSet;
import java.util.Set;

public class N36 {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][][] sq = new int[3][3][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int index = c - '0' - 1;
                    row[i][index] += 1;
                    col[j][index] += 1;
                    sq[i / 3][j / 3][index] += 1;
                    if (row[i][index] > 1 || col[j][index] > 1 || sq[i / 3][j / 3][index] > 1)
                        return false;
                }
            }
        }

        return true;
    }
}
