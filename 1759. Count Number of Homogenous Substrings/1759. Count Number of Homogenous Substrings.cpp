class Solution {
public:
    int countHomogenous(string s) {
        long long counter = 0;
        int start = 0;
        for (int i = 0; i < s.size(); i++) {
            if (s[i] != s[start]) {
                int j = i - start;
                while (j > 0){
                    counter += j;
                    j--;
                }
                start = i;
            }
        }

        int j = s.size() - start;
        while(j > 0){
            counter += j;
            j--;
        }

        return counter % 1000000007;
    }
};