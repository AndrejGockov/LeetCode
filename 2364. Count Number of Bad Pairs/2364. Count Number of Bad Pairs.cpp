class Solution {
public:
    long long countBadPairs(vector<int>& nums) {
        long long n = nums.size();
        unordered_map<long long, long long> map;
        for(int i = 0; i < n; i++){
            int val = i - nums[i];
            map[val]++;
        }
        long long total = (n*(n - 1)) / 2 , goodPair = 0;
        for(auto x : map){
            if(x.second > 1){
                goodPair +=  (x.second*(x.second-1))/2;
            }
        }
        long long ans = total - goodPair;
        return ans;
    }
};