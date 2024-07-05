class Solution {
public:
    vector<int> intersection(vector<vector<int>>& nums) {
        vector<int>ans;

        for(int i = 0; i < nums[0].size(); i++){
            bool found = false;
            for(int j = 0; j < nums.size(); j++){
                // find(v.begin(), v.end(), x) != v.end(
                if(find(nums[j].begin(), nums[j].end(), nums[0][i]) != nums[j].end()){
                    found = true;
                }else{
                    found = false;
                    break;
                }
            }

            if(found)
                ans.push_back(nums[0][i]);
        }

        sort(ans.begin(), ans.end());
        return ans;
    }
};