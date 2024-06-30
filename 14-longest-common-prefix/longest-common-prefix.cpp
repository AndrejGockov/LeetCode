class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        sort(strs.begin(), strs.end());
        string ans = "";
        
        for(int i = 0; i < strs[0].size(); i++){
            int j = strs.size() - 1;
            if(strs[0][i] == strs[j][i])
                ans+=strs[0][i];
            else
                break;
            j--;
        }

        return ans;
    }
};