class Solution {
public:
    bool areNumbersAscending(string s) {
        vector<int> nums;
        for(int i = 0; i < s.size(); i++){
            if(isdigit(s[i])){
                int number = 0;
                while(i < s.size() && isdigit(s[i])){
                    number = (number * 10) + ((int)s[i++] - (int)'0');
                }
                nums.push_back(number);
            }
        }

        for(int i = 0; i < nums.size() - 1; i++)
            if(nums[i] >= nums[i + 1])
                return false;

        return true;
    }
};