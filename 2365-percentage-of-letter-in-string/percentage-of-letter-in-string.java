class Solution {
    public int percentageLetter(String s, char letter) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == letter){
                ans++;
            }
        }
        ans = (ans * 100) /  s.length();
        return ans;
    }
}