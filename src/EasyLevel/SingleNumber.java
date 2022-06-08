package EasyLevel;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1};
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
