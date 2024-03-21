public class Solution {
    public bool CheckString(string s) {
        for(int i = 0; i < s.Length - 1; i++){
            if(s[i] == 'b'){
                while(i < s.Length){
                    if(s[i++] == 'a'){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}