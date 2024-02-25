class Solution {
public:
    bool checkZeroOnes(string s) {
        if(s.size() == 1)
            return stoi(s);
        int consecutiveOnes = 1, maxOnes = 1;
        int consecutiveTwos = 1, maxTwos = 1;
        for (int i = 0; i < s.size(); i++){
            if(s[i] == '1' && s[i] == s[i + 1]){
                consecutiveOnes++;
                continue;
            }else{
                maxOnes = max(consecutiveOnes, maxOnes);
                consecutiveOnes = 1;
            }

            if(s[i] == '0' && s[i] == s[i + 1]){
                consecutiveTwos++;
            }else{
                maxTwos = max(consecutiveTwos, maxTwos);
                consecutiveTwos = 1;
            }
        }
        return maxOnes > maxTwos;
    }
};