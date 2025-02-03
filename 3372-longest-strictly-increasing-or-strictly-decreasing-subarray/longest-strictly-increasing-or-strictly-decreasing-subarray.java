class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length - 1;
        int ans = 0;
        int increaseCounter = 1;
        int decreaseCounter = 1;
        
        for(int i = 0; i < n; i++){
            while(i < n && nums[i] < nums[i + 1]){
                increaseCounter++;
                i++;
            }

            ans = Math.max(ans, increaseCounter);
            increaseCounter = 1;
        }
        ans = Math.max(ans, increaseCounter);

        for(int i = 0; i < n; i++){
            while(i < n && nums[i] > nums[i + 1]){
                decreaseCounter++;
                i++;
            }

            ans = Math.max(ans, decreaseCounter);
            decreaseCounter = 1;
        }
        
        ans = Math.max(ans, decreaseCounter);
        return ans;
    }
}