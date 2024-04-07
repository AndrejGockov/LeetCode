public class Solution {
    public int[] LeftRightDifference(int[] nums) {
        int[] ans = new int [nums.Length];
        for(int i = 0; i < nums.Length; i++){
            int leftSum = 0;
            int rightSum = 0;
            for(int j = i + 1; j < nums.Length; j++)
                rightSum += nums[j];
            
            for(int j = 0; j < i; j++)
                leftSum += nums[j];
            
            ans[i] = Math.Abs(leftSum - rightSum);
        }
        
        return ans;
    }
}