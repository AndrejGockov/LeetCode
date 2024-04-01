class Solution {
public:
    vector<int> leftRightDifference(vector<int>& nums) {
        vector<int> ans;
        for(int i = 0; i < nums.size(); i++){
            int leftSum = 0;
            int rightSum = 0;
            for(int j = i + 1; j < nums.size(); j++)
                rightSum += nums[j];
            
            for(int j = 0; j < i; j++)
                leftSum += nums[j];
            
            ans.push_back(abs(leftSum - rightSum));
        }
        
        return ans;
    }
};