public class Solution {
    public int MyAtoi(string s) {
        String number = "";
        char sign = 'a';
        
        foreach(char i in s){
            if(i == ' ' && number == "" && sign == 'a'){
                continue;
            }

            if((i == '-' || i == '+') && sign == 'a' && number == ""){
                sign = i;
                continue;
            }

            if(char.IsNumber(i)){
                number += i;
                continue;
            }

            if(!char.IsNumber(i)){
                break;
            }
        }

        if(number == "")
            return 0;

        if(int.TryParse(number, out int ans)){
            if(ans > int.MaxValue)
                ans = int.MaxValue;

            if(sign == '-')
                ans *= (-1);
            
            return ans;
        }

        int overflowAns = int.MaxValue;

        if(sign == '-')
            overflowAns = int.MinValue;

        return overflowAns;
    }
}