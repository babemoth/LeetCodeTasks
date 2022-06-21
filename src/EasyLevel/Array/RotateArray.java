package EasyLevel.Array;

import java.util.Arrays;

public class RotateArray {
    public static int[] rotate(int[] nums, int k) {
        if (k==0){
            return nums;
        }
        if (nums == null || nums.length == 0){
            return nums;
        }

        int[] res = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            int newIndex = (i + k) % nums.length;
            res[newIndex] = nums[i];
        }

        for (int i=0; i<nums.length; i++) {
            nums[i] = res[i];
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
