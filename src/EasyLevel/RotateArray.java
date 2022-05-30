package EasyLevel;

import java.util.Arrays;

public class RotateArray {
    public static int[] rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int j = nums.length - 1;
            int n = nums[j];
            for (; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = n;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int k = 3;
        int[] ans = rotate(arr,k);
        System.out.println(Arrays.toString(ans));
    }
}
