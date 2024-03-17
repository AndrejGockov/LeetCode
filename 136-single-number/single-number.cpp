class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int ans = -1;
        for(int i = 0; i < nums.size(); i++){
            int curr = nums[i];
            bool check = true;
            for(int j = 0; j < nums.size(); j++){
                if(curr == nums[j] && i != j){
                    j = nums.size();
                    check = false;
                }
            }

            if(check)
                return curr;
        }
        return ans;
    }
};