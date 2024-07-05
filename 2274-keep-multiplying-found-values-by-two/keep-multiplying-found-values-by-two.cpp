class Solution {
public:
    int findFinalValue(vector<int>& nums, int original) {
        while(find(nums.begin(), nums.end(), original) != nums.end()){
            for(int i = 0; i < nums.size(); i++){
                if(nums[i] == original){
                    original *= 2;
                    break;
                }
            }
        }
        return original;
    }
};