class Solution {
public:
    int countSegments(string s){
        int n = 0;
        string word = "";
        for(char i : s){
            if(i == ' ' && word != ""){
                n++;
                word = "";
            }
            if(i != ' ')
                word+=i;
        }
        if((n == 0 && s.find(' ') && s != "")
        || word != "")
            n++;
        return n;
    }
};