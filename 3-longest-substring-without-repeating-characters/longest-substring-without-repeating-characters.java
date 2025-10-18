class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0)
            return 0;

        int ans = 0;
        int n = s.length();
        String currentString = String.valueOf(s.charAt(0));

        for(int i = 1; i < n; i++){
            int j = i;
            while(j < n && !currentString.contains(String.valueOf(s.charAt(j)))){
                currentString += s.charAt(j);
                j++;
            }

            ans = Math.max(ans, currentString.length());

            if(j == n)
                break;
            
            currentString = String.valueOf(s.charAt(i));
        }

        return Math.max(ans, currentString.length());
    }
}