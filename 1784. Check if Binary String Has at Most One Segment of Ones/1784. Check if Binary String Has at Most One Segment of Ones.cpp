class Solution {
public:
    bool checkOnesSegment(string s){
        if(s.size() == 1)
            return stoi(s);

        bool consecutive = false, gap = false;
        for(int i = 0; i < s.size(); i++){
            if(s[i] == '1'){
                consecutive = true;
            }else if(s[i] == '0' && consecutive){
                gap = true;
            }

            if(s[i] == '1' && gap)
                return false;
        }
        return true;
    }
};