class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int counter=0;
        for(int i = 0; i < nums.size(); ){
            if(nums[i] == 0){
                nums.erase(nums.begin()+i);
                counter++;
                continue;
            }
            i++;
        }

        for(int i=0;i<counter;i++){
            nums.push_back(0);
        }

    }
};