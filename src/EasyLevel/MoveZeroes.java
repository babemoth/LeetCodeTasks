package EasyLevel;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }

    public static int[] moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        for (i = 0; i < nums.length; i++){
            if(nums[i] != 0) {
                nums[j++]= nums[i];
            }
        }
        while (j < nums.length){
            nums[j++] = 0;
        }
        return nums;
    }
}
