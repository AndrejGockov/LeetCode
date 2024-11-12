import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char i : s.toCharArray()){
            if(i == '[' || i == '{' || i == '('){
                stack.push(i);
                continue;
            }

            if(stack.isEmpty())
                return false;
            char top = stack.pop();
            if((top != '[' && i == ']') ||
                (top != '{' && i == '}') ||
                (top != '(' && i == ')')){
                return false;
                }
        }

        return stack.isEmpty();
    }
}