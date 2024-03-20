class Solution {
public:
    string sortSentence(string s) {
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

        string sortedWords[words.size()];

        for(int i = 0; i < words.size(); i++){
            int position = 1;
            for(char j : words[i]){
               if(isdigit(j)){
                    position = (int)j - (int)'0';
                    cout<<position<<" ";
                    sortedWords[position - 1] = words[i];
                    break;
               }
            }
        }
        
        string ans = "";

        for(int i = 0; i < words.size(); i++){
            ans += sortedWords[i];
            ans.erase(ans.size() - 1, 1);
            if(i != words.size() - 1)
                ans+= " ";
        }
        
        return ans;
    }
};