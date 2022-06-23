package EasyLevel.Array;


public class RemoveDuplicatesFromSortedArray {
    private static int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length;i++){
            if(i < nums.length - 1 && nums[i] == nums[i + 1]){
                continue;
            }
            nums[j++] = nums[i];
        }
        return j;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,3,3,4,5,5,6};
        int len = removeDuplicates(nums);
        System.out.println(len);
        System.out.print("arr = ");
        for (int i = 0; i < len; i ++){
            System.out.print(nums[i]);
        }
    }
}
