package EasyLevel;

import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,2};
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
}
