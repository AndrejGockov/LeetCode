class Solution {
public:
    bool isPalindrome(string s) {
        // Adds every number and digit to newS
        string newS = "";
        for(char character : s){
            if(isalpha(character) || isdigit(character)){
            character = tolower(character);
            newS+=character;
            }
        }

        // Checks if every character is the same from the front to the end
        for(int i = 1; i <= newS.length() / 2; i++){
            if(newS[i - 1] != newS[newS.length() - i])
                return false;
        }

        return true;
    }
};