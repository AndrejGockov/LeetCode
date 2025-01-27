class Solution {
    public String removeStars(String s) {
        Stack<Character>stack = new Stack<>();
        String ans = "";
        for(char i : s.toCharArray()){
            if(i == '*' && ans != ""){
                ans = ans.substring(0, ans.length() - 1);
            }else{
                ans += i;
            }

            // if(i == '*' && !stack.isEmpty()){
            //     stack.pop();
            // }else{
            //     stack.push(i);
            // }
        }
        
        // System.out.println(stack);
        // String ans = "";
        // while(!stack.isEmpty()){
        //     ans = stack.pop() + ans;
        // }
        
        return ans;
    }
}