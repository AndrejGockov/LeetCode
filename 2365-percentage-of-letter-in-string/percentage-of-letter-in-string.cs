public class Solution {
    public int PercentageLetter(string s, char letter) {
        int ans = 0;
        foreach(char i in s){
            if(i == letter){
                ans++;
            }
        }
        ans = (ans * 100) / s.Length;
        return ans;
    }
}