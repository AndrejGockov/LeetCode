class Solution {
    public int minLength(String s) {
        Stack<Character>stack = new Stack<>();

        for(char i : s.toCharArray()){
            if(!stack.isEmpty() 
            && ((stack.peek() == 'A' && i == 'B') 
            || (stack.peek() == 'C' && i == 'D'))){
                stack.pop();
                continue;
            }
        
            stack.push(i);
        }
        return stack.size();
    }
}