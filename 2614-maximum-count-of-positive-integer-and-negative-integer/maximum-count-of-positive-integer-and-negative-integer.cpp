// class Solution {
// public:
//     int maximumCount(vector<int>& nums) {
//         int neg = 0, pos = 0;

//         for(int i = 0; i < nums.size(); i++){
//             if(nums[i] < 0)
//                 neg = min(neg, nums[i]);
//             else if(nums[i] > 0)
//                 pos = max(pos, nums[i]);
//         }
        
//         if(neg != 0 && pos != 0)
//             return getMax(max(abs(neg), pos));
        
//         int num = 0;

//         if(pos != 0)
//             num = pos;
//         else
//             num = abs(neg);

//         return getMax(num);
//     }

//     int getMax(int num){
//         int maxDigit = 0;
//         while(num > 0){
//             int rem = num % 10;
//             num /= 10;
//             maxDigit = max(rem, maxDigit);
//         }

//         return maxDigit;
//     }
// };

class Solution {
public:
    int maximumCount(vector<int>& nums) {
        int p = 0, n = 0;
        for(auto &i: nums){
            if(i>0)p++;
            else if(i<0)n++;
        }return max(p,n);
    }
};