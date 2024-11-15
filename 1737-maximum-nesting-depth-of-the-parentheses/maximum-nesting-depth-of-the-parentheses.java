class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        int currDepth = 0;
        Stack<Character> stack = new Stack<>();

        for(char i : s.toCharArray()){
            if(currDepth > ans)
                ans = currDepth;

            if(i == '('){
                stack.push(i);
                currDepth++;
            }

            if(i == ')' && !stack.isEmpty()){
                stack.pop();
                currDepth--;
            }

            if(stack.isEmpty())
                currDepth = 0;
        }

        return ans;
    }
}