class Solution {
public:
    vector<int> applyOperations(vector<int>& nums) {
        for(int i = 0; i < nums.size() - 1; i++){
            if(nums[i] == nums[i + 1]){
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        // Bubble sort all of the 0's
        for(int i = 0; i < nums.size() - 1; i++){
            bool swapped = false;
            for(int j = 0; j < nums.size() - i - 1;j++){
                if(nums[j] == 0){
                    swap(nums[j], nums[j + 1]);
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
        return nums;
    }
};