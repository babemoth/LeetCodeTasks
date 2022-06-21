package EasyLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {

        int[] nums1 = new int[]{ 9,4,9,8,4};
        int[] nums2 = new int[]{4,9,5};
        int[] ans = intersect(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        int k = 0;
        int a = nums1.length;
        int b = nums2.length;
        int[] result = new int[a];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for (int i = 0, j = 0; i < a && j < b;)
            if (nums1[i] < nums2[j])
                i++;
            else if (nums1[i] == nums2[j++]){
                result[k++] = nums1[i++];
            }
        return Arrays.copyOf(result, k);
    }
}
