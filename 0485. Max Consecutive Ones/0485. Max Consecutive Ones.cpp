class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int consecutive = 0, max = 0;
        for (int i : nums) {
            if (i == 1) {
                consecutive++;
                continue;
            }

            if (max < consecutive)
                max = consecutive;
            consecutive = 0;
        }

        if (max < consecutive)
            max = consecutive;
        return max;
    }
};