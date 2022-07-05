package EasyLevel.Array;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,1,5,6,7,6,7};
        int result = singleNumber(nums);
        System.out.println(result);

    }
    public static int singleNumber(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[0] ^= nums[i];
        }
        return nums[0];

    }
}
