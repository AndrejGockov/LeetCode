public class Solution {
    public int CountHomogenous(string s) {
        int counter = 0, consecutive = 1;
        for (int i = 1; i <= s.Length; i++) {
            if(i < s.Length && s[i] == s[i - 1]){
                consecutive++;
            }else{
                counter = (int)((counter + (long)consecutive * (consecutive + 1) / 2) % 1000000007);
                consecutive = 1;
            }
        }
        return counter;
    }
}