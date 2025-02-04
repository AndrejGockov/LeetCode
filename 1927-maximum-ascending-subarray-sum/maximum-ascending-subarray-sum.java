class Solution {
    public int maxAscendingSum(int[] nums) {
        int ans = 0, currentSum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i - 1]){
                ans = Math.max(ans, currentSum);
                currentSum = 0;
            }
            currentSum += nums[i];
        }
        return Math.max(ans, currentSum);
    }
}