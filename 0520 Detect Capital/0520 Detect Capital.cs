public class Solution {
    public bool DetectCapitalUse(string word) {
        if(Char.IsUpper(word[0])){
            bool isTitle = true;
            for(int i = 1; i < word.Length; i++){
                if(!Char.IsLower(word[i])){
                    isTitle = false;
                    break;
                }
            }
            if(isTitle)
                return true;
        }
        bool capitol = true, lowercase = true;
        for(int i = 0; i < word.Length; i++){
            if(!Char.IsUpper(word[i]))
                capitol = false;
            
            if(!Char.IsLower(word[i]))
                lowercase = false;
            
            if(!capitol && !lowercase)
                break;
        }
        return capitol || lowercase;
    }
}