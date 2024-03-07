class Solution {
public:
    int romanSwitch(char letter){
            switch(letter){
                case 'I':
                    return 1;
                case 'V':
                    return 5;
                case 'X':
                    return 10;
                case 'L':
                    return 50;
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M':
                    return 1000;
                default:
                    return 0;
            }
    }

    int romanToInt(string s) {
        int sum = 0;
        int previous = 0;
        int previousSum = 0;
    
        for(char character : s){
            int currentSum = romanSwitch(character);

            if(sum != 0 && previous < currentSum)
                previousSum += previous;
            
            sum+=currentSum;
            previous = currentSum;
        }
        sum -= (previousSum * 2);
        return sum;
    }
};