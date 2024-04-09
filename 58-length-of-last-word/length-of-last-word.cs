public class Solution {
    public int LengthOfLastWord(string s) {
        int wordLength = 0;
        for(int i = s.Length - 1; i >= 0; i--){
            if(Char.IsLetter(s[i])){
                while(i >= 0 && Char.IsLetter(s[i])){
                    wordLength++;
                    i--;
                }
                return wordLength;
            }
        }
        return wordLength;
    }
}