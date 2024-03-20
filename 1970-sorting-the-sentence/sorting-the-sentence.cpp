class Solution {
public:
    string sortSentence(string s) {
        // Separates all of the words into a vector
        vector<string> words;
        string currentWord = "";
        for(int i = 0; i < s.size(); i++){
            if(s[i] != ' '){
                currentWord += s[i];
            }else{
                words.push_back(currentWord);
                currentWord = "";
            }
        }
        if(currentWord != "")
            words.push_back(currentWord);

        // Array where we'll place the words in correct order
        string sortedWords[words.size()];

        // Iterates through the words vector
        for(int i = 0; i < words.size(); i++){
            int position = 1;
            // Iterates through the current word until it finds the number in that string
            for(char j : words[i]){
               if(isdigit(j)){
                    position = (int)j - (int)'0';
                    // Places the string in the appropriate location in the new string
                    sortedWords[position - 1] = words[i];
                    break;
               }
            }
        }
        
        // Inserts the words in the correct order into ans
        string ans = "";
        for(int i = 0; i < words.size(); i++){
            ans += sortedWords[i];
            // Deletes the number from the string
            ans.erase(ans.size() - 1, 1);
            // If it isn't the last word in the sentence, it will add a whitespace to separate the words
            if(i != words.size() - 1)
                ans+= " ";
        }
        
        return ans;
    }
};