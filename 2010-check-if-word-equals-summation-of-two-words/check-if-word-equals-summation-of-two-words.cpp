class Solution {
public:
    bool isSumEqual(string firstWord, string secondWord, string targetWord) {
        int words = wordSum(firstWord) + wordSum(secondWord);
        int targetSum = wordSum(targetWord);

        return (words == targetSum);
    }

    int wordSum(string word){
        int sum = 0;
        for(int i = 0; i < word.size(); i++){
            int nextDigit = int(word[i]) - int('a');
            sum = sum * 10 + nextDigit;
        }
        return sum;
    }
};