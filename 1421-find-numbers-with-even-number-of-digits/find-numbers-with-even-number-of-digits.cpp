class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int ans = 0;
        
        for(int i = 0; i < nums.size(); i++){
            int current = 0;

            while(nums[i]){
                nums[i] /= 10;
                current++;
            }

            if(current % 2 == 0)
                ans++;
        }

        return ans;
    }
};