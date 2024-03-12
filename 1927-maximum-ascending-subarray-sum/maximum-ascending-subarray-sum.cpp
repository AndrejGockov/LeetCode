class Solution {
public:
    int maxAscendingSum(vector<int>& nums) {
        int ans = 0, currentSum = nums[0];
        for(int i = 1; i < nums.size(); i++){
            if(nums[i] <= nums[i - 1]){
                ans = max(ans, currentSum);
                currentSum = 0;
            }
            currentSum += nums[i];
        }
        return max(ans, currentSum);
    }
};