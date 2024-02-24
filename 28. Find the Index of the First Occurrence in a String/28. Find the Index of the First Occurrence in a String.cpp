class Solution {
public:
    int strStr(string haystack, string needle) {
        for(int i = 0; i < haystack.length(); i++){
            string checker = "";
            for(int j = i; j < haystack.length(); j++){
                checker += haystack[j];
                if(checker == needle)
                    return i;
            }
        }

        return -1;
    }
};