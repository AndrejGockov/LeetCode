class Solution {
    public boolean checkValidString(String s) {
        int balancer = 0;

        for(char i : s.toCharArray()){
            if(i == '(' || i == '*')
                balancer++;
            else if(i == ')')
                balancer--;
            
            if(balancer < 0)
                return false;
        }

        balancer = 0;

        for(int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if(c == ')' || c == '*')
                balancer++;
            else if(c == '(')
                balancer--;
            
            if(balancer < 0)
                return false;
        }
        
        return true;
    }
}