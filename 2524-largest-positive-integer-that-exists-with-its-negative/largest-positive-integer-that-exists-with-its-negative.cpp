class Solution {
public:
    int findMaxK(vector<int>& nums) {
        int ans = -1;
        for(int i = 0; i < nums.size(); i++){
            if(nums[i] > 0 
            && nums[i] > ans
            && find(nums.begin(), nums.end(), nums[i] * (-1)) != nums.end() )
                ans = nums[i];
        }
        return ans;
    }
};