class Solution {
public:
    vector<int> diStringMatch(string s) {
        int I = 0;
        int D = s.length();
        vector<int>ans;
        
        for(int i = 0; i < s.size(); i++){
            if(s[i] == 'I'){
                ans.push_back(I);
                I++;
            }else if(s[i] == 'D'){
                ans.push_back(D);
                D--;
            }
        }

        if(s[s.size()] == 'I')
            ans.push_back(I);
        else
            ans.push_back(D);

        return ans;
    }
};