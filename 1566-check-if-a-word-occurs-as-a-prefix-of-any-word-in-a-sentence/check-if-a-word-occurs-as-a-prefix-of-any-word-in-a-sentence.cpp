class Solution {
public:
    int isPrefixOfWord(string sentence, string searchWord) {
        int indx = 1;
        int start = 0;
        for(int i = 0; i <= sentence.size(); i++){
            if(sentence[i] == ' ' || i == sentence.size()){
                string pref = sentence.substr(start, searchWord.size());
                if(searchWord == pref)
                    return indx;
                
                start = i + 1;
                indx++;
            }
        }
        return -1;
    }
};