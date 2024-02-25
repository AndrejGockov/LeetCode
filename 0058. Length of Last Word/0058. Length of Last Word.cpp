class Solution {
public:
    int lengthOfLastWord(string s) {
        int wordLength = 0;
        for(int i = s.size(); i >= 0; i--){
            if(isalpha(s[i])){
                while(i >= 0 && isalpha(s[i])){
                    wordLength++;
                    i--;
                }
                return wordLength;
            }
        }
        return wordLength;
    }
};