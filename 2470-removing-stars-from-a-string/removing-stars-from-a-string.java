class Solution {
    public String removeStars(String s) {
        Stack<Character>stack = new Stack<>();

        for(char i : s.toCharArray()){
            if(i == '*' && !stack.isEmpty()){
                stack.pop();
            }else{
                stack.push(i);
            }
        }
        
        System.out.println(stack);
        String ans = "";
        while(!stack.isEmpty()){
            ans = stack.pop() + ans;
        }
        
        return ans;
    }
}