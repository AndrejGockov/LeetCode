class Solution {
public:
    int countPrefixes(vector<string>& words, string s) {
        int ans = 0;
        for(int i = 0; i < words.size(); i++){
            if(words[i].size() > s.size())
                continue;
            bool found = true;
            for(int j = 0; j < s.size(); j++){
                if(j == words[i].size())
                    break;
                if(words[i][j] != s[j]){
                    found = false;
                    break;
                }
            }

            if(found)
                ans++;
        }
        return ans;
    }
};