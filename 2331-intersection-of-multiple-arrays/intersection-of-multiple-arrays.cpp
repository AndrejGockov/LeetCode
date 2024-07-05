class Solution {
public:
    vector<int> intersection(vector<vector<int>>& nums) {
        vector<int>ans;

        // Because it the number has to appear everywhere we only itterate through every element in the first sub-vector
        for(int i = 0; i < nums[0].size(); i++){
            bool found = true;
            for(int j = 0; j < nums.size(); j++){
                // Checks if the 
                if(find(nums[j].begin(), nums[j].end(), nums[0][i]) == nums[j].end()){
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