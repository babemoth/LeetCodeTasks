package EasyLevel.Array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                ,{'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                ,{'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                ,{'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                ,{'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                ,{'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                ,{'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                ,{'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                ,{'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        boolean result = isValidSudoku(board);
        System.out.println(result);

    }
    public static boolean isValidSudoku(char[][] board) {
        int n = board.length;
        Set<Integer>[] rows = new Set[n];
        Set<Integer>[] column = new Set[n];
        Set<Integer>[] blocks = new Set[n];

        for(int i = 0; i < n; i++) {
            rows[i] = new HashSet<Integer>();
            column[i] = new HashSet<Integer>();
            blocks[i] = new HashSet<Integer>();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (board[i][j] == '.') continue;
                int k = 3 * (i /3) + (j / 3);

                int num = board[i][j] - '0';
                if (rows[i].contains(num)) return false;
                if (column[j].contains(num)) return false;
                if (blocks[k].contains(num)) return false;

                rows[i].add(num);
                column[j].add(num);
                blocks[k].add(num);
            }
        }
        return true;
    }
}
