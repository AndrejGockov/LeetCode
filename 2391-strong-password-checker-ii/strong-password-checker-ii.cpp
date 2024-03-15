class Solution {
public:
    bool strongPasswordCheckerII(string password) {
        if (password.length() < 8)
            return false;
        for(int i = 0; i < password.size() - 1; i++)
            if(password[i] == password[i + 1])
                return false;
        
        bool digit = false;
        bool upper = false, lower = false;
        bool special = false;

        for(char i : password){
            if(isupper(i))
                upper = true;
            else if(islower(i))
                lower = true;
            else if(isdigit(i))
                digit = true;
            else
                special = true;
        }

        return digit && upper && lower && special;
    }
};