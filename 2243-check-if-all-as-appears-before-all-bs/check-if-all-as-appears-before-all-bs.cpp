class Solution {
public:
    bool checkString(string s) {
        for(int i = 0; i < s.size() - 1; i++){
            if(s[i] == 'b'){
                while(i < s.size()){
                    if(s[i++] == 'a'){
                        return false;
                    }
                }
            }
        }
        return true;
    }
};