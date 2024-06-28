class Solution {
public:
    int sumOddLengthSubarrays(vector<int>& arr) {
        int ans = 0;
        for(int i = 0; i < arr.size(); i++){
            int currSum = 0;
            for(int j = i; j < arr.size(); j+=2){
                for(int k = i; k <= j; k++)
                    ans+=arr[k];
            }
        }
        return ans;
    }
};