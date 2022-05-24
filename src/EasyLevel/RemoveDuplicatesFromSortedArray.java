package EasyLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    private static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[j++] = nums[i];
        }
        return j;
    }
    public static void main(String[] args) {
        int[] nums = new int[] { 1, 2, 2, 3, 3, 4, 5, 5, 6 };
        int newLength = removeDuplicates(nums);
        System.out.println("Length of array without duplicates = " + newLength);
        System.out.print("Array = ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
