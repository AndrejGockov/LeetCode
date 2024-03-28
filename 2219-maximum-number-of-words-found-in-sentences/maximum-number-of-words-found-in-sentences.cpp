class Solution {
public:
    int mostWordsFound(vector<string>& sentences) {
        int ans = 0;

        for(int i = 0; i < sentences.size(); i++){
            int current = 1;

            for(int j = 0; j < sentences[i].size(); j++){
                if(!isalpha(sentences[i][j]))
                    current++;
            }

            if(ans < current)
                ans = current;
        }

        return ans;
    }
};