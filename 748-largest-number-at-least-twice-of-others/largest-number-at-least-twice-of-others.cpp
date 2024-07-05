class Solution {
public:
    int dominantIndex(vector<int>& nums) {
        int indx = max_element(nums.begin(), nums.end()) - nums.begin();
        int largest = *max_element(nums.begin(), nums.end());

        for(int i = 0; i < nums.size(); i++){
            if(indx != i 
            && largest < (nums[i] * 2))
                return -1;
        }

        return indx;
    }
};