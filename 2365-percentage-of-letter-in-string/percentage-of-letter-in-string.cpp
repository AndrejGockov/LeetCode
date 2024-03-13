class Solution {
public:
    int percentageLetter(string s, char letter) {
        float ans = 0;
        for(char i : s){
            if(i == letter){
                ans++;
            }
        }
        ans = (ans * 100) / (float)s.size();
        return ans;
    }
};