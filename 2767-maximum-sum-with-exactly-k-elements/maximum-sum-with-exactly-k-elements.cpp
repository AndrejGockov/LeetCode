class Solution {
public:
    int maximizeSum(vector<int>& nums, int k) {
        sort(nums.begin(), nums.end());
        int ans = 0;

        for(int i = 0; i < k; i++){
            ans += nums[nums.size() - 1];
            nums[nums.size() - 1] += 1;
        }

        return ans;
    }
};