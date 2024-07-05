class Solution {
public:
    int countPrefixes(vector<string>& words, string s) {
        int ans = 0;

        for(int i = 0; i < words.size(); i++){
            // If the current prefix is longer than the word it skips the current word
            if(words[i].size() > s.size())
                continue;

            // Checks every character in the current prefix
            bool found = true;
            for(int j = 0; j < words[i].size(); j++){
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