public class Solution {
    public bool CheckOnesSegment(string s) {
        if(s.Length == 1 && s == "1")
            return true;

        bool consecutive = false, gap = false;
        for(int i = 0; i < s.Length; i++){
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
}