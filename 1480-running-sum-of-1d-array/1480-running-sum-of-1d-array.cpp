class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        vector<int> prefix;
        for(int i = 0; i < nums.size(); i++){
            prefix.push_back(nums[i]);
            for(int j = 0; j < i; j++){
                nums[i]+=prefix[j];
            }
        }
        return nums;
    }
};