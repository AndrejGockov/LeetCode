class Solution {
public:
    string reversePrefix(string word, char ch) {
        int index = -1;
        for(int i = 0; i < word.size(); i++){
            if(word[i] == ch){
                index = i + 1;
                break;
            }
        }

        if(index == -1)
            return word;

        for(int i = 0; i < index / 2; i++)
            swap(word[i], word[index - i - 1]);

        return word;
    }
};