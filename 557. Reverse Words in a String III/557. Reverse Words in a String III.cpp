class Solution {
public:
    string reverseWords(string s) {
        string currentWord = "", newS = "";
        for(int i = 0; i < s.size(); i++){
            // Checks if the words ended or if it's the last word in the string
            if(s[i] == ' ' || i == s.size() - 1){
                // Adds last character
                if(i == s.size() - 1)
                    currentWord += s[i];
                reverse(currentWord.begin(), currentWord.end());
                newS += currentWord + " ";
                currentWord = "";
                continue;
            }
            currentWord += s[i];
        }
        // Deletes the empty space at the end of the string
        newS.pop_back();
        return newS;
    }
};