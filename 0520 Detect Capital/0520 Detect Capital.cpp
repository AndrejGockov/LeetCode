class Solution {
public:
    bool detectCapitalUse(string word){
        // Checks if the first character is uppercase
        if(isupper(word[0])){
            // If it is, it will go through the rest of the string
            // If there is another uppercase character the loop will end and it won't return true here
            bool isTitle = true;
            for(int i = 1; i < word.size(); i++){
                if(!islower(word[i])){
                    isTitle = false;
                    break;
                }
            }
            if(isTitle)
                return true;
        }
        // Goes through the string from start to finish checking if every character is either uppercase or lowercase
        bool capitol = true, lowercase = true;
        for(int i = 0; i < word.size(); i++){
            if(!isupper(word[i]))
                capitol = false;
            
            if(!islower(word[i]))
                lowercase = false;
            
            if(!capitol && !lowercase)
                break;
        }
        // It will return depending on if either is true
        return capitol || lowercase;
    }
};