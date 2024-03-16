class Solution {
public:
    int findClosestNumber(vector<int>& nums) {
        int ans = nums[0];
        for(int i = 1; i < nums.size(); i++){
            int difference = abs(ans - 0), current = abs(nums[i] - 0);
            if(current < difference){
                ans = nums[i];
            }
            
            if(difference == current){
                ans = max(ans, nums[i]);
            }
        }
        
        return ans;
    }
};