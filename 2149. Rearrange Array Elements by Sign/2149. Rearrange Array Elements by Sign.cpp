class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        vector<int> newNums(nums.size(), 0);
        int i = 0;
        int j = 1;
        for(int number : nums){
            if(number > 0){
                newNums[i] = number;
                i += 2;
            }else{
                newNums[j] = number;
                j += 2;
            }
        }

        return newNums;
    }
};