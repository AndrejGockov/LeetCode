class Solution {
public:
    int prefixCount(vector<string>& words, string pref) {
        int res = 0;

        for(int i = 0; i < words.size(); i++){
            bool found = true;
            for(int j = 0; j < pref.size(); j++){
                if(pref[j] != words[i][j]){
                    found = false;
                    break;
                }
            }

            if(found)
                res++;
        }
        return res;
    }
};