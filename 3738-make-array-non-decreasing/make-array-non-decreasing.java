class Solution {
    public int maximumPossibleSize(int[] nums) {
        int ans = 0;
        int previous = 0;

        for(int i = 0; i < nums.length; i++){
            if(previous <= nums[i]){
                ans++;
                previous = nums[i];
            }
        }

        return ans;
    }
}