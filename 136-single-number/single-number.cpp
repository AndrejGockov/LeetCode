class Solution {
public:
    int singleNumber(vector<int>& nums) {
        // unordered_map<int> number;
        // for (int i = 0; i < nums.size(); i++) {
        //     unique = nums[i];
        //     if (i + 1 == nums.size()) {
        //         for (int j = i; j > 0; j--) {
        //             if (unique == nums[j]) {
        //                 j = nums.size();
        //                 unique = 0;
        //             }
        //         }
        //         continue;
        //     }
        //     for (int j = i + 1; j < nums.size(); j++) {
        //         if (unique == nums[j]) {
        //             j = nums.size();
        //             unique = 0;
        //         }
        //     }
        // }
        // return unique;
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