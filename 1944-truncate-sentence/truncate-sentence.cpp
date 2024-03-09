class Solution {
public:
    string truncateSentence(string s, int k) {
       string ans = "", currentWord = "";
       vector<string> words;
       for(int i = 0; i < s.size(); i++){
           if(s[i] != ' '){
               currentWord+=s[i];
           }else{
               cout<<currentWord<<endl;
               words.push_back(currentWord);
               currentWord="";
           }
       }
       words.push_back(currentWord);
       for(int i = 0; i < words.size(); i++){
           ans+=words[i];
           if(k != 1)
                ans+=" ";
           k--;
           if(k == 0){
               break;
           }
       }
       return ans;
    }
};