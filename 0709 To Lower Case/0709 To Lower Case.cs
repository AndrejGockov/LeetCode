public class Solution {
    public string ToLowerCase(string s) {
        string ans = "";
        for(int i = 0; i < s.Length; i++){
            if((int)s[i] < (int)'a'){
                ans += Char.ToLower(s[i]);
                continue;
            }
            ans += s[i];
        }
        return ans;
    }
}