class Solution {
public:
    string capitalizeTitle(string title) {
        string currentWord = "", ans = "";
        for(char character : title){
            if(character == ' '){
                if(currentWord.size() < 3){
                    for(int i = 0; i < currentWord.size(); i++){
                        currentWord[i] = tolower(currentWord[i]);
                    }
                }
                currentWord += character;
                ans += currentWord;
                currentWord = "";
                continue;
            }else if(isalpha(character) && currentWord.size() == 0){
                currentWord += toupper(character);
                continue;
            }
            
            currentWord += tolower(character);
        }

        if(currentWord.size() < 3){
                    for(int i = 0; i < currentWord.size(); i++){
                        currentWord[i] = tolower(currentWord[i]);
                    }
                }
        ans += currentWord;
        return ans;
    }
};