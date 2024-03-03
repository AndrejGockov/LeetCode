class Solution {
public:
    bool arrayStringsAreEqual(vector<string>& word1, vector<string>& word2) {
        string strOne = "", strTwo = "";
        for(string i : word1){
            strOne += i;
        }
        for(string i : word2){
            strTwo += i;
        }
        return (strOne == strTwo);
    }
};