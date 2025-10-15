class Solution {
    public int countKeyChanges(String s) {
        int ans = 0;
        int n = s.length();
        s = s.toLowerCase();
        char lastCharacter = s.charAt(0);

        
        for(int i = 1; i < n; i++){
            if(s.charAt(i) != lastCharacter)
                ans++;
            lastCharacter = s.charAt(i);
        }

        return ans;
    }
}