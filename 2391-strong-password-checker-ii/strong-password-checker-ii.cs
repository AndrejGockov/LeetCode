public class Solution {
    public bool StrongPasswordCheckerII(string password) {
        if (password.Length < 8)
            return false;
        for(int i = 0; i < password.Length - 1; i++)
            if(password[i] == password[i + 1])
                return false;
        
        bool digit = false;
        bool upper = false, lower = false;
        bool special = false;

        foreach(char i in password){
            if(Char.IsUpper(i))
                upper = true;
            else if(Char.IsLower(i))
                lower = true;
            else if(Char.IsDigit(i))
                digit = true;
            else
                special = true;
        }

        return digit && upper && lower && special;
    }
}