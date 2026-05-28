public class Solution {
    public int CountConsistentStrings(string allowed, string[] words) {
        int ans = 0;
        bool isConsistent;

        foreach(string word in words){
            isConsistent = true;
            
            foreach(char ch in word){
                if(!allowed.Contains(ch)){
                    isConsistent = false;
                    break;
                }
            }

            if(isConsistent){
                ans++;
            }
        }

        return ans;
    }
}