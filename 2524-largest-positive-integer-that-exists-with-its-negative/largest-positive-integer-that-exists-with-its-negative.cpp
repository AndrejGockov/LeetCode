class Solution {
public:
    int findMaxK(vector<int>& nums) {
        int ans = -1;
        for(int i = 0; i < nums.size(); i++){
            int tmp = nums[i];
            if(nums[i] > 0)
                if(tmp > ans
                && find(nums.begin(), nums.end(), (tmp * (-1))) != nums.end() )
                    ans = tmp;
        }
        return ans;
    }
};