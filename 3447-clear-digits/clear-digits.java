class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();

        for(char i : s.toCharArray()){
            if(!stack.isEmpty() && Character.isDigit(i)){
                stack.pop();
                continue;
            }

            stack.push(i);
        }
        
        // System.out.println(stack);
        String ans = "";
        while(!stack.isEmpty()){
            ans = stack.peek() + ans;
            stack.pop();
        }

        return ans;
    }
}