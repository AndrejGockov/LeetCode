public class Solution {
    public int MaxPower(string s) {
        int consecutive = 1, ans = 1;
        for (int i = 0; i < s.Length - 1; i++){
            if(s[i] == s[i + 1]){
                consecutive++;
                continue;
            }
            ans = Math.Max(consecutive, ans);
            consecutive = 1;
        }
        ans = Math.Max(consecutive, ans);
        return ans;
    }
}