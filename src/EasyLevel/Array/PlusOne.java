package EasyLevel.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = new int[]{9};
        int[] ans = plusOne(digits);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1;i >= 0 ; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }
            else {
                digits[i] = digits[i] + 1;
            break;
        }
            if (i == 0){
                int[] y = new int[digits.length + 1];
                y[0] = 1;
                for (int j = 1; j <= digits.length; j++) {
                    y[j] = digits[j - 1];
                }
                digits = y;
            }
        }
        return digits;
    }
}
