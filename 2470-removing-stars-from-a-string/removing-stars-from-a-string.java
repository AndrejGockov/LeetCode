class Solution {
    public String removeStars(String s) {
        String ans = "";

        for(char i : s.toCharArray()){
            if(i == '*' && ans != "")
                ans = ans.substring(0, ans.length() - 1);
            else
                ans += i;
        }
        return ans;
    }
}