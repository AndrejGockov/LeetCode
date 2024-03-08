class Solution {
public:
    int titleToNumber(string columnTitle) {
        int ans = 0;
        for(char i = columnTitle.size() - 1, j = 0; i >= 0; i--, j++ ){
            ans += ((int)columnTitle[i] - (int)'A' + 1) * pow(26, j);
        }
        return ans;
    }
};