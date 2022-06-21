package EasyLevel;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(rotate(matrix)));

    }

    public static int[][] rotate(int[][] matrix) {
        int n = matrix.length, depth = n / 2;
        for (int i = 0; i < depth; i++) {
            int len = n - 2 * i - 1, opp = n - 1 - i;
            for (int j = 0; j < len; j++) {
                int temp = matrix[i][i+j];
                matrix[i][i+j] = matrix[opp-j][i];
                matrix[opp-j][i] = matrix[opp][opp-j];
                matrix[opp][opp-j] = matrix[i+j][opp];
                matrix[i+j][opp] = temp;
            }
        }
        return matrix;
    }
}
