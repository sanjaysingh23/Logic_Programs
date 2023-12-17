class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[]=new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
public class Two_Sum {
    public static void main(String[] args) {
        int nums[]=new int[]{2,5,1,6};
        Solution sol = new Solution();
        System.out.println(sol.twoSum(nums, 3));
    }
}
