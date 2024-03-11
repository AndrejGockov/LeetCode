class Solution {
public:
    int secondHighest(string s) {
        vector<int>digits;
        int j = 0;
        for(char i : s){
            if(isdigit(i)){
                digits.push_back((int)i - '0');
                cout<<digits[j]<<" ";
                j++;
            }
        }
        
        if(digits.size() <= 1)
            return -1;
        
        int largest = -1, secondLargest = -1;

        for(int i = 0; i < digits.size(); i++){
            largest = max(largest, digits[i]);
        }

        for(int i = 0; i < digits.size(); i++){
            if(digits[i] > secondLargest && digits[i] < largest){
                secondLargest = digits[i];
            }
        }

        return secondLargest;
    }
};