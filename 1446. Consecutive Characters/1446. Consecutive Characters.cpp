class Solution {
public:
    int maxPower(string s) {
        int consecutive = 1, ans = 1;
        for (int i = 0; i < s.size(); i++){
            if(s[i] == s[i + 1]){
                consecutive++;
                continue;
            }
            ans = max(consecutive, ans);
            consecutive = 1;
        }
        return ans;
    }
};