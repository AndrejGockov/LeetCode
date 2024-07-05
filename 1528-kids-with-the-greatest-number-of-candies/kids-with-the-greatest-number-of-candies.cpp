class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        vector<bool>ans;
        for(int i = 0; i < candies.size(); i++){
            int currGreatest = *max_element(candies.begin(), candies.end());
            ans.push_back((candies[i] + extraCandies) >= currGreatest);
        }
        return ans;
    }
};